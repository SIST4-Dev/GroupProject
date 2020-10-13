--1 id,pw를 알고있을 때 member 테이블에서 해당 데이터가 있으면 해당 데이터의 이름을 출력
SELECT MEMBER_NAME
FROM member
WHERE MEMBER_ID = 'admin' AND MEMBER_PW = '1234!';
-- member 테이블에 MEMBER_ID와 MEMBER_PW가 저장된 것으로 로그인하면 로그인이 성공하는 쿼리문


--2 여행상품 전체 (상세정보 제외)정보를 보는 쿼리 
SELECT PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT
FROM PRODUCT;
-- PRODUCT 테이블에서 PRODUCT_EXP 컬럼명을 제외한 모든 데이터를 출력하는 쿼리문


--3 상품번호를 알고있을 때 해당상품의 전체(상세정보 포함)정보를 보는 쿼리
SELECT *
FROM PRODUCT
WHERE PRODUCT_NUM = 2;
-- PRODUCT 테이블에 저장되어 있는 PRODUCT_NUM를 입력시 PRODUCT 테이블의 전체 데이터를 출력하는 쿼리문


--4 지역이름을 알고있을 때 해당상품의 전체(상세정보 제외)정보를 보는 쿼리
SELECT PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT
FROM PRODUCT
WHERE PRODUCT_LOC = '경상도';
-- PRODUCT 테이블에 저장되어 있는 PRODUCT_LOC를 입력시 PRODUCT_EXP 컬럼명을 제외한 모든 데이터를 출력하는 쿼리문 


--5 상품번호를 알고 있을때, Cart 테이블에 데이터를 추가하는 쿼리
INSERT INTO CART (CART_NUM, PRODUCT_NUM, MEMBER_ID)
SELECT *
FROM CART
WHERE PRODUCT_NUM =10;
-- PRODUCT 테이블의 저장되어 있는 PRODUCT_NUM을 입력시 CART 테이블에 (CART_NUM, PRODUCT_NUM, MEMBER_ID) 데이터를 삽입하는 쿼리문


-- 6 Cart 테이블의 키를 이용해 Product 테이블과 조인해서, 장바구니에 담긴 상품의 전체(상세정보 제외) 정보를 보는 쿼리
INSERT INTO cart(cart_num, product_num, member_id)
VALUES(cart_num_seq.nextval, 2, 'test1');

SELECT PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT
FROM CART NATURAL JOIN PRODUCT;
-- NATURAL JOIN을 이용해 CART 테이블과 PRODUCT 테이블에 있는 이름과 자료형이 같은 열을 찾아서
-- 그 열을 기준으로 장바구니에 담긴 PRODUCT_EXP를 제외한 전체 데이터를 출력하는 쿼리문


-- 7 여행상품 추가
INSERT INTO PRODUCT (PRODUCT_NUM, PRODUCT_LOC, PRODUCT_COST, CHECKIN, CHECKOUT, PRODUCT_EXP)
VALUES (150, '경기도', 99000, '18/01/01', '18/12/12', '충남 아산시');
-- PRODUCT 테이블에 6개의 데이터를 추가하는 쿼리문


-- 8 여행상품 수정
UPDATE PRODUCT 
SET PRODUCT_LOC = 'SEOUL', PRODUCT_COST = 99999, CHECKIN = '10/10/10', CHECKOUT = '10/12/12', PRODUCT_EXP = '충청남도 아산시';
-- PRODUCT 테이블에 6개의 데이터를 수정하는 쿼리문


-- 9 여행상품 삭제
DELETE FROM PRODUCT
WHERE PRODUCT_NUM = 10;
-- PRODUCT 테이블의 PRODUCT_NUM에 일치하는 데이터를 삭제하는 쿼리문 