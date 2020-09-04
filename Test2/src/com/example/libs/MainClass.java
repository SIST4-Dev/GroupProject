package com.example.libs;
import java.util.Scanner;
import java.util.Vector;

public class MainClass {
	// ������� ����
	private Vector<Salary> vector;
	private Scanner scan;
	
	// ������. ������� �ʱ�ȭ
	private MainClass() {
		this.vector = new Vector<Salary>(1,1);
		this.scan = new Scanner(System.in);
	}
	
	// ������Ʈ�� ����κ�
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		
		// ���α׷� ������ �� ���� �޴� �����ְ� �Է¹޴´�.
		while(true) {
			int choice = mc.showMenu(); // ���� �Է¹���
			if(choice >= 1 && choice <= 4 ) mc.process(choice);
			else break; // ������ 5�� �Է��ϰų� �̿��� �̻������ϸ� �׳� ��������
		}
		System.out.println("Program is over...");
	}
	
	// �Է¹��� ���ڿ� ���� � �۾��� process�� �� �������ִ� �޼ҵ�
	private void process(int choice) {
		switch(choice) {
			// ������ ���ڿ� ���� MainClass ���ο� ������ �޼ҵ带 �����Ѵ�.
			case 1: input();  break;
			case 2: search();  break;
			case 3: update();  break;
			case 4: output();  break;
		}
	}
	
	// ������� ����
	private void update() {
		Search search = new Search(this.vector, this.scan);
		Salary sal = search.search();
		if(sal == null) System.out.println("�Է��Ͻ� ����� ã�� �� �����ϴ�.");
		else {
			Update update = new Update(this.vector, this.scan);
			update.update(sal);
		}
		
	}
	
	// ��� �˻�
	private void search() {
		Search search = new Search(this.vector, this.scan);
		Salary sal = search.search();
		if(sal != null) 
			System.out.printf("�����ȣ : %s\t\t��� �̸� : %s%n", sal.getSabun(), sal.getName());
		else System.out.println("�Է��Ͻ� ����� ã�� �� �����ϴ�.");
	}
	
	// �Է�. ��, ���ο� ������� �߰� �� ������ ����
	private void input() {
		Input input = new Input(this.vector);    input.input();
		Calc calc = new Calc(this.vector);    calc.calc();
	}
	
	// �׵��� �Է¹��� ��������� ������ �� ���
	private void output() {
		Sort sort = new Sort(this.vector);     sort.sort();
		Output output = new Output(this.vector);  output.output();
	}
	
	// ����ڿ��� �޴��� �����ִ� �޼ҵ�
	private int showMenu() {
		System.out.println("\n***********Menu**********");
		System.out.println("1. �Է�\t2. �˻�\t3. ����\t4. ���\t5. ����");
		System.out.print("���� >> : ");  
		return this.scan.nextInt();
	}
}
