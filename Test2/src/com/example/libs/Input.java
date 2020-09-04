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
		System.out.print("사원번호 : ");    String sabun = this.scan.next();
		System.out.print("사원이름 : ");    String name = this.scan.next();
		System.out.print("기본급 : ");      int defSalary = this.scan.nextInt();
		System.out.print("야간시간 : ");    int nightHour = this.scan.nextInt();
		System.out.print("가족수 : ");       int family = this.scan.nextInt();
		Salary sal = new Salary(sabun, name, defSalary, nightHour, family);
		this.vector.addElement(sal);
	}
}*/

import java.util.Scanner;
import java.util.Vector;
class Input {			//default형 Input클래스
	private Vector<Salary> vector;// Salary객체만 담을 수 있는 Vector 생성
	private Scanner scan;				//Scanner 기능을  사용하기 위해 객체 생성
	Input(Vector<Salary> vector) {					//생성자
		this.vector = vector;							//vector초기화
		this.scan = new Scanner(System.in);		//스캐너를 생성자에서 표준입력받게 초기화
	}
	void input() { 			//input메소드
		System.out.print("사원번호 : ");    String sabun = this.scan.next();				//사원번호 출력되고 사용자에게 sabun을  입력받는다
		System.out.print("사원이름 : ");    String name = this.scan.next();				//사원이름 출력되고 사용자에게 name을  입력받는다
		System.out.print("기본급 : ");      int defSalary = this.scan.nextInt();			//기본급 출력되고 사용자에게 defSalary을  입력받는다
		System.out.print("야간시간 : ");    int nightHour = this.scan.nextInt();		//야간시간 출력되고 사용자에게 nightHour을  입력받는다
		System.out.print("가족수 : ");       int family = this.scan.nextInt();				//가족수 출력되고 사용자에게 family를  입력받는다
		Salary sal = new Salary(sabun, name, defSalary, nightHour, family);			//Sarlay클래스를 사용하기 위해 객체 sal 생성
		this.vector.addElement(sal);		//sal의 객체를 Vector에 저장한다
	}
}