package variable;

public class P54 {

	public static void main(String[] args) {
		// boolean
		boolean b1 = true;
		boolean b2 = 10 > 5;
		 
		// 정수
		int n1 = 10;
		long n2 = 200000000000000L; 
		// 정수만 들어가야하는데(정수 기본은 int) 정수가 될 수 있는 범위를 넘으니 L을 붙임
		// long 은 보통 
		// long n2 = 0L;
		// n2 = 2222222222222222L (이렇게 해서 외부에서 값을 받아와서 사용)
		
		
		//실수
		double d1 = 1.0;
		float f1 = 1.0F; //실수의 기본형이 double 이기 때문에 F 를 붙임
		
		double d2 = 1/2;  // 정수와 정수의 연산이 일어나면 정수가 되어버림 - 출력값 0.0
		System.out.println(d2);
		
		double d3 = 10.0/3.0;
		System.out.println(d3);
		
		float f2 = 10.0F/3.0F;
		System.out.println(f2);
		
		
		// 문자(char)
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 65;
		System.out.println(c2);  // 출력값 A (그렇게 정해진 것)
		
		
		
		int n3 = 10;
		double n4 = 10.0;
		// int result = n3 + n4; -> 오류남
		double result = n3 + n4;
		
		

	}

}
