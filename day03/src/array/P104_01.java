package array;

import java.util.Arrays;
import java.util.Random;

public class P104_01 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Random r = new Random();
		
		for(int i=0; i < arr.length; i++) {	
			arr[i] = r.nextInt(99)+1;  
		}
		
		System.out.println(Arrays.toString(arr));  
		
		// 배열의 합과 평균을 구하시오
		
		int sum = 0;
		double avg = 0.0;
		
//		for(int i=0; i < arr.length; i++) {
//			sum += arr[i];	 
//		}
		
		for(int a:arr) {
			sum += a;
		}
		
		avg = (sum*1.0)/arr.length;
		System.out.printf("sum: %d, avg: %4.2f", sum, avg);

			
	}

}
