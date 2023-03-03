package inherit2;


public class App2 {

	public static void main(String[] args) {
		// Manager is an Employee
		Employee e = new Manager("100", "james", 500, 50);
		// Manager m = new Employee("100", "kim", 550); -> 성립안됨

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("101", "james", 500);
		ea[1] = new Employee("102", "games", 500);
		ea[2] = new Manager("103", "hames", 500, 50);
		ea[3] = new Manager("104", "zames", 500, 50);
		ea[4] = new Sales("105", "jjames", 500, "Seoul", 0.35);

		for (Employee em : ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			System.out.println(em.getIncentive()); // employee 에서 생성해줬기 때문에 override 해서 가져올 수 있음..
		}

		// Employee e = new Manager();
		// Promotion (자동 타입 변환)
		System.out.println("----------------------------------");
		TaxCal t = new TaxCal();
		double result = t.getTax(ea[0]);
		double result3 = t.getTax(ea[3]); // Manager 객체
		double result4 = t.getTax(ea[4]); // Sales 객체
		System.out.println(result);
		System.out.println(result3);
		System.out.println(result4);

		// 강제 타입 변환(Casting) : 자식 타입을 부모 타입으로 자동 변환 후, 다시 자식 타입으로 변환할 때
//		if(em instanceof Sales) {   // instanceof: 배열에서 꺼낸 객체가 우측과 맞는지 비교
//			Sales s = (Sales)em;  // Sales 에서 나온 객체면 sales 로 바꿔서 사용하겠다는 것, (double)a 이런식으로 하듯이 typecasting
//			System.out.println(s.getIncentive());

	}
}
