package variable;

import java.util.Scanner;

public class P81 {

	public static void main(String[] args) {
		//숫자를 입력 받아
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 하십시오");
		
		int a = Integer.parseInt(sc.next());
		
		String result = (a > 0)? "정상" : "비정상" ;
		System.out.println(result);
		sc.close();  // 값을 받아오기 위해서 os에 파이프를 연결해서 계속 처리를 하는건데 이렇게 닫아주지 않으면 계속 연결되어있는거나 마찬가지니 꼭 종료해줘야함
		

	}

}
