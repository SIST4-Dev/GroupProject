package com.travel.view;	//���� �ʿ������ -AdminUIŬ���� case3�� ����

import java.util.ArrayList;
import java.util.Scanner;

import com.travel.service.ProductService;
import com.travel.service.ProductServiceImpl;
import com.travel.vo.ProductVO;

public class ProductDelete {
	private Scanner scan;
	private ProductService service;
	
	public ProductDelete() {
		this.scan = new Scanner(System.in);
		this.service = new ProductServiceImpl();
	}

	public void delete(){
		System.out.println("------------------------------");
        System.out.println("           �������� ����");
        System.out.println("------------------------------");
        
        System.out.printf("(1 ~ %d)\n", this.service.showAll().size() - 1);
		System.out.print("������ ���Ͻô� ��ǰ�� ��ȣ��  �Է��ϼ��� >> ");
		int num= this.scan.nextInt();
		scan.nextLine();

		System.out.printf("%d���� �����ϼ̽��ϴ�.\n", num);
		ProductVO product2 = service.showDetail(num);
		ProductOutput po = new ProductOutput();
		po.outputDetail(product2);
		
		System.out.print("�����Ͻðڽ��ϱ�(y/n) ? : ");
		if (this.scan.next().toUpperCase().equals("Y")) {
			if (this.service.delete(product2.getProductNum()) == 1) {
				System.out.println("��ǰ�� �����ƽ��ϴ�.");
			}
		}

	}

}
