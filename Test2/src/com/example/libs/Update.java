
package com.example.libs;

import java.util.Scanner;
import java.util.Vector;

class Update {
	private Vector<Salary> vector;
	private Scanner scan;
	
	Update(Vector<Salary> vector, Scanner scan) {
		this.vector = vector;
		this.scan = scan;
	}
	
	// �⺻��, �߰���, ������ �����ϴ� �޼ҵ�
	void update(Salary sal) {
		System.out.printf("�����ȣ : %s\t��� �̸� : %s\t�⺻�� : %d\t�߰��ð� : %d\t������ : %d%n", 
				sal.getSabun(), sal.getName(), sal.getDefSalary(), sal.getNightHour(), sal.getFamily());
		System.out.println("�⺻��, �߰��ð�, �������� ������ �� �ֽ��ϴ�. ������ ������ ������ �̹� �Է��� ���� �ٽ� �Է��Ͻø� �˴ϴ�.");
		System.out.print("�����Ͻ� �⺻�� : ");   int defSalary = this.scan.nextInt();
		System.out.print("�����Ͻ� �߰��ð� : ");  int nightHour = this.scan.nextInt();
		System.out.print("�����Ͻ� ������ : ");  int family = this.scan.nextInt();
		sal.setDefSalary(defSalary);
		sal.setNightHour(nightHour);
		sal.setFamily(family);
		Calc calc = new Calc();   calc.calculate(sal);   //������ ������ �ٽ� ���
	}
}
