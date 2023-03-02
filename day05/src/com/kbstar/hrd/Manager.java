package com.kbstar.hrd;

public class Manager {
	private String id;
	private String name;
	private int salary;
	private int bonus;
	
	public Manager() {
	}

	public Manager(String id, String name, int salary, int bonus) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public double getTax() {
		double result = 0.0;
		result = (this.salary + this.bonus)* 0.17;
		return result;
	}
	
	public int getAnnSalary() {
		int result = 0;
		result = ( this.salary + this.bonus) * 12; 
		return result; // -> local variable 해당 중괄호 안에서만 사용, 처음 사용 할 떄 초기화 해줘야함 
	}
	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary() * 0.17;
		// result = (this.salary * 12) * 0.17;
		return result;
	}
	
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
}
