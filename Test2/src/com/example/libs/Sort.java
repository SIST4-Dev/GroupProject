package com.example.libs;
import java.util.Collections;
import java.util.Vector;

class Sort {
	private Vector<Salary> vector;

	Sort(Vector<Salary> vector) {
		this.vector = vector;
	}
	
	void sort() {
		Collections.sort(this.vector);
	}
}




