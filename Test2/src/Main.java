import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<Employee>(); 
		
		Input i = new Input(employee);
		i.input();
		
		Calc c = new Calc(employee);
		c.calc();

		Sort s = new Sort(employee);
		s.sort();

		Output o = new Output(employee);
		o.output();
		
	}
}
