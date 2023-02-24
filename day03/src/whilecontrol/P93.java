package whilecontrol;

public class P93 {

	public static void main(String[] args) {
		
		
		System.out.println("Start .... ");
		
		int i = 0;
		
		// 1 ~ 10 출력
		/*
		 * while(i < 10) { i ++; 
		 * System.out.println(i); 
		 * }
		 */
		
		// 0 ~ 9 출력
		while(i < 10) {
			System.out.println(i);
			i ++;
		}
		
		
		// for문과 while 문의 차이
		// for문의 i는 제어문 안에 있지만
		// while문의 i는 제어문 밖에 있어 문장 밖에서도 사용 가능
		// for문도 밖에 i를 뺼 수 있긴 하지만 보통은 그렇게 안쓰나봄,,
		


	}

}
