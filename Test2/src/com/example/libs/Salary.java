package com.example.libs;

//Comparable<Salary> �������̽��� ����ؼ� Salary Ŭ������ ����
//Comparable<Salary> �������̽��� �߻�޼ҵ带 �ݵ�� ������ �ؾ��Ѵ� (103, 110)
class Salary implements Comparable<Salary> {
	// ���� Ŭ���� �������� ����ؾ��ϱ� ������ ���������� �ʿ�
	private String sabun, name, department;  //�����ȣ, �̸�, �μ���
	private int defSalary, nightHour, family, hoSalary, familyBonus, nightBonus, sum, salary;
	// �����ڸ� �����
	Salary(String sabun, String name, int defSalary, int nightHour, int family) {
		this.sabun = sabun;
		this.name = name;
		this.defSalary = defSalary;
		this.nightHour = nightHour;
		this.family = family;
	}
	// private�� ����ϸ� �ܺο��� ���� �о�ü� �����Ƿ� getter,setter�� ����Ͽ�
	// �ܺο��� �ʵ��� ���� �аų� �����Ҽ� �ֵ��� �Ѵ�
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
	// Comparable<Salary> �޼ҵ� ������
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d",
								sabun, name, department, defSalary, hoSalary, familyBonus, 
								nightBonus, sum, salary);
	}
	// Comparable<Salary> �޼ҵ� ������
	@Override
	public int compareTo(Salary other) {
		return this.sabun.compareTo(other.sabun);
	}
}