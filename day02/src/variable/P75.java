package variable;

import java.util.Random;
import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
//		a++;
//		++b;
		System.out.printf("%d, %d\n", a, b); //위에 주석 처리 해제하고 출력하면 11, 11 로 출력
		
		int result = ++a + b++;
		System.out.println(result);   // 출력값: 21 - a는 해당 라인이 실행되기 전에 1을 더하고, b는 해당 라인이 다 실행되고 1을 더함
		
		
		//p77
		int aa = 10;
		int bb = 10;
		
		System.out.println((aa >= 0) | (bb >= 0)); // 괄호가 필수는 아니나 구분하기 좋게,, 
		System.out.printf("%d, %d\n", aa, bb);
		//    | : or

		System.out.println((aa++ >= 0) || (bb++ >= 0));  
		System.out.printf("%d, %d\n", aa, bb);  // 출력값 11, 10  (|| 을 쓰면 aa가 true 면 bb는 검증 안하고 넘어감)
		
		System.out.println((aa++ >= 0) | (bb++ >= 0));  
		System.out.printf("%d, %d\n", aa, bb);  // 출력값 11, 11 (|을 쓰면 aa 검증 후 bb도 검증, 속도가 느려질 수 있음)
	}

}
