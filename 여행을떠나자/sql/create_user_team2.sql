Rem Date : 
Rem Author : KIM HEE JIN
Rem Objective : 1002_2������
Rem Environment : Windows 10, Oracle SQL Developer, Oracle Database 11g  Enterprise Edition

--2����������Ʈ���� ���� �� ���� �ο�

--DROP USER team2; --������ ������
--DROP USER team2 CASCADE; --���� �� ��ü ��� ������
CREATE USER team2
IDENTIFIED BY team2
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP;

GRANT RESOURCE, CONNECT, CREATE SESSION, CREATE TABLE TO team2;

ALTER USER team2 QUOTA 30M ON USERS;

COMMIT;

--------------------ETC---------------------
--SELECT * FROM Product ;--��ü��ǰ��ȸ
--SELECT * FROM Product WHERE checkin >= '2020-11-10' AND checkin <= '2020-11-20'; --üũ�γ�¥�� 20/11/10 ~ 20/11/20 �� ��ǰ��ȸ
--SELECT * FROM Product WHERE product_cost <= 200000; --�����ǰ�ݾ��� 20���� ������ ��ǰ��ȸ
--SELECT * FROM Product WHERE product_exp LIKE '%������%';--��ǰ���� '������'�� ���ԵǴ� ��ǰ��ȸ
--SELECT * FROM Product WHERE checkin LIKE '20/10%';--üũ�γ�¥�� '2020-10-dd'�� ��ǰ��ȸ

-------------------ERROR---------------------