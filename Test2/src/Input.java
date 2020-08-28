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
			
			// �����ȣ
			while(true) {
				System.out.print("�����ȣ : ");
				employeeNo = this.scan.next();
				boolean flag = check(employeeNo);
				if(check(employeeNo)) break;
				else System.out.println("������ �����ȣ�� �Է��ϼ̽��ϴ�.");
			}
			
			// ����̸�
			System.out.print("����̸� : ");
			employeeName = this.scan.next();
			
			// �⺻��
			while(true) {
				System.out.print("�⺻�� : ");
				basePay = this.scan.nextInt();
				if(basePay>=1 && basePay <=4) break;
				else System.out.println("�⺻���� 1���� 4������ ���� 1�ڸ��� �Է����ּ���.");
			}
			
			// �߰��ð�
			while(true) {
				System.out.print("�߰��ð� : ");
				nighttime  = this.scan.nextInt();
				if(nighttime>=1 && nighttime <=4) break;
				else System.out.println("�߰��ð��� ���� 1���� 4������ ���� 1�ڸ��� �Է����ּ���.");
			}
			
			// ������
			while(true) {
				System.out.print("������ : ");
				sizeOfFamily  = this.scan.nextInt();
				if(sizeOfFamily>=1 && sizeOfFamily <=5) break;
				else System.out.println("�������� 1���� 5������ ���� 1�ڸ��� �Է����ּ���.");
			}
			
			System.out.print("�Է�/���(I/O) ? : ");
			y_n = this.scan.next();
			Employee em = new Employee(employeeNo,  employeeName, basePay, nighttime , sizeOfFamily);
			this.employee.add(em);
		}while(y_n.equals("I") || y_n.equals("i"));
	}
	
	boolean check(String employeeNo) {  //������ �����ȣ ���� �Ǵ�
		
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