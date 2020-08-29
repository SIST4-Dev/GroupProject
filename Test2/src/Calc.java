import java.util.ArrayList;
//employeeNo ; �����ȣ  basePay ; �⺻��  nighttime ; �߰��ð� 
//sizeOfFamily ; ������    afterTaxIncome ; �Ǽ��ɾ�
public class Calc {
	private ArrayList<Employee> employee;
	Calc(ArrayList<Employee> employee){
		this.employee = employee;
	}
	void calc() {
		for(int i = 0; i<this.employee.size();i++) {
			Employee em = this.employee.get(i);
			
			//�μ��̸� substring()���� ù��°�ڸ� deptCode�о����
			String deptCode = em.getEmployeeNo().substring(0,1);
			deptCode = this.getDepartment(deptCode);
			em.setDepartment(deptCode);
			
			//ȣ�޼��� substring()���� �ι�°�ڸ� hogeubCode�о����
			String hogeubCode = em.getEmployeeNo().substring(1,2);
			int hogeubPay =this.getHogeubPay(hogeubCode);
			em.setHogeubPay(hogeubPay);
			
			//�������� = 7000*������
			int familyPay = 7000*em.getSizeOfFamily();
			em.setFamilyPay(familyPay);
			
			//�߰�����
			int nighttimePay = getNighttimePay(em.getNighttime());
			em.setNighttimePay(nighttimePay);

			//�⺻��
			int basefee = this.getBasePay(em.getBasePay());
			

			//�ѱݾ� = ȣ�޼���+�⺻��+�߰�����+��������
			int totalIncome= em.getHogeubPay()+basefee+em.getNighttimePay()+em.getFamilyPay();
			em.setTotalIncome(totalIncome);
			
			System.out.println("��������:" +em.getFamilyPay());
			System.out.println("ȣ�޼���:" +em.getHogeubPay());
			System.out.println("�⺻����:" +em.getBasePay());
			System.out.println("�߰�����:" +em.getNighttimePay());
			
			
			//�Ǽ��ɾ�	= �ѱݾ� - ����
			int tax = this.getTax(hogeubPay);//ȣ�޼����� ����
			/*System.out.println("����: "+ tax);*/
			
			int afterTaxIncome= totalIncome-tax;
			em.setAfterTaxIncome(afterTaxIncome);
			System.out.println("�Ǽ��ɾ�: "+afterTaxIncome);

			
			
		}
	}
	//�⺻�� �˾ƿ���
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
	
	//ȣ�޼��� �˾ƿ���
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
	
	//�μ����ڵ� �˾ƿ���
	private String getDepartment(String deptCode) {
		String department = null;
		switch(deptCode){
			case "A": department = "������"; break;
			case "B": department = "������"; break;
			case "C": department = "ȫ����"; break;
			case "D": department = "�λ��"; break;
			case "E": department = "�渮��"; break;
			case "F": department = "���˺�"; break;
			case "G": department = "�ѹ���"; break;
		}
		return department;
	}
	
	//�߰����� �˾ƿ���
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
	
	//���� �˾ƿ���
	private int getTax(int hogeubPay) {
		int tax = 0;
		tax = (int)(hogeubPay*0.1); //int������ ����ȯ
		return tax;
	}
}