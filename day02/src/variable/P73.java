package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력 하시오(q, i, d, s)");
		String cmd = sc.next(); //화면에 입력한 값을 가져온다는 것
		System.out.printf("%s를 입력 했습니다.", cmd);
		sc.close(); // 파이프?를 타고 올라오는 것과 같은데, 이 경우 반드시 종료해주어야함

	}

}
