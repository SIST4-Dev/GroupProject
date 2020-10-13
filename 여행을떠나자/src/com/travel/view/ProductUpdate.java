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
        System.out.println("           여행정보 수정             ");
        System.out.println("------------------------------");
        
		System.out.print("수정을 원하시는 상품의 번호를  입력하세요 >> ");
		int num= this.scan.nextInt();
		scan.nextLine();
		
		System.out.printf("%d번을 선택하셨습니다.\n", num);
		ProductVO product2 = service.showDetail(num);
        
        System.out.println("지역 : " + product2.getProductLoc());
        System.out.print("변경할 지역 : ");
        String productLoc= this.scan.nextLine();

        System.out.println("상품 가격 : " + product2.getProductPrice());
        System.out.print("변경할 상품 가격 : ");
        int productPrice = this.scan.nextInt();
        scan.nextLine();
        System.out.println("상품 설명 : " + product2.getProductExp());
        System.out.print("변경할 상품 설명 : ");
        String productExp= this.scan.nextLine();
        
        System.out.println("체크인 날짜 : " + product2.getCheckin());
        System.out.print("변경할 체크인 날짜 : ");
        String checkin = this.scan.nextLine();
        
        System.out.println("체크아웃 날짜 : " + product2.getCheckout());
        System.out.print("변경할 체크아웃 날짜 : ");
        String checkout = this.scan.nextLine();

        product2.setProductLoc(productLoc); 
        product2.setProductPrice(productPrice);
        product2.setProductExp(productExp); 
        product2.setCheckin(checkin); 
        product2.setCheckout(checkout);
     
        int row = this.service.update(product2);
        if(row == 1) System.out.println("여행상품 수정 성공");
        else System.out.println("여행상품 수정 실패");
        
		
	}
	
}


