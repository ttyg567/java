package whilecontrol;

public class P95 {

	public static void main(String[] args) {
		
		
		System.out.println("Start .... ");
		
		int i = 1;
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		
		while(i <= 100) {
			
			if( i%2 == 0) {
				sum += i;
				cnt ++;
			}

			if (i == 8) {
				break;    //for문을 break하는 것
			}
			i ++;
			
		}
		
		avg = (sum*1.0) / cnt;
		
		System.out.printf("%d, %f \n", sum, avg);
		System.out.println("End .... ");
		
		

		


	}

}
