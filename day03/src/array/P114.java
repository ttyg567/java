package array;

import java.util.Arrays;
import java.util.Random;

public class P114 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];  // 5X5 사이즈의 배열
		
		Random r = new Random();
		
		for(int i = 0; i< arr.length; i++) {    // arr.length 는 5, 열 개수 의미
			
			for(int j = 0; j < arr[i].length; j++) {   // i열의 행 개수
				arr[i][j] = r.nextInt(9) + 1;
				
			}
			
		}
		
			for(int i = 0; i< arr.length; i++) {    // arr.length 는 5, 열 개수 의미
			
				for(int j = 0; j < arr[i].length; j++) {   // i열의 행 개수

					System.out.printf("%d\t", arr[i][j]);
				
			}
			System.out.println("");
			
			// for each구문
			System.out.println("---------------------");
			for (int a[]: arr) {
				for(int data: a) {
					System.out.printf("%d\t", data);
				}
				System.out.println("");
			}
		}
		
		

	}

}
