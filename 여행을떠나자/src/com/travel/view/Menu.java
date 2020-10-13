package com.travel.view;

import java.util.Scanner;

public class Menu {
	private Scanner scan;
	private AdminUI au;
	private UserUI uu;
	private boolean flag;

	public Menu() {
		this.scan=new Scanner(System.in);
		this.au=new AdminUI();
		this.uu=new UserUI();
		this.flag=false;
		while(!flag) {
			this.init();
		}
	}

	public void init() {
		System.out.println("------------------------------");
		System.out.println("***** <여행을 떠나자> *****");
		System.out.println("------------------------------");
		System.out.println("환영합니다.");
		System.out.println("1. 로그인하기");   
		System.out.println();
		System.out.println("2. 프로그램 종료하기");
		System.out.print("원하시는 메뉴를 입력해주세요>>");

		int choice=this.scan.nextInt();
		scan.nextLine();
		if(choice==1) {
			Login login=null;
			login=new Login();
			String name=login.login();
			System.out.printf("%s님 반갑습니다.\n", name);
			if(name.equals("김철수")) {
				au.adminProcess();	
			}
			else //if (name.equals("이영희")) 
			{
				uu.userProcess();
			}
		}else if(choice==2) {
			System.out.print("정말 종료하시겠습니까(y/n) ? : ");
			if(this.scan.next().toUpperCase().equals("Y")) {
				System.out.println("Bye!!!!");
				System.exit(0);
			}

		}

	}
}


