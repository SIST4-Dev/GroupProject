import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

public class Sort{
	private Vector<Employee> employee;
	public Sort(Vector<Employee> employee) {
		this.employee = employee;
	}

	public void sort() {
		/*
		for(Employee e: employee) {
			Collections.sort(e.getNo(), (a, b) -> a.compareTo(b) * -1);	
		}
		*/
		Collections.sort(this.employee, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (o1.getNo() > o2.getNo()) ? -1 :
								(o1.getNo() < o2.getNo()) ? 1 : 0;
			}
		});

	}

}