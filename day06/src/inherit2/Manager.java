package inherit2;

//Employee에서 상속 받음
// id, name, salary 필드와, getAnnSalary() 메소드가 상속됨
public class Manager extends Employee { // ctrl + 클릭 하면 해당 파일로 갈 수 있음
	private double bonus; // 부모 클래스에서 없는 것만 따로 적어주면 됨

	// constructor은 상속 안됨
	// Constructor
	// generate constructors from superclass
	public Manager() {
		super();
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);

	}

	// 보너스까지 포함하게: generate constructor using fields
	// 위에 목록 내려보면 필드 다른거 다 포함되어 있는 거 선택하고 밑에 보너스까지 포함해서 generate;

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	// manager와 Employee의 연봉 계산 식이 다르다
	// 함수의 재정의(overriding)
	@Override     //annotation
		public double getAnnSalary() {
			double result = 0.0;

			result = super.getAnnSalary() + (this.bonus * 12);
			return result;
			}	
	
	
/*result = (this.salary + this.bonus) * 12;
salary 가 private으로 되어있어서, 코드 상에서는 manager 의 salary가 안보임
protected 로 바꾸면, 같은 패키지와 상속되어진 패키지에서 사용이 가능함
Employee에 가서 protected로 바꿈*/
// 만약 protected로 쓸 수 없다면 getter 이용
// result = (this.getSalary() + this.bonus) * 12;
	
	
// 출력  - manager는 bonus 까지 출력되도록 override 해준다.
	@Override
	public String toString() {
		return super.toString() + " " + bonus;
	}

}
