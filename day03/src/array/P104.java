package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		Random r = new Random();
		
		for(int i=0; i < arr.length; i++) {	
			arr[i] = r.nextInt(99)+1;  
		}
			// 나눠서 쓰면 아래와 같음
			//int data = r.nextInt(99)+1;
			//arr[i] = data;
		
		
		System.out.println(Arrays.toString(arr));  //배열 출력 방법 (간단한 방법)
		
		// 배열 출력 방법2
		for(int a:arr) {
			System.out.printf("%d \t", a);
		}

			
	}

}
