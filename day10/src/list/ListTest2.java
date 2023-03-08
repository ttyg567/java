package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		// ArrayList가 LinkedList 보다 속도가 빠르다
		
		/* 리스트에 1~10까지의 숫자를 랜덤하게 20개 담기
		 * 단, while문 이용 */
	
		Random r = new Random();
		while(list.size() < 20) { 
			int num = r.nextInt(10) +1;
			list.add(num);
		}
		
		System.out.println(list.size());
		System.out.println("-----------------------------------------------");
		for(int data: list) {
			System.out.println(data);
		}
		


	}

}
