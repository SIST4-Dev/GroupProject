//no �����ȣ level �� ho ȣ sudang ���� paid ���޾� tax ���� realPaid �������޾� pay �޿�
import java.util.Vector;
class Calc {
	private Vector<Employee> employee;
	Calc(Vector<Employee> employee) {
		this.employee = employee;
	}
	void calc() {
		for(int i = 0;i<this.employee.size();i++) {
			Employee em = this.employee.elementAt(i);
			//���޾� = �޿�+����
			int pay = this.getPay(em.getLevel(), em.getHo());
			int paid = pay+em.getSudang();
			em.setPaid(paid);
			//���� = (���޾�*����)-������
			int tax = (int)(paid*(this.getRate(paid)))-this.getJojung(paid);
			em.setTax(tax);
			//�������޾� = ���޾�-����
			int realPaid = paid-tax;
			em.setRealPaid(realPaid);
		}
	}
	//��, ȣ�� �޿�
	private int getPay(int level, int ho) {
		int pay = 0;
		if(level==1&&ho==1) {pay=95000;
		}else if(level==1&&ho==2) {pay=92000;
		}else if(level==1&&ho==3) {pay=89000;
		}else if(level==1&&ho==4) {pay=86000;
		}else if(level==1&&ho==5) {pay=83000;
		}if(level==2&&ho==1) {pay=80000;
		}else if(level==1&&ho==2) {pay=75000;
		}else if(level==1&&ho==3) {pay=70000;
		}else if(level==1&&ho==4) {pay=65000;
		}else if(level==1&&ho==5) {pay=60000;
		}
		return pay;
	}
	//���޾׺� ����
	private double getRate(int paid) {
		double rate = 0.0;
		if(paid<70000) rate = 0;
		else if(paid>=70000 && paid<=79999) rate = 0.0005;
		else if(paid>=80000 && paid<=89999) rate = 0.0007;
		else if(paid>=90000) rate = 0.0012;
		return rate;
	}
	//���޾׺�  ������
	private int getJojung(int paid) {
		int jojung = 0;
		if(paid<70000)jojung =0;
		else if(paid>=70000 && paid<=79999)jojung = 300;
		else if(paid>=80000 && paid<=89999)jojung = 500;
		else if(paid>=90000)jojung = 1000;
		return jojung;
	}
}