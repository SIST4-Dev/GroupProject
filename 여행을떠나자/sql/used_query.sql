--1 id,pw�� �˰����� �� member ���̺��� �ش� �����Ͱ� ������ �ش� �������� �̸��� ���
SELECT MEMBER_NAME
FROM member
WHERE MEMBER_ID = 'admin' AND MEMBER_PW = '1234!';
-- member ���̺� MEMBER_ID�� MEMBER_PW�� ����� ������ �α����ϸ� �α����� �����ϴ� ������


--2 �����ǰ ��ü (������ ����)������ ���� ���� 
SELECT PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT
FROM PRODUCT;
-- PRODUCT ���̺��� PRODUCT_EXP �÷����� ������ ��� �����͸� ����ϴ� ������


--3 ��ǰ��ȣ�� �˰����� �� �ش��ǰ�� ��ü(������ ����)������ ���� ����
SELECT *
FROM PRODUCT
WHERE PRODUCT_NUM = 2;
-- PRODUCT ���̺� ����Ǿ� �ִ� PRODUCT_NUM�� �Է½� PRODUCT ���̺��� ��ü �����͸� ����ϴ� ������


--4 �����̸��� �˰����� �� �ش��ǰ�� ��ü(������ ����)������ ���� ����
SELECT PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT
FROM PRODUCT
WHERE PRODUCT_LOC = '���';
-- PRODUCT ���̺� ����Ǿ� �ִ� PRODUCT_LOC�� �Է½� PRODUCT_EXP �÷����� ������ ��� �����͸� ����ϴ� ������ 


--5 ��ǰ��ȣ�� �˰� ������, Cart ���̺� �����͸� �߰��ϴ� ����
INSERT INTO CART (CART_NUM, PRODUCT_NUM, MEMBER_ID)
SELECT *
FROM CART
WHERE PRODUCT_NUM =10;
-- PRODUCT ���̺��� ����Ǿ� �ִ� PRODUCT_NUM�� �Է½� CART ���̺� (CART_NUM, PRODUCT_NUM, MEMBER_ID) �����͸� �����ϴ� ������


-- 6 Cart ���̺��� Ű�� �̿��� Product ���̺�� �����ؼ�, ��ٱ��Ͽ� ��� ��ǰ�� ��ü(������ ����) ������ ���� ����
INSERT INTO cart(cart_num, product_num, member_id)
VALUES(cart_num_seq.nextval, 2, 'test1');

SELECT PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT
FROM CART NATURAL JOIN PRODUCT;
-- NATURAL JOIN�� �̿��� CART ���̺�� PRODUCT ���̺� �ִ� �̸��� �ڷ����� ���� ���� ã�Ƽ�
-- �� ���� �������� ��ٱ��Ͽ� ��� PRODUCT_EXP�� ������ ��ü �����͸� ����ϴ� ������


-- 7 �����ǰ �߰�
INSERT INTO PRODUCT (PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT, PRODUCT_EXP)
VALUES (150, '��⵵', 99000, '18/01/01', '18/12/12', '�泲 �ƻ��');
-- PRODUCT ���̺� 6���� �����͸� �߰��ϴ� ������


-- 8 �����ǰ ����
UPDATE PRODUCT 
SET PRODUCT_LOC = 'SEOUL', PRODUCT_COST = 99999, CHECKIN = '10/10/10', CHECKOUT = '10/12/12', PRODUCT_EXP = '��û���� �ƻ��';
-- PRODUCT ���̺� 6���� �����͸� �����ϴ� ������


-- 9 �����ǰ ����
DELETE FROM PRODUCT
WHERE PRODUCT_NUM = 10;
-- PRODUCT ���̺��� PRODUCT_NUM�� ��ġ�ϴ� �����͸� �����ϴ� ������ 