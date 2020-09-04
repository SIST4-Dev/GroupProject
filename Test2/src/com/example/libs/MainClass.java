package com.example.libs;
import java.util.Scanner;
import java.util.Vector;

public class MainClass {
	// 멤버변수 선언
	private Vector<Salary> vector;
	private Scanner scan;
	
	// 생성자. 멤버변수 초기화
	private MainClass() {
		this.vector = new Vector<Salary>(1,1);
		this.scan = new Scanner(System.in);
	}
	
	// 프로젝트의 실행부분
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		
		// 프로그램 종료할 때 까지 메뉴 보여주고 입력받는다.
		while(true) {
			int choice = mc.showMenu(); // 숫자 입력받음
			if(choice >= 1 && choice <= 4 ) mc.process(choice);
			else break; // 유저가 5를 입력하거나 이외의 이상한짓하면 그냥 끝내버림
		}
		System.out.println("Program is over...");
	}
	
	// 입력받은 숫자에 따라 어떤 작업을 process할 지 결정해주는 메소드
	private void process(int choice) {
		switch(choice) {
			// 각각의 숫자에 따라 MainClass 내부에 선언한 메소드를 실행한다.
			case 1: input();  break;
			case 2: search();  break;
			case 3: update();  break;
			case 4: output();  break;
		}
	}
	
	// 사원정보 수정
	private void update() {
		Search search = new Search(this.vector, this.scan);
		Salary sal = search.search();
		if(sal == null) System.out.println("입력하신 사원을 찾을 수 없습니다.");
		else {
			Update update = new Update(this.vector, this.scan);
			update.update(sal);
		}
		
	}
	
	// 사원 검색
	private void search() {
		Search search = new Search(this.vector, this.scan);
		Salary sal = search.search();
		if(sal != null) 
			System.out.printf("사원번호 : %s\t\t사원 이름 : %s%n", sal.getSabun(), sal.getName());
		else System.out.println("입력하신 사원을 찾을 수 없습니다.");
	}
	
	// 입력. 즉, 새로운 사원정보 추가 후 계산까지 진행
	private void input() {
		Input input = new Input(this.vector);    input.input();
		Calc calc = new Calc(this.vector);    calc.calc();
	}
	
	// 그동안 입력받은 사원정보를 정렬한 후 출력
	private void output() {
		Sort sort = new Sort(this.vector);     sort.sort();
		Output output = new Output(this.vector);  output.output();
	}
	
	// 사용자에게 메뉴를 보여주는 메소드
	private int showMenu() {
		System.out.println("\n***********Menu**********");
		System.out.println("1. 입력\t2. 검색\t3. 수정\t4. 출력\t5. 종료");
		System.out.print("선택 >> : ");  
		return this.scan.nextInt();
	}
}
