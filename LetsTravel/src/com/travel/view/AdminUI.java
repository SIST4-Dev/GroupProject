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
				ProductInput input = new ProductInput(); // �����ǰ ���
				input.input();
				break;

			case 2:
				ProductUpdate pu = new ProductUpdate(); // �����ǰ ����
				pu.update();
				
				break;

			case 3: // �����ǰ ����
				ProductDelete pd = new ProductDelete();
				pd.delete();
				break;

			case 9: // �α׾ƿ�
				return;
			}
		}
	}
	public int admin_showmenu() {
		System.out.println("------------------------------");
		System.out.println("\t\t<<������ ������>>");
		System.out.println("------------------------------");
		System.out.println("1. ���� ��ǰ �Է��ϱ�");
		System.out.println("2. �����ǰ �����ϱ� ");
		System.out.println("3. ���� ��ǰ �����ϱ�");
		System.out.println("9. �ڷΰ���");
		System.out.print("���Ͻô� �޴� ��ȣ�� �Է����ּ��� >> ");
		return this.scan.nextInt();

	}

}
