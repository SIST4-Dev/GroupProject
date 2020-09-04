import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
/**
 * @author : KIMHEEJIN
 * @date 2020. 8. 21.
 * @objective 
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */
public class Sort {
	private Vector<Employee> employee;
	public Sort(Vector<Employee> employee) {
		this.employee = employee;
	}
	void sort() {
		Collections.sort(this.employee, (o1, o2) ->((o1.getNo() > o2.getNo()) ? -1 :(o1.getNo() < o2.getNo()) ? 1 : 0)*-1);
	}
}