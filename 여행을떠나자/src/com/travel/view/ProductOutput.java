package com.travel.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.travel.service.ProductService;
import com.travel.service.ProductServiceImpl;
import com.travel.vo.ProductVO;

public class ProductOutput {
	private Scanner scan;
	private ProductService service;

	public ProductOutput() {
		this.scan = new Scanner(System.in);
		this.service = new ProductServiceImpl();
	}

	public void output() {
		System.out.println("���� ��ǰ ���⸦ �����ϼ̽��ϴ�.");
		System.out.println("                    ��ü ��ǰ ���              ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("��ǰ��ȣ\t����\t��ǰ����\t�Խǳ�¥\t��ǳ�¥  ");
		System.out.println("---------------------------------------------------------------------------------");

		ArrayList<ProductVO> list = this.service.showAll();
		if(list == null) System.out.println("�Էµ� ��ǰ�� �����ϴ�.");

		for(ProductVO product: list) {
			System.out.printf("%d\t%s\t%d\t%s\t%s\t\n"
					,product.getProductNum(),product.getProductLoc(),product.getProductPrice(),
					product.getCheckin(),product.getCheckout());
		}
		
	}

	public void outputDetail(ProductVO product){
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("��ǰ��ȣ\t\t����\t\t��ǰ����\t\t�Խǳ�¥\t\t��ǳ�¥\t\t");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("%d\t\t%s\t\t%d\t\t%s\t\t%s\n"
				,product.getProductNum(),  product.getProductLoc(),   product.getProductPrice(),
				product.getCheckin(),          product.getCheckout());
		System.out.println("������");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("%s\n", product.getProductExp());

	}


}




