package calculator;

public class Ui {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = 0;  // 여기서 꼭  result로 받아야하는 것은 아니지만 차후 사용할 수 있으므로 이런식으로 받아서 많이 처리함
		result = cal.sum(10, 20);
		System.out.println(result);
		cal.save(result);
		System.out.println("OK");

	}

}
