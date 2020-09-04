package com.example.libs;

//Comparable<Salary> 인터페이스를 사용해서 Salary 클래스를 생성
//Comparable<Salary> 인터페이스의 추상메소드를 반드시 재정의 해야한다 (103, 110)
class Salary implements Comparable<Salary> {
	// 동일 클래스 내에서만 사용해야하기 때문에 접근제한이 필요
	private String sabun, name, department;  //사원번호, 이름, 부서명
	private int defSalary, nightHour, family, hoSalary, familyBonus, nightBonus, sum, salary;
	// 생성자를 만든다
	Salary(String sabun, String name, int defSalary, int nightHour, int family) {
		this.sabun = sabun;
		this.name = name;
		this.defSalary = defSalary;
		this.nightHour = nightHour;
		this.family = family;
	}
	// private를 사용하면 외부에서 값을 읽어올수 없으므로 getter,setter를 사용하여
	// 외부에서 필드의 값을 읽거나 변경할수 있도록 한다
	String getSabun() {
		return sabun;
	}
	void setSabun(String sabun) {
		this.sabun = sabun;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getDepartment() {
		return department;
	}
	void setDepartment(String department) {
		this.department = department;
	}
	int getDefSalary() {
		return defSalary;
	}
	void setDefSalary(int defSalary) {
		this.defSalary = defSalary;
	}
	int getNightHour() {
		return nightHour;
	}
	void setNightHour(int nightHour) {
		this.nightHour = nightHour;
	}
	int getFamily() {
		return family;
	}
	void setFamily(int family) {
		this.family = family;
	}
	int getHoSalary() {
		return hoSalary;
	}
	void setHoSalary(int hoSalary) {
		this.hoSalary = hoSalary;
	}
	int getFamilyBonus() {
		return familyBonus;
	}
	void setFamilyBonus(int familyBonus) {
		this.familyBonus = familyBonus;
	}
	int getNightBonus() {
		return nightBonus;
	}
	void setNightBonus(int nightBonus) {
		this.nightBonus = nightBonus;
	}
	int getSum() {
		return sum;
	}
	void setSum(int sum) {
		this.sum = sum;
	}
	int getSalary() {
		return salary;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	// Comparable<Salary> 메소드 재정의
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d",
								sabun, name, department, defSalary, hoSalary, familyBonus, 
								nightBonus, sum, salary);
	}
	// Comparable<Salary> 메소드 재정의
	@Override
	public int compareTo(Salary other) {
		return this.sabun.compareTo(other.sabun);
	}
}