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
		System.out.println("                         << �ֿ� �ֽ�ȸ�� ���� �������α׷� >>");
		System.out.println("�����ȣ\t����̸�\t�μ���\t�⺻��\tȣ�޼���\t��������\t�߰�����\t�ѱݾ�\t�Ǽ��ɾ�");
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
        printLabel(); //printLabel �ҷ�����
        for(Salary sal : this.vector) { //vector�� sal�� ����
            System.out.println(sal);  //sal.toString()
        }
    }
    private void printLabel() {
        System.out.println("                         << �ֿ� �ֽ�ȸ�� ���� �������α׷� >>");
        System.out.println("�����ȣ\t����̸�\t�μ���\t�⺻��\tȣ�޼���\t��������\t�߰�����\t�ѱݾ�\t�Ǽ��ɾ�");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
