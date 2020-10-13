Rem Date : 
Rem Author : KIM HEE JIN
Rem Objective : 1001_2조팀플
Rem Environment : Windows 10, Oracle SQL Developer, Oracle Database 11g  Enterprise Edition

--team2계정으로 로그인후 TABLE생성
/* 여행상품 */
--DROP TABLE Product;
CREATE TABLE team2.Product (
	product_num NUMBER(8) NOT NULL, /* 상품번호 */
	product_loc VARCHAR2(20) NOT NULL, /* 지역 */
	product_cost NUMBER(30) NOT NULL, /* 금액 */
	checkin DATE NOT NULL, /* 체크인 */
	checkout DATE NOT NULL, /* 체크아웃 */
	product_exp VARCHAR2(180) DEFAULT '<<입력없음>>' /* 상품설명 */
);

COMMENT ON TABLE team2.Product IS '여행상품';
COMMENT ON COLUMN team2.Product.product_num IS '상품번호';
COMMENT ON COLUMN team2.Product.product_loc IS '지역';
COMMENT ON COLUMN team2.Product.product_cost IS '금액';
COMMENT ON COLUMN team2.Product.checkin IS '체크인';
COMMENT ON COLUMN team2.Product.checkout IS '체크아웃';
COMMENT ON COLUMN team2.Product.product_exp IS '상품설명';

--SEQUENCE생성
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
        
--Product table 데이터만 삭제
--TRUNCATE TABLE Product; 

/* 회원 */
--DROP TABLE Member;
CREATE TABLE team2.Member (
	member_id VARCHAR2(20) NOT NULL, /* 아이디 */
	member_pw VARCHAR2(10) NOT NULL, /* 패스워드 */
	member_name VARCHAR2(20) NOT NULL /* 회원이름 */
);

COMMENT ON TABLE team2.Member IS '회원';
COMMENT ON COLUMN team2.Member.member_id IS '아이디';
COMMENT ON COLUMN team2.Member.member_pw IS '패스워드';
COMMENT ON COLUMN team2.Member.member_name IS '회원이름';

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
 
 --관리자계정/ 테스트회원계정 INSERT       
INSERT INTO Member VALUES('admin', '1234!', '김철수');
INSERT INTO Member VALUES('test1', 'test1', '이영희');

/* 장바구니 */
--DROP TABLE Cart;
CREATE TABLE team2.Cart (
	cart_num NUMBER(8) NOT NULL, /* 장바구니번호 */
	product_num NUMBER(8), /* 상품번호 */
	member_id VARCHAR2(20) /* 아이디 */
);

COMMENT ON TABLE team2.Cart IS '장바구니';
COMMENT ON COLUMN team2.Cart.cart_num IS '장바구니번호';
COMMENT ON COLUMN team2.Cart.product_num IS '상품번호';
COMMENT ON COLUMN team2.Cart.member_id IS '아이디';

--SEQUENCE생성
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