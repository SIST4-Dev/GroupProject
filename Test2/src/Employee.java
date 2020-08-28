
public class Employee {
	private int basePay, nighttime, sizeOfFamily, 
    afterTaxIncome, hogeubPay, familyPay, totalIncome, nighttimePay;
	private String employeeNo,employeeName;
	
	public Employee(String employeeNo, String employeeName, int basePay, int nighttime, int sizeOfFamily) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.basePay = basePay;
		this.nighttime = nighttime;
		this.sizeOfFamily = sizeOfFamily;
	}
	public int getNighttime() {
		return nighttime;
	}
​
	public void setNighttime(int nighttime) {
		this.nighttime = nighttime;
	}
​
	public int getSizeOfFamily() {
		return sizeOfFamily;
	}
​
	public void setSizeOfFamily(int sizeOfFamily) {
		this.sizeOfFamily = sizeOfFamily;
	}
​
	public int getAfterTaxIncome() {
		return afterTaxIncome;
	}
​
	public void setAfterTaxIncome(int afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
​
	public int getHogeubPay() {
		return hogeubPay;
	}
​
	public void setHogeubPay(int hogeubPay) {
		this.hogeubPay = hogeubPay;
	}
​
	public int getFamilyPay() {
		return familyPay;
	}
​
	public void setFamilyPay(int familyPay) {
		this.familyPay = familyPay;
	}
​
	public int getTotalIncome() {
		return totalIncome;
	}
​
	public void setTotalIncome(int totalIncome) {
		this.totalIncome = totalIncome;
	}
​
	public int getNighttimePay() {
		return nighttimePay;
	}
​
	public void setNighttimePay(int nighttimePay) {
		this.nighttimePay = nighttimePay;
	}
​
	public String getEmployeeNo() {
		return employeeNo;
	}
​
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
​
	public String getEmployeeName() {
		return employeeName;
	}
​
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}
