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

		if(list == null) System.out.println("현재 장바구니에 있는 여행 상품이 없습니다.");
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
		System.out.println(" 장바구니 목록 ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("번호\t상품번호\t지역\t상품가격\t입실날짜\t퇴실날짜");
		System.out.println("---------------------------------------------------------------------------------");

	}
}
