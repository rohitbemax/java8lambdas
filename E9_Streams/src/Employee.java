import java.util.ArrayList;
import java.util.List;

public class Employee {
	String name;
	int eid;
	
	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	public String getName() { return name; }
	public int getEid() { return eid; }
	
	public static List<Employee> generateEmployeeList() {
		List<Employee> eList = new ArrayList<>();
		eList.add(new Employee("Ganesh", 3));
		eList.add(new Employee("Jyothi", 7));
		eList.add(new Employee("Rajnish", 11));
		eList.add(new Employee("Maha", 14));
		eList.add(new Employee("Sriram", 30));
		
		return eList;
	}
}
