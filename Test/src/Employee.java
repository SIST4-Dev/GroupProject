public class Employee {
	private int no, level, ho, sudang, paid, tax, realPaid;
	public Employee(int no, int level, int ho, int sudang) {
		this.no = no;
		this.level = level;
		this.ho = ho;
		this.sudang = sudang;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHo() {
		return ho;
	}
	public void setHo(int ho) {
		this.ho = ho;
	}
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getRealPaid() {
		return realPaid;
	}
	public void setRealPaid(int realPaid) {
		this.realPaid = realPaid;
	}
}