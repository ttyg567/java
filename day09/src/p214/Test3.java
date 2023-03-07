package p214;

import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) {
		double a = 0;
		double result = 10 / a;   // double로 표현하면 infinity 가 나옴
		System.out.println(result);
		try {
			Thread.sleep(1000);  // 이 문장만 치면 오류날 수 있다고 이클립스가 잡아주는데, 해결책 중 하나로..
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		InputStreamReader ir = new InputStreamReader(System.in);
		System.out.println("Input Character ...");
		int b = 0;
		try {
			b = ir.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(b);
		System.out.println("End ... ");

	}

}
