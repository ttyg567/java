package ifcontrol;

public class P89 {

	public static void main(String[] args) {
		
		// 남자이고 90점 이상이면 MVIP
		// 여자이고 90점 이상이면 FVIP
		// 남자이고 80점 이상이면 MGOLD
		// 여자이고 80점 이상이면 FGOLD
		// 남자이고 80점 미만이면 MNORMAL		
		// 여자이고 80점 미만이면 FNORMAL
		
		String grade = "";
		String gender = "M";
		double sum = 80.0;
		
		System.out.println("Start ...");
		
		if(gender.equals("M")) {
			if(sum >= 90) {
				grade = "MVIP";
			}else if(sum >= 80) {
				grade = "MGOLD";
			}else {
				grade = "MNORMAL";
			}
		}else {
			if(sum >= 90) {
				grade = "FVIP";
			}else if(sum >= 80) {
				grade = "FGOLD";
			}else {
				grade = "FNORMAL";
			}
		}
		
/*
 		grade = (gender.equals("M"))? 
				((sum >= 90) ? "MVIP": (sum >= 80)? "MGOLD": "MNORMAL" ):
				((sum >= 90) ? "FVIP": (sum >= 80)? "FGOLD": "FNORMAL")	;
				
*/		

		
		/*		
		switch(grade) {    // switch() 괄호에 실수는 못들어간다
		case "FVIP":   
			sum += 100;
			break;  // break를 안쓰면 해당 되어도 밑에 부분도 계속 다 실행한다
		case "FGOLD":
			sum += 90;
			break;
		case "MVIP":
			sum += 100;
			break;
		case "MGOLD":
			sum += 90;
			break;
		default:
			sum += 10;
*/			
			
			// 위와 같은 내용인데 이렇게 쓸 수도 있다
/*			switch(grade) {    
			case "FVIP":   
			case "MVIP":
				sum += 100;
				break;
			case "FGOLD":
			case "MGOLD":
				sum += 90;
				break;
			default:
				sum += 10; */
			
			
			// vip는 gold 및 normal 의 점수를 다 받으려 할 때
			// gold도 normal의 점수까지 받으려 할 때
			switch(grade) {    
			case "FVIP":   
			case "MVIP":
				sum += 100;
			case "FGOLD":
			case "MGOLD":
				sum += 90;
			default:
				sum += 10;
			
		}

		
		
		System.out.printf("%s, %s, %f \n", grade, gender, sum);

		
		System.out.println("End ...");

	}

}
