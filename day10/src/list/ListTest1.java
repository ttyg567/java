package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {
	
	public static void main(String[] agrs) {
		
		List<Integer> list = new ArrayList<Integer>();   //객체 생성
		// List list = new ArrayList(); 이렇게도 가능하지만 이렇게는 잘 안쓴다
		
//		list.add(10);
//		list.add(20);
//		list.add(30);
		/* 리스트에 1~10까지의 숫자를 랜덤하게 10개 담기*/
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(10) +1;
			list.add(num);
		}
		// 리스트 수정
		list.add(0, 100);   // 리스트 첫번째는 0번째 이다.
		list.remove(5);
		
		for(int data: list) {
			System.out.println(data);
		}
		
		
		
		
		
	}

}
