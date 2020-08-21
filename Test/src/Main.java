import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Employee> employee = new Vector<Employee>(); 
		
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
