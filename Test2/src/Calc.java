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
			String deptCode = em.getEmployeeNo().substring(0,1);
			String hogeubCode = em.getEmployeeNo().substring(1,2);
			//ȣ�޼���
			int hogeubPay =this.getHogeubPay(hogeubCode);
			//�������� = 7000*������
			int familyPay = 7000*em.getSizeOfFamily();
			//�߰�����
			int nighttimePay = getNighttimePay(em.getNighttime());
			//�ѱݾ� = ȣ�޼���+�⺻��+�߰�����+��������
			int totalIncome= em.getHogeubPay()+em.getBasePay()+
					nighttimePay +em.getFamilyPay();
			//�Ǽ��ɾ�	= �ѱݾ� - ����
			double tax = this.getTax(hogeubPay);//ȣ�޼����� ����
			int afterTaxIncome= (int)(totalIncome-tax);
			em.setHogeubPay(hogeubPay);
			em.setFamilyPay(familyPay);
			em.setNighttimePay(nighttimePay);
			em.setTotalIncome(totalIncome);
			em.setAfterTaxIncome(afterTaxIncome);
		}
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
	private double getTax(int hogeubPay) {
		double tax = 0.0;
		tax = hogeubPay*0.1;
		return tax;
	}
}