INSERT INTO cart(cart_num, product_num, member_id)
VALUES(cart_num_seq.nextval, 2, 'test1');
INSERT INTO cart(cart_num, product_num, member_id)
VALUES(cart_num_seq.nextval, 89, 'test1');

COMMIT;