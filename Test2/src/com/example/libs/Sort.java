package com.example.libs;

import java.util.Collections;
import java.util.Vector;
class Sort {
	// 접근제한자를 이용해 변수생성
	private Vector<Salary> vector;
	// 생성자 만듬
	Sort(Vector<Salary> vector) {
		this.vector = vector;
	}
	void sort() {
		// vector의 요소들을 대소문자를 구별하며 오름차순으로 정렬
		Collections.sort(this.vector);
	}
}