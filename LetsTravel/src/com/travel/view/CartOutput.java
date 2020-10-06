package com.travel.view;

import java.util.ArrayList;

import com.travel.service.*;
import com.travel.vo.*;

public class CartOutput {
	private CartService cartservice;

	public CartOutput(){
		this.cartservice = new CartServiceImpl();
	}


	public void output() {
		ArrayList<CartOutputVO> list = this.cartservice.readAll();

		if(list == null) System.out.println("���� ��ٱ��Ͽ� �ִ� ���� ��ǰ�� �����ϴ�.");
		else {  
			printLabel();
			for(CartOutputVO cart: list) {
				System.out.printf("%d\t%d\t%s\t%d\t%s\t%s\n"
						,cart.getCartNum(), cart.getProductNum(),cart.getProductLoc(),cart.getProductPrice(),
						cart.getCheckin(),cart.getCheckout());
			}
		}
	}
	private void printLabel() {
		System.out.println(" ��ٱ��� ��� ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("��ȣ\t��ǰ��ȣ\t����\t��ǰ����\t�Խǳ�¥\t��ǳ�¥");
		System.out.println("---------------------------------------------------------------------------------");

	}
}
