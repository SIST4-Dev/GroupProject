package com.example.libs;
import java.util.Vector;
import com.example.utilties.DepartmentUtil;
import com.example.utilties.SalGrade;

/**
 * @author : KIMHEEJIN
 * @date 2020. 9. 04.
 * @objective ����_SalaryMgmt_CodeReview
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */

class Calc {
	private Vector<Salary> vector; //�������

	Calc() {}//������1
	Calc(Vector<Salary> vector) {//������2 �� ������� �ʱ�ȭ
		this.vector = vector;
	}
	
	void calc() {//������3
		for(Salary sal : this.vector) {
			this.calculate(sal);
		}
	}
	
	void calculate(Salary sal) {
		String sabun = sal.getSabun(); //String���� �����ȣ �о����   
		char code = sabun.charAt(0);  //���ڿ��� ���� �����ȣ 0��° �ε����� ����ִ� �� ���ڷ� ����
		String department = DepartmentUtil.getDepartment(code); // DepartmentUtilŬ�������� sabun�� 0��°�� �ش��ϴ� ���� code�� getDepartment �о����		
		char gradeChar = sabun.charAt(1); //���ڿ��� ���� �����ȣ 1��° �ε����� ����ִ� �� ���ڷ� ����
		String gradeStr = String.valueOf(gradeChar);  //���ڷ� ���� �� ���ڿ��� �ٲ㼭 gradeStr�� ����
		int grade = Integer.parseInt(gradeStr); //���ڿ��� �ٲ� gradeStr�� ���ڷ� ��ȯ
		int hoSalary = SalGrade.getSalaryGrade(grade); //grade���� �ش��ϴ� ȣ�޼����� 
		int familyBonus = sal.getFamily() * 7000;//����������
		int nightBonus = SalGrade.getHourBonus(sal.getNightHour());//�߰����� ���
		int defSalary = sal.getDefSalary(); //�⺻�޼��� ���
		sal.setDefSalary(defSalary);// �⺻�� ����
		int sum = hoSalary + SalGrade.getDefaultSalary(defSalary) + 
								nightBonus + familyBonus; //�ѱݾ� ���
		int tax = (int)(hoSalary * 0.1); //���� ���
		int salary = sum - tax; //�Ǽ��ɾ� ���
		sal.setDepartment(department);  //�μ��� ����
		sal.setHoSalary(hoSalary);   //ȣ�޼��� ����
		sal.setFamilyBonus(familyBonus);  //�������� ����
		sal.setNightBonus(nightBonus);      //�߰����� ����
		sal.setSum(sum);    //�ѱݾ� ����
		sal.setSalary(salary);   //�Ǽ��ɾ� ����
	}
}





