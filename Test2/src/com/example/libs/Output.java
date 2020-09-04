/*package com.example.libs;
import java.util.Vector;

class Output {
	private Vector<Salary> vector;

	Output(Vector<Salary> vector) {
		this.vector = vector;
	}
	
	void output() {
		printLabel();
		for(Salary sal : this.vector) {
			System.out.println(sal);  //sal.toString()
		}
	}
	private void printLabel() {
		System.out.println("                         << 쌍용 주식회사 봉급 관리프로그램 >>");
		System.out.println("사원번호\t사원이름\t부서명\t기본급\t호급수당\t가족수당\t야간수당\t총금액\t실수령액");
		System.out.println("----------------------------------------------------------------------------------");
	}
}
*/
package com.example.libs;
import java.util.Vector;
class Output {
    private Vector<Salary> vector;
    Output(Vector<Salary> vector) {
        this.vector = vector;
    }
    
    void output() {
        printLabel(); //printLabel 불러왔음
        for(Salary sal : this.vector) { //vector를 sal에 대입
            System.out.println(sal);  //sal.toString()
        }
    }
    private void printLabel() {
        System.out.println("                         << 쌍용 주식회사 봉급 관리프로그램 >>");
        System.out.println("사원번호\t사원이름\t부서명\t기본급\t호급수당\t가족수당\t야간수당\t총금액\t실수령액");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
