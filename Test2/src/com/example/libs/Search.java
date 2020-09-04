
package com.example.libs;

import java.util.Scanner;
import java.util.Vector;

class Search {
	private Scanner scan;
	private Vector<Salary> vector;
	
	Search(Vector<Salary> vector, Scanner scan) {
		this.vector = vector;
		this.scan = scan;
	}
	
	Salary search() {
		System.out.print("검색할 사원번호 : ");
		String sabun = this.scan.next();
		Salary searchEmployee = null;
		for(int i = 0 ; i < this.vector.size(); i++) {
			Salary sal = this.vector.get(i);
			if(sal.getSabun().equals(sabun)) {
				searchEmployee = sal;   break;
			}
		}
		return searchEmployee;
	}
}
