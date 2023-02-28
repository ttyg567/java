package oop2;

import java.util.Calendar;
import java.util.Random;


public class Employee {
	private String id;   //private - 차후 외부에서 변경하지 못하도록 보호함
	private String name;
	private int salary;

//______________________getter, setter_______________________________
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;

	}

	public Employee(String id, String name, int salary) {
		this.id = id;  //여기서는 입력된 값을 받아줘야하므로 this가 꼭 들어가야 한다
		this.name = name;
		if(salary < 0) {     //constructor가 필터링 역할도 해줄 수 있다
			this.salary = 0;
		}else {
			this.salary = salary;
		}
		
	}

	public Employee(String name, int salary) {
		this("10000", name, salary); //다른 constructor에서 가져와야하는 경우 첫번째 줄에 써야함
		//Random r = new Random();  위에 문장을 첫번째로 써야해서 주석처리함;
		//this.id = String.valueOf(r.nextInt(100) + 1);    //this를 안써도 상관은 없지만, 안써도 포함된 것으로 인식, 가시성을 위해 써주자
		
	}

	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.salary * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
