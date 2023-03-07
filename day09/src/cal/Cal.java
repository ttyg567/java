package cal;

public class Cal {
	public static double div(int a , int b) throws Exception {
		double result = 0.0;
		try {
		result = a / b;
		} catch(Exception e) {
			//System.out.println("잘못 입력 하셨습니다."); -> 이렇게 하면 화면에서는 안보인다
			throw e;  // 화면에서 보이도록 CalUI로 보냄
		}
		return result;
		
	}
	
	public static double div(double a, double b) throws InfinityException {
		double result = 0.0;
		if (b == 0.0) { 
			throw new InfinityException("B0001");   //  사용자 정의 예외 클래스
		}
		result = a / b;
		return result;
	}

}
