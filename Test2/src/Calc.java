import java.util.ArrayList;
//employeeNo ; 사원번호  basePay ; 기본급  nighttime ; 야간시간 
//sizeOfFamily ; 가족수    afterTaxIncome ; 실수령액
public class Calc {
	private ArrayList<Employee> employee;
	Calc(ArrayList<Employee> employee){
		this.employee = employee;
	}
	void calc() {
		for(int i = 0; i<this.employee.size();i++) {
			Employee em = this.employee.get(i);
			String deptCode = em.getEmployeeNo().substring(0,1);
			String hogeubCode = em.getEmployeeNo().substring(1,2);
			//호급수당
			int hogeubPay =this.getHogeubPay(hogeubCode);
			//가족수당 = 7000*가족수
			int familyPay = 7000*em.getSizeOfFamily();
			//야간수당
			int nighttimePay = getNighttimePay(em.getNighttime());
			//총금액 = 호급수당+기본급+야간수당+가족수당
			int totalIncome= em.getHogeubPay()+em.getBasePay()+
					nighttimePay +em.getFamilyPay();
			//실수령액	= 총금액 - 세금
			double tax = this.getTax(hogeubPay);//호급수당대비 세금
			int afterTaxIncome= (int)(totalIncome-tax);
			em.setHogeubPay(hogeubPay);
			em.setFamilyPay(familyPay);
			em.setNighttimePay(nighttimePay);
			em.setTotalIncome(totalIncome);
			em.setAfterTaxIncome(afterTaxIncome);
		}
	}
	//호급수당 알아오기
	private int getHogeubPay(String hogeubCode) {
		int hogeubPay = 0;
		switch(hogeubCode){
		case "1": hogeubPay = 900000; break;
		case "2": hogeubPay = 400000; break;
		case "3": hogeubPay = 600000; break;
		case "4": hogeubPay = 800000; break;
		case "5": hogeubPay = 300000; break;
		case "6": hogeubPay = 800000; break;
		case "7": hogeubPay = 800000; break;
	}
	return hogeubPay;
	}
	//부서명코드 알아오기
	private String getDepartment(String deptCode) {
		String department = null;
		switch(deptCode){
			case "A": department = "영업부"; break;
			case "B": department = "업무부"; break;
			case "C": department = "홍보부"; break;
			case "D": department = "인사부"; break;
			case "E": department = "경리부"; break;
			case "F": department = "판촉부"; break;
			case "G": department = "총무부"; break;
		}
		return department;
	}
	//야간수당 알아오기
	private int getNighttimePay(int nighttime) {
		int nighttimefee = 0;
		switch(nighttime){
		case 1 : nighttimefee = 1500; break;
		case 2 : nighttimefee = 2500; break;
		case 3 : nighttimefee = 3500; break;
		case 4 : nighttimefee = 4500; break;
		default :  
	}
	return nighttimefee;
	}
	//세금 알아오기
	private double getTax(int hogeubPay) {
		double tax = 0.0;
		tax = hogeubPay*0.1;
		return tax;
	}
}