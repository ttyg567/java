package array;

public class P120 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 다음 배열의 합과 평균을 for문을 이용하여 구하시오.
		
		int sum = 0;
		double avg = 0;
		
		for(int data:a) {
			sum += data;
		}
		
		avg = (1.0 * sum)/a.length;
		System.out.printf("sum: %d, avg: %4.2f", sum, avg);
				
		
	}

}
