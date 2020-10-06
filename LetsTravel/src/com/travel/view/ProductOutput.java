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
		System.out.println("여행 상품 보기를 선택하셨습니다.");
		System.out.println("                    전체 상품 목록              ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("상품번호\t지역\t상품가격\t입실날짜\t퇴실날짜  ");
		System.out.println("---------------------------------------------------------------------------------");

		ArrayList<ProductVO> list = this.service.showAll();
		if(list == null) System.out.println("입력된 상품이 없습니다.");

		for(ProductVO product: list) {
			System.out.printf("%d\t%s\t%d\t%s\t%s\t\n"
					,product.getProductNum(),product.getProductLoc(),product.getProductPrice(),
					product.getCheckin(),product.getCheckout());
		}
		
	}

	public void outputDetail(ProductVO product){
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("상품번호\t\t지역\t\t상품가격\t\t입실날짜\t\t퇴실날짜\t\t");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("%d\t\t%s\t\t%d\t\t%s\t\t%s\n"
				,product.getProductNum(),  product.getProductLoc(),   product.getProductPrice(),
				product.getCheckin(),          product.getCheckout());
		System.out.println("상세정보");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("%s\n", product.getProductExp());

	}


}




