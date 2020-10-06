
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
		System.out.println("    여행 상품 등록     ");
		System.out.println("------------------------------");
		// System.out.print("상품번호 : ");   int product_num = scan.nextInt();
		int product_num = 0;
		System.out.print("지역 : ");   	 String product_loc = scan.nextLine();
		System.out.print("상품가격 : ");   int product_price =scan.nextInt();
		scan.nextLine();
		System.out.print("입실 가능 날짜 (YYYY-MM-DD) : ");  String checkin = scan.nextLine();
		System.out.print("마감일 (YYYY-MM-DD) : ");  String checkout = scan.nextLine();
		System.out.print("상품 설명 : ");  String product_exp = scan.nextLine();

		ProductVO pvo=new ProductVO(product_num,product_loc,product_price,checkin,checkout);
		pvo.setProductExp(product_exp);
		//이건 VO보고 만들거
		int row = this.service.insert(pvo);		
        if(row == 1) System.out.println("여행상품 등록 성공");
        else System.out.println("여행상품 등록 실패");

	}


}


