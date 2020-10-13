package com.travel.view;

import java.util.Scanner;

import com.travel.vo.ProductVO;

public class UserUI {
	private Scanner scan;
	ProductOutput poutput = new ProductOutput();
	ProductSearch search = new ProductSearch(); 
	CartInput cinput = new CartInput();
	CartOutput coutput = new CartOutput();

	public UserUI() {
		this.scan = new Scanner(System.in);

	}

	public void userProcess(){
		do {
			int choice = this.showMenu();
			
			switch (choice) {
			
			// 여행 상품 보기
			case 1: 
				poutput.output();				
				int choice2 = this.showMenu2();
				switch (choice2) {
				// 여행상품 검색
				case 1:
					search.searchLocation();
					addCartOrNot();
					break;
				
				// 상세보기
				case 2:
					addCartOrNot();
					break;
					
				// 뒤로가기
				case 9:
					break;
				}

				break;

			// 여행 상품 검색하기
			case 2: 	
				search.searchLocation();
				addCartOrNot();
				break;
			
			//장바구니 보기
			case 3:
				coutput.output(); 
				break;
				
			// 뒤로가기
			case 9: 
				return;
			}
			
		} while (true);

	}
	public int showMenu() {
		System.out.println("------------------------------");
		System.out.println("<<사용자 페이지>>");
		System.out.println("------------------------------");
		System.out.println("1. 여행 상품 보기");
		System.out.println("2. 여행 상품 검색");
		System.out.println("3. 장바구니 보기");
		System.out.println("9. 뒤로가기");
		System.out.print("선택 >> ");
		return this.scan.nextInt();
	}

	public int showMenu2() {
		System.out.println("------------------------------");
		System.out.println("1. 여행 상품 검색");
		System.out.println("2. 상세보기");
		System.out.println("9. 뒤로가기");
		System.out.print("선택 >> ");
		return this.scan.nextInt();
	}

	private int showMenu3() {
		System.out.println("------------------------------");
		System.out.println("1. 장바구니에 담기");
		System.out.println("9. 뒤로가기");
		System.out.print("선택 >> ");
		return this.scan.nextInt();
	}
	
	private void addCartOrNot() {
		int num = search.searchNum();
		int choice = this.showMenu3();
		switch(choice) {
		// 장바구니 담기
		case 1:
			cinput.input(num);
			break;
		case 9:
			break;
		}
		
		
	}

}

