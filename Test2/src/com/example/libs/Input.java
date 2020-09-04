package com.example.libs;
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
		System.out.print("사원번호 : ");    String sabun = this.scan.next();
		System.out.print("사원이름 : ");    String name = this.scan.next();
		System.out.print("기본급 : ");      int defSalary = this.scan.nextInt();
		System.out.print("야간시간 : ");    int nightHour = this.scan.nextInt();
		System.out.print("가족수 : ");       int family = this.scan.nextInt();
		Salary sal = new Salary(sabun, name, defSalary, nightHour, family);
		this.vector.addElement(sal);
	}
}
