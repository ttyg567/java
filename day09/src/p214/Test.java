package p214;

import java.util.Scanner;

public class Test {

	// 예외처리
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num ...");
		int num = 0;
		try {
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);
		} catch(ArithmeticException e1) {  // 해당하는 애러가 발생하면 e1이 됨
			System.out.println("분모가 0 입니다.");
			// e1.printStackTrace();  --> 어디서 문제가 발생했는지 알려줌
			return;  // 이렇게만 쓰면 sc.close() 가 실행 안됨
		} catch(NumberFormatException e2) {
			System.out.println("숫자를 입력하세요.");
			return;
		} finally {  // return  으로 끝나도 반드시 실행, 정상적으로 진행이 되어도 반드시 실행
			System.out.println("반드시 실행..");
			sc.close();
		}
		
		sc.close();
		
		// catch(ArithmeticException | NumberFormatException e)
		// 이렇게 한 줄로 쓸 수 있다
		//catch (Exception e) -> 이렇게 쓸 수도 있다
		// exception은 모든 에외사항의 최상위 클래스
		
		
		
		System.out.println("End Application ...");
		
		
	}

}
