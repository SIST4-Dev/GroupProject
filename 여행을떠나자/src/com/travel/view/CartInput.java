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
			System.out.println("��ٱ��Ͽ� �߰��ƽ��ϴ�.");
			coutput.output(); 
		}
		else System.out.println("��ٱ��� �߰� ����");
		System.out.println("------------------------------");

	}

}
