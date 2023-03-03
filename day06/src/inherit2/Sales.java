package inherit2;

public class Sales extends Employee {

	private String loc;
	private double rate;

	// constructor
	// 기본
	public Sales() {
	}

	// 기본 사원정보만 들어간 것
	public Sales(String id, String name, double salary) {
		super(id, name, salary);

	}

	// 전부 다 들어간 것
	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}

	// override
	@Override
	public String toString() {
		return super.toString() + " " + loc + " " + rate;
	}

	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.getIncentive() * 12);
		return result;
	}

	@Override
	public double getIncentive() {
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;
	}

}
