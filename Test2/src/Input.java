import java.util.ArrayList;
import java.util.Scanner;
class Input {
	private ArrayList<Employee> employee ;
	private Scanner scan;
	Input(ArrayList<Employee> employee){
		this.employee = employee;
		scan = new Scanner(System.in);
	}
	public void input(){
		String y_n = null;
		do{
			String employeeNo, employeeName; 
			int basePay = 0, nighttime = 0, sizeOfFamily = 0 ;
			
			// 사원번호
			while(true) {
				System.out.print("사원번호 : ");
				employeeNo = this.scan.next();
				boolean flag = check(employeeNo);
				if(check(employeeNo)) break;
				else System.out.println("동일한 사원번호를 입력하셨습니다.");
			}
			
			// 사원이름
			System.out.print("사원이름 : ");
			employeeName = this.scan.next();
			
			// 기본급
			while(true) {
				System.out.print("기본급 : ");
				basePay = this.scan.nextInt();
				if(basePay>=1 && basePay <=4) break;
				else System.out.println("기본급은 1에서 4사이의 정수 1자리로 입력해주세요.");
			}
			
			// 야간시간
			while(true) {
				System.out.print("야간시간 : ");
				nighttime  = this.scan.nextInt();
				if(nighttime>=1 && nighttime <=4) break;
				else System.out.println("야간시간의 값은 1에서 4사이의 정수 1자리로 입력해주세요.");
			}
			
			// 가족수
			while(true) {
				System.out.print("가족수 : ");
				sizeOfFamily  = this.scan.nextInt();
				if(sizeOfFamily>=1 && sizeOfFamily <=5) break;
				else System.out.println("가족수는 1에서 5사이의 정수 1자리로 입력해주세요.");
			}
			
			System.out.print("입력/출력(I/O) ? : ");
			y_n = this.scan.next();
			Employee em = new Employee(employeeNo,  employeeName, basePay, nighttime , sizeOfFamily);
			this.employee.add(em);
		}while(y_n.equals("I") || y_n.equals("i"));
	}
	
	boolean check(String employeeNo) {  //동일한 사원번호 여부 판단
		
		boolean flag = true;
		if(this.employee.size() == 0) flag = true;
		
		for(int i = 0 ; i < this.employee.size() ; i++) {
			String temp = this.employee.get(i).getEmployeeNo();
			if(employeeNo.equals(temp)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	boolean lengthCheck(int value) {
		String employeeNo = String.valueOf(value);
		if(employeeNo.length() == 1) return true;
		else return false;
	}
}