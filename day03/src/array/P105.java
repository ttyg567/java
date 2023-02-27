package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Random r = new Random();
		
		for(int i=0; i < arr.length; i++) {	
			arr[i] = r.nextInt(9)+1;  
		}
		
		System.out.println(Arrays.toString(arr));  
		
		// 배열의 합과 평균을 구하시오
		// 홀수 번째의 합과 평균을 구하시오
		
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if( i % 2 == 0) {  //0 부터 시작이라서 0, 2, 4 가 홀수번째임
				sum += arr[i];
				cnt ++;
			}
		}
		
		System.out.println(sum);
		avg = (sum*1.0)/cnt;
		System.out.printf("sum: %d, avg: %4.2f", sum, avg);

	}

}
