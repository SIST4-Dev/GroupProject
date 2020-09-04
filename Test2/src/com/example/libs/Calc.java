package com.example.libs;
import java.util.Vector;
import com.example.utilties.DepartmentUtil;
import com.example.utilties.SalGrade;

/**
 * @author : KIMHEEJIN
 * @date 2020. 9. 04.
 * @objective 과제_SalaryMgmt_CodeReview
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */

class Calc {
	private Vector<Salary> vector; //멤버변수

	Calc() {}//생성자1
	Calc(Vector<Salary> vector) {//생성자2 및 멤버변수 초기화
		this.vector = vector;
	}
	
	void calc() {//생성자3
		for(Salary sal : this.vector) {
			this.calculate(sal);
		}
	}
	
	void calculate(Salary sal) {
		String sabun = sal.getSabun(); //String으로 사원번호 읽어오기   
		char code = sabun.charAt(0);  //문자열로 받은 사원번호 0번째 인덱스에 들어있는 값 문자로 리턴
		String department = DepartmentUtil.getDepartment(code); // DepartmentUtil클래스에서 sabun의 0번째에 해당하는 값이 code인 getDepartment 읽어오기		
		char gradeChar = sabun.charAt(1); //문자열로 받은 사원번호 1번째 인덱스에 들어있는 값 문자로 리턴
		String gradeStr = String.valueOf(gradeChar);  //문자로 받은 거 문자열로 바꿔서 gradeStr에 대입
		int grade = Integer.parseInt(gradeStr); //문자열로 바꾼 gradeStr을 숫자로 변환
		int hoSalary = SalGrade.getSalaryGrade(grade); //grade값에 해당하는 호급수당계산 
		int familyBonus = sal.getFamily() * 7000;//가족수당계산
		int nightBonus = SalGrade.getHourBonus(sal.getNightHour());//야간수당 계산
		int defSalary = sal.getDefSalary(); //기본급수당 계산
		sal.setDefSalary(defSalary);// 기본급 저장
		int sum = hoSalary + SalGrade.getDefaultSalary(defSalary) + 
								nightBonus + familyBonus; //총금액 계산
		int tax = (int)(hoSalary * 0.1); //세금 계산
		int salary = sum - tax; //실수령액 계산
		sal.setDepartment(department);  //부서명 저장
		sal.setHoSalary(hoSalary);   //호급수당 저장
		sal.setFamilyBonus(familyBonus);  //가족수당 저장
		sal.setNightBonus(nightBonus);      //야간수당 저장
		sal.setSum(sum);    //총금액 저장
		sal.setSalary(salary);   //실수령액 저장
	}
}





