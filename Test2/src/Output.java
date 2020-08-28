import java.util.ArrayList;
public class Output {
    
    private ArrayList<Employee> employee;
    
    public Output(ArrayList<Employee> employee) {
        this.employee = employee;
    }
    public void output() {
        System.out.println("\t\t<<Salary Management>>");
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                "사원번호", "사원이름", "부서명", "기본급", "호급수당", "가족수당", "야간수당","출금액", "실수령액");
        
        for(int i=0; i<this.employee.size(); i++) {
            Employee p = this.employee.get(i);
            //내가 출력할것은
            //employeeNo(사원번호), employeeName(사원이름), department(부서명), basePay(기본급), hogeubPay(호급수당), familyPay(가족수당), nighttimePay(야간수당), afterTaxIncome(실수령액), totalIncome(총금액)
            System.out.printf(
                    "%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
                    p.getEmployeeNo(), p.getEmployeeName(), p.getDepartment(), p.getBasePay(), p.getHogeubPay(), p.getFamilyPay(), p.getNighttimePay(), p.getTotalIncome(),p.getAfterTaxIncome()
                    );
        }
        
    }//output
    
    }
