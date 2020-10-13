package com.travel.view;

import java.util.Scanner;

import com.travel.service.*;
import com.travel.vo.ProductVO;

public class ProductUpdate {
	private Scanner scan;
	private ProductService service;
	int num;
	
    public ProductUpdate(){
    	this.scan =new Scanner(System.in);
    	this.service = new ProductServiceImpl();
    }

	public void update() {
		System.out.println("------------------------------");
        System.out.println("           �������� ����             ");
        System.out.println("------------------------------");
        
		System.out.print("������ ���Ͻô� ��ǰ�� ��ȣ��  �Է��ϼ��� >> ");
		int num= this.scan.nextInt();
		scan.nextLine();
		
		System.out.printf("%d���� �����ϼ̽��ϴ�.\n", num);
		ProductVO product2 = service.showDetail(num);
        
        System.out.println("���� : " + product2.getProductLoc());
        System.out.print("������ ���� : ");
        String productLoc= this.scan.nextLine();

        System.out.println("��ǰ ���� : " + product2.getProductPrice());
        System.out.print("������ ��ǰ ���� : ");
        int productPrice = this.scan.nextInt();
        scan.nextLine();
        System.out.println("��ǰ ���� : " + product2.getProductExp());
        System.out.print("������ ��ǰ ���� : ");
        String productExp= this.scan.nextLine();
        
        System.out.println("üũ�� ��¥ : " + product2.getCheckin());
        System.out.print("������ üũ�� ��¥ : ");
        String checkin = this.scan.nextLine();
        
        System.out.println("üũ�ƿ� ��¥ : " + product2.getCheckout());
        System.out.print("������ üũ�ƿ� ��¥ : ");
        String checkout = this.scan.nextLine();

        product2.setProductLoc(productLoc); 
        product2.setProductPrice(productPrice);
        product2.setProductExp(productExp); 
        product2.setCheckin(checkin); 
        product2.setCheckout(checkout);
     
        int row = this.service.update(product2);
        if(row == 1) System.out.println("�����ǰ ���� ����");
        else System.out.println("�����ǰ ���� ����");
        
		
	}
	
}


