package com.travel.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.travel.service.*;
import com.travel.vo.ProductVO;

public class ProductSearch {
	private Scanner scan;
	private ProductService service;

	public  ProductSearch() {
		this.scan = new Scanner(System.in);
		this.service = new ProductServiceImpl();

	}
	public void searchLocation() {
		System.out.println("�����ǰ �˻��ϱ⸦ �����ϼ̽��ϴ�. ");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("1.��õ������   2.����Ư����   3.��⵵   4.��û��   5.����   6.������   7.���   8.���ֵ�");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.print("���Ͻô� ������ ��ȣ�� �Է��ϼ��� : ");

		int num= this.scan.nextInt();
		String location = num2loc(num);
		
		System.out.printf("%d. %s�� �����ϼ̽��ϴ�.\n", num, location);
		ArrayList<ProductVO> list = this.service.showByLocation(location);
		
		if(list == null) System.out.println("�Էµ� ��ǰ�� �����ϴ�.");

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("��ǰ��ȣ\t\t����\t\t��ǰ����\t\t�Խǳ�¥\t\t��ǳ�¥  ");
		System.out.println("---------------------------------------------------------------------------------");
		
		for(ProductVO product : list) {
			System.out.printf("%d\t\t%s\t\t%d\t\t%s\t\t%s\n"
					,product.getProductNum(),  product.getProductLoc(),   product.getProductPrice(),
					product.getCheckin(),          product.getCheckout());
		}

	}


	public int searchNum() {
		System.out.print("���� ��ǰ �󼼺��⸦ ���Ͻô� ��ǰ�� ��ȣ��  �Է��ϼ��� >> ");
		int num= this.scan.nextInt();
		
		System.out.printf("%d���� �����ϼ̽��ϴ�.\n", num);
		ProductVO product= this.service.showDetail(num);
		
		ProductOutput po = new ProductOutput();
		po.outputDetail(product);
		return product.getProductNum();
	}
	
	public String num2loc(int num) {
		String location = "��õ������";
		switch (num) {
		case 1:
			location = "��õ������";
			break;
		case 2:
			location = "����Ư����";
			break;
		case 3:
			location = "��⵵";
			break;
		case 4:
			location = "��û��";
			break;
		case 5:
			location = "����";
			break;
		case 6:
			location = "������";
			break;
		case 7:
			location = "���";
			break;
		case 8:
			location = "���ֵ�";
			break;
		}
		return location;
		
	}

}

