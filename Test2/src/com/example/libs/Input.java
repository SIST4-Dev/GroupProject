package com.example.libs;
/*
import java.util.Scanner;
import java.util.Vector;

class Input {
	private Vector<Salary> vector;
	private Scanner scan;
	
	Input(Vector<Salary> vector) {
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}
	
	void input() { 
		System.out.print("�����ȣ : ");    String sabun = this.scan.next();
		System.out.print("����̸� : ");    String name = this.scan.next();
		System.out.print("�⺻�� : ");      int defSalary = this.scan.nextInt();
		System.out.print("�߰��ð� : ");    int nightHour = this.scan.nextInt();
		System.out.print("������ : ");       int family = this.scan.nextInt();
		Salary sal = new Salary(sabun, name, defSalary, nightHour, family);
		this.vector.addElement(sal);
	}
}*/

import java.util.Scanner;
import java.util.Vector;
class Input {			//default�� InputŬ����
	private Vector<Salary> vector;// Salary��ü�� ���� �� �ִ� Vector ����
	private Scanner scan;				//Scanner �����  ����ϱ� ���� ��ü ����
	Input(Vector<Salary> vector) {					//������
		this.vector = vector;							//vector�ʱ�ȭ
		this.scan = new Scanner(System.in);		//��ĳ�ʸ� �����ڿ��� ǥ���Է¹ް� �ʱ�ȭ
	}
	void input() { 			//input�޼ҵ�
		System.out.print("�����ȣ : ");    String sabun = this.scan.next();				//�����ȣ ��µǰ� ����ڿ��� sabun��  �Է¹޴´�
		System.out.print("����̸� : ");    String name = this.scan.next();				//����̸� ��µǰ� ����ڿ��� name��  �Է¹޴´�
		System.out.print("�⺻�� : ");      int defSalary = this.scan.nextInt();			//�⺻�� ��µǰ� ����ڿ��� defSalary��  �Է¹޴´�
		System.out.print("�߰��ð� : ");    int nightHour = this.scan.nextInt();		//�߰��ð� ��µǰ� ����ڿ��� nightHour��  �Է¹޴´�
		System.out.print("������ : ");       int family = this.scan.nextInt();				//������ ��µǰ� ����ڿ��� family��  �Է¹޴´�
		Salary sal = new Salary(sabun, name, defSalary, nightHour, family);			//SarlayŬ������ ����ϱ� ���� ��ü sal ����
		this.vector.addElement(sal);		//sal�� ��ü�� Vector�� �����Ѵ�
	}
}