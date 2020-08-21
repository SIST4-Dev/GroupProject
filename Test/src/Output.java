import java.util.Vector;
public class Output {
    private Vector<Employee> vector;
    public Output(Vector<Employee> vector) {
        this.vector = vector;
    }
    
    void output() {
        System.out.println("\t\t\t\t<<�޿����� ���α׷�>>");
        this.printLine();
        System.out.println("���\t�޼�\tȣ\t����\t���޾�\t����\t�������޾�");
        this.printLine();
        
        for(int i=0; i<this.vector.size(); i++) {
            Employee p = this.vector.elementAt(i);
            //no(���), level(�޼�), ho(ȣ��), sudang(����), paid(���޾�), tax(����), realPaid(�������޾�)
            System.out.printf(
                    "%d\t%d\t%d\t%d\t%d\t%d\t%d",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang(), p.getPaid(), p.getTax(), p.getRealPaid()
                    );
        }
        
        this.printLine();
        System.out.println();
        System.out.println("�Էµ���Ÿ ���");
        for(int i=0; i<this.vector.size(); i++) {
            Employee p = this.vector.elementAt(i);
            System.out.printf(
                    "%d\t%d\t%d\t%d",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang()
                    );
        }
        
    }//output
    
    
    //�׳� �����Դϴ�.
    private void printLine() {
        for(int i=0; i<70; i++) {
            System.out.print("-");
        }
    }
    
    
    
}//Output 
