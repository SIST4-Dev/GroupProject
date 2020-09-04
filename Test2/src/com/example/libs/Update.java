
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
	
	// 기본급, 야간급, 가족수 수정하는 메소드
	void update(Salary sal) {
		System.out.printf("사원번호 : %s\t사원 이름 : %s\t기본급 : %d\t야간시간 : %d\t가족수 : %d%n", 
				sal.getSabun(), sal.getName(), sal.getDefSalary(), sal.getNightHour(), sal.getFamily());
		System.out.println("기본급, 야간시간, 가족수를 수정할 수 있습니다. 수정을 원하지 않으면 이미 입력한 값을 다시 입력하시면 됩니다.");
		System.out.print("변경하실 기본급 : ");   int defSalary = this.scan.nextInt();
		System.out.print("변경하실 야간시간 : ");  int nightHour = this.scan.nextInt();
		System.out.print("변경하실 가족수 : ");  int family = this.scan.nextInt();
		sal.setDefSalary(defSalary);
		sal.setNightHour(nightHour);
		sal.setFamily(family);
		Calc calc = new Calc();   calc.calculate(sal);   //수정된 값으로 다시 계산
	}
}
