Rem Date : 
Rem Author : KIM HEE JIN
Rem Objective : 1001_2������
Rem Environment : Windows 10, Oracle SQL Developer, Oracle Database 11g  Enterprise Edition

--team2�������� �α����� TABLE����
/* �����ǰ */
--DROP TABLE Product;
CREATE TABLE team2.Product (
	product_num NUMBER(8) NOT NULL, /* ��ǰ��ȣ */
	product_loc VARCHAR2(20) NOT NULL, /* ���� */
	product_cost NUMBER(30) NOT NULL, /* �ݾ� */
	checkin DATE NOT NULL, /* üũ�� */
	checkout DATE NOT NULL, /* üũ�ƿ� */
	product_exp VARCHAR2(180) DEFAULT '<<�Է¾���>>' /* ��ǰ���� */
);

COMMENT ON TABLE team2.Product IS '�����ǰ';
COMMENT ON COLUMN team2.Product.product_num IS '��ǰ��ȣ';
COMMENT ON COLUMN team2.Product.product_loc IS '����';
COMMENT ON COLUMN team2.Product.product_cost IS '�ݾ�';
COMMENT ON COLUMN team2.Product.checkin IS 'üũ��';
COMMENT ON COLUMN team2.Product.checkout IS 'üũ�ƿ�';
COMMENT ON COLUMN team2.Product.product_exp IS '��ǰ����';

--SEQUENCE����
--DROP SEQUENCE product_num_seq;
CREATE SEQUENCE product_num_seq increment by 1 start with 0 minvalue 0 nocache nocycle;

CREATE UNIQUE INDEX team2.PK_Product
	ON team2.Product (
		product_num ASC
	);

ALTER TABLE team2.Product
	ADD
		CONSTRAINT PK_Product
		PRIMARY KEY (
			product_num
		);
        
--Product table �����͸� ����
--TRUNCATE TABLE Product; 

/* ȸ�� */
--DROP TABLE Member;
CREATE TABLE team2.Member (
	member_id VARCHAR2(20) NOT NULL, /* ���̵� */
	member_pw VARCHAR2(10) NOT NULL, /* �н����� */
	member_name VARCHAR2(20) NOT NULL /* ȸ���̸� */
);

COMMENT ON TABLE team2.Member IS 'ȸ��';
COMMENT ON COLUMN team2.Member.member_id IS '���̵�';
COMMENT ON COLUMN team2.Member.member_pw IS '�н�����';
COMMENT ON COLUMN team2.Member.member_name IS 'ȸ���̸�';

CREATE UNIQUE INDEX team2.PK_Member
	ON team2.Member (
		member_id ASC
	);
    
ALTER TABLE team2.Member
	ADD
		CONSTRAINT PK_Member
		PRIMARY KEY (
			member_id
		);
 
 --�����ڰ���/ �׽�Ʈȸ������ INSERT       
INSERT INTO Member VALUES('admin', '1234!', '��ö��');
INSERT INTO Member VALUES('test1', 'test1', '�̿���');

/* ��ٱ��� */
--DROP TABLE Cart;
CREATE TABLE team2.Cart (
	cart_num NUMBER(8) NOT NULL, /* ��ٱ��Ϲ�ȣ */
	product_num NUMBER(8), /* ��ǰ��ȣ */
	member_id VARCHAR2(20) /* ���̵� */
);

COMMENT ON TABLE team2.Cart IS '��ٱ���';
COMMENT ON COLUMN team2.Cart.cart_num IS '��ٱ��Ϲ�ȣ';
COMMENT ON COLUMN team2.Cart.product_num IS '��ǰ��ȣ';
COMMENT ON COLUMN team2.Cart.member_id IS '���̵�';

--SEQUENCE����
--DROP SEQUENCE cart_num_seq;
CREATE SEQUENCE cart_num_seq increment by 1 start with 0 minvalue 0 nocache nocycle;

CREATE UNIQUE INDEX team2.PK_Cart
	ON team2.Cart (
		cart_num ASC
	);

ALTER TABLE team2.Cart
	ADD
		CONSTRAINT PK_Cart
		PRIMARY KEY (
			cart_num
		);

ALTER TABLE team2.Cart
	ADD
		CONSTRAINT FK_Product_TO_Cart
		FOREIGN KEY (
			product_num
		)
		REFERENCES team2.Product (
			product_num
		);

ALTER TABLE team2.Cart
	ADD
		CONSTRAINT FK_Member_TO_Cart
		FOREIGN KEY (
			member_id
		)
		REFERENCES team2.Member (
			member_id
		);


--------------------ETC----------------------
-------------------ERROR---------------------