import java.util.ArrayList;

public class Output {
	
	private Arraylist<Employee> employee;
	
	public Output(ArrayList<Employee> employee) {
		this.employee = employee;
	}

	public void output() {
        System.out.println("\t\t<<Salary Management>>");
        this.printLine();
        //System.out.println("���\t�޼�\tȣ\t����\t���޾�\t����\t�������޾�");
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
        		"�����ȣ", "����̸�", "�μ���", "�⺻��", "ȣ�޼���", "��������", "�߰�����","��ݾ�", "�Ǽ��ɾ�");
        this.printLine();
        
        for(int i=0; i<this.size(); i++) {
            Employee p = this.add(i);
            //employeeNo(�����ȣ), basePay(�⺻��), hogeubPay(ȣ�޼���), nighttime(�߰��ٷνð�),nighttimePay(�߰�����),totalIncome(�Ǽ��ɾ�), sizeOfFamily(������),familyPay(��������), afterTaxIncome(�ѱݾ�)
            System.out.printf(
                    "%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang(), p.getPaid(), p.getTax(), p.getRealPaid()
                    );
        }
        
    }//output
	
	}

}
