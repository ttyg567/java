package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		
		// 합과 평균을 구하시오
		// 짝수만 구하시오 (i % 2 == 0)
		
		System.out.println("Start .... ");
		
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		for (int i = 1; i <= 100; i++) {   
			
			if (i % 2 == 0) {
				sum += i;
				cnt ++;
			}
			
			if (i == 8) {
				break;
			}
			
		}
		
		
		avg = sum / (cnt*1.0);  
		System.out.printf("합: %d, 평균: %f \n", sum, avg);
		System.out.println(cnt);
		
		System.out.println("End .... ");
		
		

	}

}
