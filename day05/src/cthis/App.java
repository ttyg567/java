package cthis;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("이종석", 500);
		System.out.println(e);
		Employee e2 = new Employee("이종석2", 500);
		System.out.println(e2);
		
		Date d = new Date();
		java.sql.Date dd = new java.sql.Date(0);
	}

}
