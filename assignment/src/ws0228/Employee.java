package ws0228;

public class Employee {

//	Employee와 Manager 클래스를 설계 하시오(UML 제출)
//	Manager 는 보너스가 추가 됨
//	연봉과 세금을 계산 하는 기능을 구현 하시오
	//v
	
	// 속성 정의: name, salary
	private String name;
	private double salary;
	
	// default consrtuctor
	public Employee() {	
	}
	
	// salary
	public Employee(String name, double salary) {
		this.name = name;
		if(salary < 0) {
			this.salary  = 0;
		}else {
			this.salary = salary;
		}
	}
	
	
	//출력하는 역할
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	// 연봉 구하기
	public double getAnnSalary() {
		return this.salary*12.0;
	}
	
	// 세금 구하기
	public double getTax() {
		return this.getAnnSalary()*0.0372;
	}
}
