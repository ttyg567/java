package inherit2;


// e에는 employee, manager, sales까지 다 들어갈 수 있다

public class TaxCal {
	public double getTax(Employee e) {
		double result = 0.0;
		result = e.getAnnSalary() * 0.17;
		return result;
	}

}
