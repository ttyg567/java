package ifcontrol;

public class P85 {

	public static void main(String[] args) {
		
		String grade = "VIP";
		String gender = "M";
		double sum = 90.0;
		
		System.out.println("Start ...");
		
		// if
		if(grade.equals("VIP")) {
			System.out.println("실행 ... ");
			//return; // 더이상 진행하지 말고 끝내라는 의미
			
		}
		
		// if ~ else
		if(gender.equals("M")) {
			System.out.println("Male ....");
			
		}else {
			System.out.println("Female ....");
		}
		
		
		// if ~ else ~ if else
		if(sum >= 90.0) {
			grade = "VIP";
			
		}else if(sum >= 70.0) {
			grade = "GOLD";
			
		}else
			grade = "SILVER";
		
		
		System.out.printf("%s, %s, %f \n", grade, gender, sum);

		
		System.out.println("End ...");

	}

}
