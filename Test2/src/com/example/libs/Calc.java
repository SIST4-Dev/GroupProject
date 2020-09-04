package com.example.libs;
import java.util.Vector;

import com.example.utilties.DepartmentUtil;
import com.example.utilties.SalGrade;

class Calc {
	private Vector<Salary> vector;

	Calc() {}
	Calc(Vector<Salary> vector) {
		this.vector = vector;
	}
	
	void calc() {
		for(Salary sal : this.vector) {
			this.calculate(sal);
		}
	}
	
	void calculate(Salary sal) {
		String sabun = sal.getSabun();   
		char code = sabun.charAt(0);  
		String department = DepartmentUtil.getDepartment(code);  
		char gradeChar = sabun.charAt(1);  
		String gradeStr = String.valueOf(gradeChar);   
		int grade = Integer.parseInt(gradeStr);  
		int hoSalary = SalGrade.getSalaryGrade(grade); 
		int familyBonus = sal.getFamily() * 7000;   
		int nightBonus = SalGrade.getHourBonus(sal.getNightHour());
		int defSalary = sal.getDefSalary();  
		sal.setDefSalary(defSalary);
		int sum = hoSalary + SalGrade.getDefaultSalary(defSalary) + 
								nightBonus + familyBonus;
		int tax = (int)(hoSalary * 0.1);
		int salary = sum - tax;
		sal.setDepartment(department);  
		sal.setHoSalary(hoSalary);   
		sal.setFamilyBonus(familyBonus);  
		sal.setNightBonus(nightBonus);      
		sal.setSum(sum);    
		sal.setSalary(salary);   
	}
}





