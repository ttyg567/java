package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		String s1 = "10";
		int s2 = Integer.parseInt(s1);
		System.out.println(s1 + 10);  //출력값: 1010  -> 10을 강제로 문자로 바꿈
		int a = 10;
		System.out.println(s1 + a); //출력값: 1010 (위와 같음)
		System.out.println(s2 + a); //위에서 s2를 int로 바꿔줘서 연산 가능
		
		
		int n1 = 10;
		String n2 = n1 + "";
		String n3 = String.valueOf(n1);
		
		Random r = new Random();
		int rndNum = r.nextInt(10);
		// int rndNum = r.nextInt(10) + 1; -> 1부터 10까지
		System.out.println(rndNum);
		
		
		

	}

}
