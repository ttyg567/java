package cal;

import java.util.Scanner;

public class CalUI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 Numbers");
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		double result = 0.0;
		try {
			result = Cal.div(a, b); // static 사용으로 이렇게 쓸 수 있음
		} catch (Exception e) {
			System.out.println("분모가 0입니다.");
		}
		System.out.println(result);
		sc.close();

	}

}
