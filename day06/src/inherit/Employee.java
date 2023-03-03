package inherit;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	// Constructor
	public Employee() {
	}
	
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// getter & setter
	public double getSalary() {
		return salary;
	}

	// method
	public double getAnnSalary() {
		double result = 0;
		result = this.salary * 12;
		return result;
	}

	

	//출력
	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
	
	

}
