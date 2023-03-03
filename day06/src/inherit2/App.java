package inherit2;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "james", 500);
		System.out.println(e);
		System.out.println(e.getAnnSalary());
		
		
		Manager m = new Manager("200","kim", 500, 50);
		System.out.println(m);
		System.out.println(m.getAnnSalary());   // manager의 클래스 내에 구현되어 있지 않아도 상속을 받아 사용할 수 있다
		
		

	}

}
