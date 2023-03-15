package ws0228;
// dd
public class Manager {

	private String name;
	private double salary;
	private double bonus;
	
	public Manager() {	
	}
	
	public Manager(String name, double salary, double bonus) {
		this.name = name;
		if(salary < 0 || bonus < 0) {
			this.salary = 0;
			this.bonus = 0;
		}
			this.salary = salary;
			this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return "Manager [name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	

	public double getAnnSalary() {
		return this.salary*12.0 + this.bonus;
	}
	
	public double getTax() {
		return this.getAnnSalary()*0.0372;
	}
	
	
	
}
