package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		
		// 100 ~ 95 또는 90 ~ 85
		
		
		String grade = "";
		String gender = "M";
		double sum = 80.0;
		
		System.out.println("Start ...");
		
		if((sum <= 100 && sum >= 95) || (sum <= 90 && sum >= 85)) {
			grade = "VIP";
		}else if((sum <= 80 && sum >= 75) || (sum < 60 && sum >= 65)) {
			grade = "GOLD";
		}else {
			grade = "NORMAL";
		}
				
		
		System.out.printf("%s, %s, %f \n", grade, gender, sum);

		
		System.out.println("End ...");

	}

}
