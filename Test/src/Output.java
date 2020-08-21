import java.util.Vector;
public class Output {
    private Vector<Employee> vector;
    public Output(Vector<Employee> vector) {
        this.vector = vector;
    }
    
    void output() {
        System.out.println("\t\t<<급여관리 프로그램>>");
        this.printLine();
        //System.out.println("사번\t급수\t호\t수당\t지급액\t세금\t차인지급액");
        System.out.printf("%4s%4s%5s%3s%2s%1s%s\n","사번", "급수", "호", "수당", "지급액", "세금", "차인지급액");
        this.printLine();
        
        for(int i=0; i<this.vector.size(); i++) {
            Employee p = this.vector.elementAt(i);
            //no(사번), level(급수), ho(호봉), sudang(수당), paid(지급액), tax(세금), realPaid(차인지급액)
            System.out.printf(
                    "%5d\t%5d\t%5d\t%5d\t%5d\t%5d\t%5d",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang(), p.getPaid(), p.getTax(), p.getRealPaid()
                    );
        }
        
        System.out.println();
        this.printLine();
        System.out.println();
        System.out.println("입력데이타 출력");
        for(int i=0; i<this.vector.size(); i++) {
            Employee p = this.vector.elementAt(i);
            System.out.printf(
                    "%d\t%d\t%d\t%d",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang()
                    );
        }
        
    }//output
    
    
    //그냥 라인입니다.
    private void printLine() {
        for(int i=0; i<60; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    
    
}//Output 
