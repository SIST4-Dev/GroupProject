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
		System.out.println("***** <������ ������> *****");
		System.out.println("------------------------------");
		System.out.println("ȯ���մϴ�.");
		System.out.println("1. �α����ϱ�");   
		System.out.println();
		System.out.println("2. ���α׷� �����ϱ�");
		System.out.print("���Ͻô� �޴��� �Է����ּ���>>");

		int choice=this.scan.nextInt();
		scan.nextLine();
		if(choice==1) {
			Login login=null;
			login=new Login();
			String name=login.login();
			System.out.printf("%s�� �ݰ����ϴ�.\n", name);
			if(name.equals("��ö��")) {
				au.adminProcess();	
			}
			else //if (name.equals("�̿���")) 
			{
				uu.userProcess();
			}
		}else if(choice==2) {
			System.out.print("���� �����Ͻðڽ��ϱ�(y/n) ? : ");
			if(this.scan.next().toUpperCase().equals("Y")) {
				System.out.println("Bye!!!!");
				System.exit(0);
			}

		}

	}
}


