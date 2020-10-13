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
		System.out.println("여행상품 검색하기를 선택하셨습니다. ");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("1.인천광역시   2.서울특별시   3.경기도   4.충청도   5.전라도   6.강원도   7.경상도   8.제주도");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.print("원하시는 여행지 번호를 입력하세요 : ");

		int num= this.scan.nextInt();
		String location = num2loc(num);
		
		System.out.printf("%d. %s를 선택하셨습니다.\n", num, location);
		ArrayList<ProductVO> list = this.service.showByLocation(location);
		
		if(list == null) System.out.println("입력된 상품이 없습니다.");

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("상품번호\t\t지역\t\t상품가격\t\t입실날짜\t\t퇴실날짜  ");
		System.out.println("---------------------------------------------------------------------------------");
		
		for(ProductVO product : list) {
			System.out.printf("%d\t\t%s\t\t%d\t\t%s\t\t%s\n"
					,product.getProductNum(),  product.getProductLoc(),   product.getProductPrice(),
					product.getCheckin(),          product.getCheckout());
		}

	}


	public int searchNum() {
		System.out.print("여행 상품 상세보기를 원하시는 상품의 번호를  입력하세요 >> ");
		int num= this.scan.nextInt();
		
		System.out.printf("%d번을 선택하셨습니다.\n", num);
		ProductVO product= this.service.showDetail(num);
		
		ProductOutput po = new ProductOutput();
		po.outputDetail(product);
		return product.getProductNum();
	}
	
	public String num2loc(int num) {
		String location = "인천광역시";
		switch (num) {
		case 1:
			location = "인천광역시";
			break;
		case 2:
			location = "서울특별시";
			break;
		case 3:
			location = "경기도";
			break;
		case 4:
			location = "충청도";
			break;
		case 5:
			location = "전라도";
			break;
		case 6:
			location = "강원도";
			break;
		case 7:
			location = "경상도";
			break;
		case 8:
			location = "제주도";
			break;
		}
		return location;
		
	}

}

