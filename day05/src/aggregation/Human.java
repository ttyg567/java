package aggregation;

public class Human {
	private String name;
	private Car car; // 사람은 차를 가지고 있다 라는 의미
	public Human() {	
	}
	public Human(String name) {
		this.name = name;
	}
	public Human(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	// getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	// 출력
	@Override
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}
	
	
	public void drive() {
		car.go();
	}
	
	public void stopCar() {
		car.stop();
	}

}
