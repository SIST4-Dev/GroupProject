Rem Date : 
Rem Author : KIM HEE JIN
Rem Objective : 1002_2조팀플
Rem Environment : Windows 10, Oracle SQL Developer, Oracle Database 11g  Enterprise Edition

--2조팀프로젝트계정 생성 및 권한 부여

--DROP USER team2; --계정만 삭제시
--DROP USER team2 CASCADE; --계정 및 객체 모두 삭제시
CREATE USER team2
IDENTIFIED BY team2
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP;

GRANT RESOURCE, CONNECT, CREATE SESSION, CREATE TABLE TO team2;

ALTER USER team2 QUOTA 30M ON USERS;

COMMIT;

--------------------ETC---------------------
--SELECT * FROM Product ;--전체상품조회
--SELECT * FROM Product WHERE checkin >= '2020-11-10' AND checkin <= '2020-11-20'; --체크인날짜가 20/11/10 ~ 20/11/20 인 상품조회
--SELECT * FROM Product WHERE product_cost <= 200000; --여행상품금액이 20만원 이하인 상품조회
--SELECT * FROM Product WHERE product_exp LIKE '%강남구%';--상품설명에 '강남구'가 포함되는 상품조회
--SELECT * FROM Product WHERE checkin LIKE '20/10%';--체크인날짜가 '2020-10-dd'인 상품조회

-------------------ERROR---------------------