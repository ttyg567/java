package oop1;

public class App {
// 얘는 실행하는 파일이기 때문에 public static void 가 필요하다
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.go();
		car1.stop();

		Car car2 = new Car();
		car2.go();
		car2.stop();

	}

}
