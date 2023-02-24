package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 80.0;
		
		System.out.println("Start ...");
		
		
		// 85에 있는 예제와 비교하여, 배치 순서를 바꿔 sum 점수가 grade 까지 반영되게 한다.
/*		if(sum >= 90.0) {
			grade = "VIP";
			
		}else if(sum >= 70.0) {
			grade = "GOLD";
			
		}else
			grade = "SILVER";
		
		
		if(grade.equals("VIP")) {
			System.out.println("VIP 혜택 실행 ... ");
		}*/
		
		grade = (sum >= 90.0)? "VIP" : (sum >= 70.0)? "GOLD" : "Silver";
		

		if(gender.equals("M")) {
			System.out.println("Male ....");
			
		}else {
			System.out.println("Female ....");
		}
		
		
		
		System.out.printf("%s, %s, %f \n", grade, gender, sum);

		
		System.out.println("End ...");

	}

}
