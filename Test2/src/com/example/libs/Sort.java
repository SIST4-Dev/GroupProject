package com.example.libs;

import java.util.Collections;
import java.util.Vector;
class Sort {
	// ���������ڸ� �̿��� ��������
	private Vector<Salary> vector;
	// ������ ����
	Sort(Vector<Salary> vector) {
		this.vector = vector;
	}
	void sort() {
		// vector�� ��ҵ��� ��ҹ��ڸ� �����ϸ� ������������ ����
		Collections.sort(this.vector);
	}
}