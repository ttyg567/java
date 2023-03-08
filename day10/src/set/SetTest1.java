package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {
	public static void main(String[] agrs) {
	
		Set<Integer> set = new HashSet<Integer>();
		
		
		/* set 은 중복을 허용하지 않는다 
		 * 이렇게 넣어도 20, 10 만 나옴. */
//		  	set.add(10);
//			set.add(20);
//			set.add(10);
//			set.add(10);
//			
		  
		
		/* 랜덤한 수 추가하기 */
		/* 중복 된 수가 발생할 수 있어서 10개가 아닐 수 있음 */
//		Random r = new Random();
//		
//		for(int i = 0; i<10; i++) {
//			int num = r.nextInt(10) + 1;
//			set.add(num);
//		}
		
		/* 10개를 랜덤으로 추가하고 싶다면,, */
		Random r = new Random();
		
		while(set.size() < 10) { 
			int num = r.nextInt(10) +1;
			set.add(num);
		}
		
		for (int data: set) {
			System.out.println(data);
		}
		
		
		
	}

}
