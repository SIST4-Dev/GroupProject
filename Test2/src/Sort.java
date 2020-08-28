import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Sort {
	private ArrayList<Employee> employee;
	public Sort(ArrayList<Employee> employee) {
		this.employee = employee;
	}
	void sort() {
		Collections.sort(this.employee, (o1, o2) ->((o1.getEmployeeNo() > o2.getEmployeeNo()) ? -1 :
			(o1.getEmployeeNo() < o2.getEmployeeNo()) ? 1 : 0)*-1);
	}
}

/*
*/