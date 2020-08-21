import java.util.Vector;
public class Output {
    private Vector<Employee> vector;
    public Output(Vector<Employee> vector) {
        this.vector = vector;
    }
    
    void output() {
        System.out.println("\t\t<<�޿����� ���α׷�>>");
        this.printLine();
        //System.out.println("���\t�޼�\tȣ\t����\t���޾�\t����\t�������޾�");
        System.out.printf("%5s%5s%5s%7s%7s%5s%10s\n","���", "�޼�", "ȣ", "����", "���޾�", "����", "�������޾�");
        this.printLine();
        
        for(int i=0; i<this.vector.size(); i++) {
            Employee p = this.vector.elementAt(i);
            //no(���), level(�޼�), ho(ȣ��), sudang(����), paid(���޾�), tax(����), realPaid(�������޾�)
            System.out.printf(
                    "%5d\t%5d\t%5d\t%7d\t%7d\t%5d\t%10d\n",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang(), p.getPaid(), p.getTax(), p.getRealPaid()
                    );
        }
        
        System.out.println();
        this.printLine();
        System.out.println();
        System.out.println("\n\n�Էµ���Ÿ ���");
        for(int i=0; i<this.vector.size(); i++) {
            Employee p = this.vector.elementAt(i);
            System.out.printf(
                    "%5d\t%5d\t%5d\t%8d%n",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang()
                    );
        }
        
    }//output
    
    
    //�׳� �����Դϴ�.
    private void printLine() {
        for(int i=0; i<64; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    
    
}//Output 
