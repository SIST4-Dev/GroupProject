import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
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
/*
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 
public class LambdaDemo2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,7,1,2,9,3,8,2,5);

		List<String> list1 = Arrays.asList("Hello", "Java", "Oracle", "apple", "ÇÑÁö¹Î", "¹ÚÁö¹Î", "±èÁö¹Î", "123");
		Collections.sort(list1, (a, b) -> a.compareTo(b) * -1);
		System.out.println(Arrays.toString(list1.toArray())); 
	}
}*/