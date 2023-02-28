package ws0228;

public class App {

	public static void main(String[] args) {
		
		// Employee 5명을 배열로 만들기
		Employee eList[] = new Employee[5];
		eList[0] = new Employee("e1", 5000000);
		eList[1] = new Employee("e2", 5000000);
		eList[2] = new Employee("e3", 5000000);
		eList[3] = new Employee("e4", 5000000);
		eList[4] = new Employee("e5", 5000000);
		// Manager 5명을 배열로 만들기
		Manager mList[] = new Manager[5];
		mList[0] = new Manager("m1", 5000000, 500000);
		mList[1] = new Manager("m2", 5000000, 500000);
		mList[2] = new Manager("m3", 5000000, 500000);
		mList[3] = new Manager("m4", 5000000, 500000);
		mList[4] = new Manager("m5", 5000000, 500000);

		// Employee 5명 배열의 기본 정보 출력
		for(int i=0; i < eList.length; i++) {
			System.out.println(eList[i].toString());
		}
		// Manager 5명 배열의 기본 정보 출력
		for(int i=0; i < mList.length; i++) {
			System.out.println(mList[i].toString());
		}
		
		// Employee 5명의 연봉과 세금 정보를 출력
		for(int i=0; i < eList.length; i++) {
			System.out.printf("E%d의 연봉은: %.0f, 세금은: %.2f \n", (i+1), eList[i].getAnnSalary(),eList[i].getTax());
		}
		
		// Manager 5명의 연봉과 세금 정보를 출력
		for(int i=0; i < mList.length; i++) {
			System.out.printf("M%d의 연봉은: %.0f, 세금은: %.2f \n", (i+1), mList[i].getAnnSalary(),mList[i].getTax());
		}
		
		

	}

}
