package com.travel.view;

import com.travel.service.*;

public class CartInput {
	private CartService service;	
	CartOutput coutput;

	public CartInput() {
		this.service = new CartServiceImpl();
		this.coutput = new CartOutput();
	}

	public void input(int productNum){
		System.out.println("------------------------------");
		int row = this.service.insert(productNum);
		if(row == 1) 
		{
			System.out.println("장바구니에 추가됐습니다.");
			coutput.output(); 
		}
		else System.out.println("장바구니 추가 실패");
		System.out.println("------------------------------");

	}

}
