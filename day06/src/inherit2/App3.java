package inherit2;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
		
		Object obj = new Employee();
		// java 에서의 모든  클래스는
		// public class Employee extends Object {}  가 생략되어 있다
		// 근데 이게 있으면 다른 클래스에서 상속을 못받으니 이것은 생략되어 있음
		

	}

}
