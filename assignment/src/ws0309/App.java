package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		// 로또 번호 입력
		ArrayList<Integer> myNum = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 숫자 입력: ");
		int a = Integer.parseInt(sc.next());
		myNum.add(a);
		int b = Integer.parseInt(sc.next());
		myNum.add(b);
		int c = Integer.parseInt(sc.next());
		myNum.add(c);

		Lotto lotto = new Lotto();
		lotto.makeWinningNumberMoney();

		int grade = lotto.checkRanking(myNum);
		double prizeMoney = lotto.prizeMoney(grade);

		if (grade > 0) {
			System.out.println("당첨 번호는...");
			for (int data : lotto.getWinningNum()) {
				System.out.println(data);
			}
			System.out.printf("당첨, 당첨금은 %.0f 원 입니다!", prizeMoney);
		} else {
			System.out.println("당첨 번호는...");
			for (int data : lotto.getWinningNum()) {
				System.out.println(data);
			}
			System.out.println("꽝입니다..");
		}

	}

}
