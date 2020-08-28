import java.util.ArrayList;

public class Output {
	
	private Arraylist<Employee> employee;
	
	public Output(ArrayList<Employee> employee) {
		this.employee = employee;
	}

	public void output() {
        System.out.println("\t\t<<Salary Management>>");
        this.printLine();
        //System.out.println("사번\t급수\t호\t수당\t지급액\t세금\t차인지급액");
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
        		"사원번호", "사원이름", "부서명", "기본급", "호급수당", "가족수당", "야간수당","출금액", "실수령액");
        this.printLine();
        
        for(int i=0; i<this.size(); i++) {
            Employee p = this.add(i);
            //employeeNo(사원번호), basePay(기본급), hogeubPay(호급수당), nighttime(야간근로시간),nighttimePay(야간수당),totalIncome(실수령액), sizeOfFamily(가족수),familyPay(가족수당), afterTaxIncome(총금액)
            System.out.printf(
                    "%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang(), p.getPaid(), p.getTax(), p.getRealPaid()
                    );
        }
        
    }//output
	
	}

}
