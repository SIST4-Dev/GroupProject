package com.travel.view;
import java.util.Scanner;

import com.travel.vo.ProductVO;
import com.travel.service.*;

public class AdminUI {
	private Scanner scan;
	private MemberService memberservice;
	private ProductService productservice;
	private Login login;

	public AdminUI() {
		this.scan = new Scanner(System.in);
		this.memberservice = new MemberServiceImpl();
		this.productservice = new ProductServiceImpl();
		this.login = new Login();

	}



	public void adminProcess(){
		while (true) {
			int choice = this.admin_showmenu();
			switch (choice) {
			case 1:
				ProductInput input = new ProductInput(); // 여행상품 등록
				input.input();
				break;

			case 2:
				ProductUpdate pu = new ProductUpdate(); // 여행상품 수정
				pu.update();
				
				break;

			case 3: // 여행상품 삭제
				ProductDelete pd = new ProductDelete();
				pd.delete();
				break;

			case 9: // 로그아웃
				return;
			}
		}
	}
	public int admin_showmenu() {
		System.out.println("------------------------------");
		System.out.println("\t\t<<관리자 페이지>>");
		System.out.println("------------------------------");
		System.out.println("1. 여행 상품 입력하기");
		System.out.println("2. 여행상품 수정하기 ");
		System.out.println("3. 여행 상품 삭제하기");
		System.out.println("9. 뒤로가기");
		System.out.print("원하시는 메뉴 번호를 입력해주세요 >> ");
		return this.scan.nextInt();

	}

}
