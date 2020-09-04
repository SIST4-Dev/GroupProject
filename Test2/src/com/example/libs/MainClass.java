package com.example.libs;
import java.util.Scanner;
import java.util.Vector;

public class MainClass {
	private Vector<Salary> vector;
	private Scanner scan;
	
	private MainClass() {
		this.vector = new Vector<Salary>(1,1);
		this.scan = new Scanner(System.in);
	}
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		
		while(true) {
			int choice = mc.showMenu();
			if(choice >= 1 && choice <= 4 ) mc.process(choice);
			else break;
		}
		System.out.println("Program is over...");
	}
	private void process(int choice) {
		switch(choice) {
			case 1: input();  break;
			case 2: search();  break;
			case 3: update();  break;
			case 4: output();  break;
		}
	}
	
	private void update() {
		Search search = new Search(this.vector, this.scan);
		Salary sal = search.search();
		if(sal == null) System.out.println("입력하신 사원을 찾을 수 없습니다.");
		else {
			Update update = new Update(this.vector, this.scan);
			update.update(sal);
		}
		
	}
	
	private void search() {
		Search search = new Search(this.vector, this.scan);
		Salary sal = search.search();
		if(sal != null) 
			System.out.printf("사원번호 : %s\t\t사원 이름 : %s%n", sal.getSabun(), sal.getName());
		else System.out.println("입력하신 사원을 찾을 수 없습니다.");
	}
	
	private void input() {
		Input input = new Input(this.vector);    input.input();
		Calc calc = new Calc(this.vector);    calc.calc();
	}
	
	private void output() {
		Sort sort = new Sort(this.vector);     sort.sort();
		Output output = new Output(this.vector);  output.output();
	}
	
	private int showMenu() {
		System.out.println("\n***********Menu**********");
		System.out.println("1. 입력\t2. 검색\t3. 수정\t4. 출력\t5. 종료");
		System.out.print("선택 >> : ");  
		return this.scan.nextInt();
	}
}
