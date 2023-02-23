package day02;

public class P55 {

	public static void main(String[] args) {
		int a = 2000000000;
		int b = 2000000000;
		
		long A = a;
		long B = b;
     	long result = A + B;
		//long result = long(a) + long(b);
		//long result = long(a+b) 로 하면 괄호 안의 값이 이미 음수 이므로 long으로 바꿔도 음수값임
		
		System.out.println(result);

	}

}
