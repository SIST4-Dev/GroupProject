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
		String y_n = "I";   //초기화
		do{
			System.out.print("사원번호 : ");
			int no = this.scan.nextInt();
			
			boolean flag = false;
			for (int i = 0; i < vector.size(); i++) {
				if (vector.elementAt(i).getNo() == no) {
					System.out.println("사원번호 중복");
					flag = true;
					break;
				}
			}
			if (flag) continue;
			
			String stringNo = Integer.toString(no);
			if(stringNo.length() > 2) {
				System.out.println("사원번호는 정수 2자리 이내로 입력해주세요.");
				continue;
			}
			
			
			System.out.print("급 : ");
			int level = this.scan.nextInt();
			String stringLevel = Integer.toString(level);
			if(stringLevel.length() > 1) {
				System.out.println("급, 호는 정수 1자리 이내로 입력해주세요.");
				continue;
			}
			
			System.out.print("호 : ");
			int ho = this.scan.nextInt();
			String stringHo = Integer.toString(ho);
			if(stringHo.length() > 1) {
				System.out.println("급, 호는 정수 1자리 이내로 입력해주세요.");
				continue;
			}
			
			System.out.print("수당 : ");
			int sudang = this.scan.nextInt();
			
			
			System.out.print("입력 / 출력 (I/O) ? :");
			y_n = this.scan.next().trim();
			Employee employee = new Employee(no, level, ho, sudang);
			this.vector.addElement(employee);
		}while(y_n.toUpperCase().equals("I"));
	}
}