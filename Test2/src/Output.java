import java.util.ArrayList;
public class Output {
    
    private ArrayList<Employee> employee;
    
    public Output(ArrayList<Employee> employee) {
        this.employee = employee;
    }
    public void output() {
        System.out.println("\t\t<<Salary Management>>");
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                "�����ȣ", "����̸�", "�μ���", "�⺻��", "ȣ�޼���", "��������", "�߰�����","��ݾ�", "�Ǽ��ɾ�");
        
        for(int i=0; i<this.employee.size(); i++) {
            Employee p = this.employee.get(i);
            //���� ����Ұ���
            //employeeNo(�����ȣ), employeeName(����̸�), department(�μ���), basePay(�⺻��), hogeubPay(ȣ�޼���), familyPay(��������), nighttimePay(�߰�����), afterTaxIncome(�Ǽ��ɾ�), totalIncome(�ѱݾ�)
            System.out.printf(
                    "%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
                    p.getEmployeeNo(), p.getEmployeeName(), p.getDepartment(), p.getBasePay(), p.getHogeubPay(), p.getFamilyPay(), p.getNighttimePay(), p.getTotalIncome(),p.getAfterTaxIncome()
                    );
        }
        
    }//output
    
    }
