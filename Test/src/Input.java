import java.util.Scanner;
import java.util.Vector;
public class Input {
	private Vector<Employee> vector;
	private Scanner scan;
	Input(Vector<Employee> vector){
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}
	public	void input(){
		String y_n = "I";   //�ʱ�ȭ
		do{
			System.out.print("�����ȣ : ");
			int no = this.scan.nextInt();
			
			boolean flag = false;
			for (int i = 0; i < vector.size(); i++) {
				if (vector.elementAt(i).getNo() == no) {
					System.out.println("�����ȣ �ߺ�");
					flag = true;
					break;
				}
			}
			if (flag) continue;
			
			String stringNo = Integer.toString(no);
			if(stringNo.length() > 2) {
				System.out.println("�����ȣ�� ���� 2�ڸ� �̳��� �Է����ּ���.");
				continue;
			}
			
			
			System.out.print("�� : ");
			int level = this.scan.nextInt();
			String stringLevel = Integer.toString(level);
			if(stringLevel.length() > 1) {
				System.out.println("��, ȣ�� ���� 1�ڸ� �̳��� �Է����ּ���.");
				continue;
			}
			
			System.out.print("ȣ : ");
			int ho = this.scan.nextInt();
			String stringHo = Integer.toString(ho);
			if(stringHo.length() > 1) {
				System.out.println("��, ȣ�� ���� 1�ڸ� �̳��� �Է����ּ���.");
				continue;
			}
			
			System.out.print("���� : ");
			int sudang = this.scan.nextInt();
			
			
			System.out.print("�Է� / ��� (I/O) ? :");
			y_n = this.scan.next().trim();
			Employee employee = new Employee(no, level, ho, sudang);
			this.vector.addElement(employee);
		}while(y_n.toUpperCase().equals("I"));
	}
}