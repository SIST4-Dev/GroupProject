
package com.travel.view;
import java.util.Scanner;

import com.travel.service.*;
import com.travel.vo.ProductVO;

public class ProductInput {
	private Scanner scan;
	private ProductService service;

	public ProductInput() {
		this.scan=new Scanner(System.in);
		this.service = new ProductServiceImpl();
	}

	public void input() {
		System.out.println("------------------------------");
		System.out.println("    ���� ��ǰ ���     ");
		System.out.println("------------------------------");
		// System.out.print("��ǰ��ȣ : ");   int product_num = scan.nextInt();
		int product_num = 0;
		System.out.print("���� : ");   	 String product_loc = scan.nextLine();
		System.out.print("��ǰ���� : ");   int product_price =scan.nextInt();
		scan.nextLine();
		System.out.print("�Խ� ���� ��¥ (YYYY-MM-DD) : ");  String checkin = scan.nextLine();
		System.out.print("������ (YYYY-MM-DD) : ");  String checkout = scan.nextLine();
		System.out.print("��ǰ ���� : ");  String product_exp = scan.nextLine();

		ProductVO pvo=new ProductVO(product_num,product_loc,product_price,checkin,checkout);
		pvo.setProductExp(product_exp);
		//�̰� VO���� �����
		int row = this.service.insert(pvo);		
        if(row == 1) System.out.println("�����ǰ ��� ����");
        else System.out.println("�����ǰ ��� ����");

	}


}


