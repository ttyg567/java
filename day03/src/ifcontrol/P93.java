package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		
		// *************************숫자 4개의 두 자리수를 입력 받는다.*************************
		
		Scanner sc = new Scanner(System.in);
		
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		
		double sum = 0;
		double avg = 0;
		String grade = "";
		
		// cf)  int ko = sc.nextInt()
		
		
		// *************************두자리수가 아니면 프로그램 종료 ****************************
		
		System.out.println("국어 성적 입력:");
		ko = Integer.parseInt(sc.next());
		if (ko < 10 || ko >= 100) {
			sc.close();
			return;
		}
			
		System.out.println("영어 성적 입력:");
		en = Integer.parseInt(sc.next());
		if (en < 10 || en >= 100) {
			sc.close();
			return;
		}		

		System.out.println("수학 성적 입력:");
		ma = Integer.parseInt(sc.next()); 
		if (ma < 10 || ma >= 100) {
			sc.close();
			return;
		}
		
		System.out.println("과학 성적 입력:");
		si = Integer.parseInt(sc.next());
		if (si < 10 || si >= 100) {
			sc.close();
			return;
		}
		
		
		// *************************평균과 합계를 구한다.*************************
		
		
		
		sum = ko + ma + si + en;
		avg = sum / 4.0;   // 실수로 나눠서 avg를 실수로 만든다(둘 다 정수면 정수가 나오니..)
		
		
		
		// *************************합계, 평균, 학점을 출력*************************
		// 평균 90 이상이면 A
		// 평균 80 이상이면 B
		// 평균 70 이상이면 C
		// 평균 60 이상이면 D
		// 평균 60 미만이면 F
		
		
		
		
		grade = (avg >= 90)? "A" : ((avg >= 80)? "B" : (avg >= 70)? "C" : (avg >= 60)? "D" : "F");
		
		System.out.printf("합계: %4.0f, 평균: %4.2f, 학점: %s", sum, avg, grade);
		
		
		sc.close();
		
		}
	}
		
		
		
		
/*		
 * 
		if (ko < 10 || en < 10 || ma < 10 || si < 10) {
			System.out.println("잘못된 숫자를 입력하였습니다.");
			return;
		}else if(ko >= 100 || en >= 100 || ma >= 100 || si >= 100) {
			System.out.println("잘못된 숫자를 입력하였습니다.");
			return;
		}else {
			
			sum = (double)(ko + en + ma + si);
			avg = (double)(sum/4);
			
			grade = (avg >= 90)? "A" : ((avg >= 80)? "B" : (avg >= 70)? "C" : (avg >= 60)? "D" : "F");
			
			
		}
*/
		



