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
			
			// ���� ��ǰ ����
			case 1: 
				poutput.output();				
				int choice2 = this.showMenu2();
				switch (choice2) {
				// �����ǰ �˻�
				case 1:
					search.searchLocation();
					addCartOrNot();
					break;
				
				// �󼼺���
				case 2:
					addCartOrNot();
					break;
					
				// �ڷΰ���
				case 9:
					break;
				}

				break;

			// ���� ��ǰ �˻��ϱ�
			case 2: 	
				search.searchLocation();
				addCartOrNot();
				break;
			
			//��ٱ��� ����
			case 3:
				coutput.output(); 
				break;
				
			// �ڷΰ���
			case 9: 
				return;
			}
			
		} while (true);

	}
	public int showMenu() {
		System.out.println("------------------------------");
		System.out.println("<<����� ������>>");
		System.out.println("------------------------------");
		System.out.println("1. ���� ��ǰ ����");
		System.out.println("2. ���� ��ǰ �˻�");
		System.out.println("3. ��ٱ��� ����");
		System.out.println("9. �ڷΰ���");
		System.out.print("���� >> ");
		return this.scan.nextInt();
	}

	public int showMenu2() {
		System.out.println("------------------------------");
		System.out.println("1. ���� ��ǰ �˻�");
		System.out.println("2. �󼼺���");
		System.out.println("9. �ڷΰ���");
		System.out.print("���� >> ");
		return this.scan.nextInt();
	}

	private int showMenu3() {
		System.out.println("------------------------------");
		System.out.println("1. ��ٱ��Ͽ� ���");
		System.out.println("9. �ڷΰ���");
		System.out.print("���� >> ");
		return this.scan.nextInt();
	}
	
	private void addCartOrNot() {
		int num = search.searchNum();
		int choice = this.showMenu3();
		switch(choice) {
		// ��ٱ��� ���
		case 1:
			cinput.input(num);
			break;
		case 9:
			break;
		}
		
		
	}

}

