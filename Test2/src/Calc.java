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
			
			//부서이름 substring()으로 첫번째자리 deptCode읽어오기
			String deptCode = em.getEmployeeNo().substring(0,1);
			deptCode = this.getDepartment(deptCode);
			em.setDepartment(deptCode);
			
			//호급수당 substring()으로 두번째자리 hogeubCode읽어오기
			String hogeubCode = em.getEmployeeNo().substring(1,2);
			int hogeubPay =this.getHogeubPay(hogeubCode);
			em.setHogeubPay(hogeubPay);
			
			//가족수당 = 7000*가족수
			int familyPay = 7000*em.getSizeOfFamily();
			em.setFamilyPay(familyPay);
			
			//야간수당
			int nighttimePay = getNighttimePay(em.getNighttime());
			em.setNighttimePay(nighttimePay);

			//기본급
			int basefee = this.getBasePay(em.getBasePay());
			
			//총금액 = 호급수당+기본급+야간수당+가족수당
			int totalIncome= em.getHogeubPay()+basefee+em.getNighttimePay()+em.getFamilyPay();
			em.setTotalIncome(totalIncome);
			
			System.out.println("가족수당:" +em.getFamilyPay());
			System.out.println("호급수당:" +em.getHogeubPay());
			System.out.println("기본수당:" +em.getBasePay());
			System.out.println("야간수당:" +em.getNighttimePay());
			
			
			//실수령액	= 총금액 - 세금
			int tax = this.getTax(hogeubPay);//호급수당대비 세금
			/*System.out.println("세금: "+ tax);*/
			
			int afterTaxIncome= totalIncome-tax;
			em.setAfterTaxIncome(afterTaxIncome);
			System.out.println("실수령액: "+afterTaxIncome);

			
			
		}
	}
	//기본급 알아오기
	private int getBasePay(int basePay) {
		int basefee=0;
		switch(basePay) {
		case 1: basefee = 15000;break;
		case 2: basefee = 25000;break;
		case 3: basefee = 35000;break;
		case 4: basefee = 45000;break;
		default:
		}
		return basefee;
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
	private int getTax(int hogeubPay) {
		int tax = 0;
		tax = (int)(hogeubPay*0.1); //int형으로 형변환
		return tax;
	}
}
