package ifcontrole;

public class Ws {

	public static void main(String[] args) {
		 
		// 1 ~ 100 까지의 숫자 중
		// 1) 3의 배수의 합과 평균을 구하시오
		// 2) 4의 배수의 합과 평균을 구하시오
		// 3) 7의 배수의 합과 평균을 구하시오
		
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt7 = 0;
		
		int sum3 = 0;
		int sum4 = 0;
		int sum7 = 0;
		
		double avg3 = 0;
		double avg4 = 0;
		double avg7 = 0;
		
		
		// 3, 6, 9, 12, 15, 18
		// 4, 8, 12, 16
		// 7, 14
		for (int i = 1; i <= 100; i++) {
			
			if ( i%3 == 0) {
				sum3 += i;
				cnt3 ++;
						
			}
			if ( i%4 == 0){
				sum4 += i;
				cnt4 ++;
				
			}
			if ( i%7 ==0) {
				sum7 += i;
				cnt7 ++;
		
			}
			
			
			
		}
		
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum7);
		
		avg3 = (1.0*sum3) / cnt3;
		avg4 = (1.0*sum4) / cnt4;
		avg7 = (1.0*sum7) / cnt7;
		
		System.out.println(avg3);
		System.out.println(avg4);
		System.out.println(avg7);
		
		
			
		

	}
}
