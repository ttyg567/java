package inherit;

public class App2 {

	public static void main(String[] args) {
		// Manager is an Employee
		Employee e =  new Manager("100", "james", 500, 50);
		// Manager m = new Employee("100", "kim", 550);  -> 성립안됨

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("101", "james", 500);
		ea[1] = new Employee("102", "games", 500);
		ea[2] = new Manager("103", "hames", 500, 50);
		ea[3] = new Manager("104", "zames", 500, 50);
		ea[4] = new Sales("105", "jjames", 500, "Seoul", 0.35);
		
		for (Employee em : ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			// getAnnSalary 의 의미는 '연봉을 가져와라' 인데, 
			// manager 와 employee 는 서로 다르게 계산해서 표현된다
			// 이게 다형성(polymorphism)
						
			// 상위 클래스를 잘 설계해야 하위 클래스에서도 잘 활용할 수 있다
			// 그러나 실질적으로 프로그램을 구현할 때는 그에 맞는 specialize 된 함수 들이 필요하다
			
			if(em instanceof Sales) {   // instanceof: 배열에서 꺼낸 객체가 우측과 맞는지 비교
				Sales s = (Sales)em;  // Sales 에서 나온 객체면 sales 로 바꿔서 사용하겠다는 것, (double)a 이런식으로 하듯이 typecasting
				System.out.println(s.getIncentive());
				
			}
			
		}
			
			
			
		
	}
}
