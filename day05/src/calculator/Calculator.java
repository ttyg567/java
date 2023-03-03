package calculator;

public class Calculator {
	
	public int sum(int a, int b) {
		int result = 0;  // return 값이 있어야 하는 경우
		result = a + b;
		return result;
	}
	
	public void save(int a) {   // void - 실제로 눈에 보이는 결과값이 나온것은 아니지만 저장이라는 함수가 처리됨
		// 대충 코드 있다고 가정
	}
	// 위 코드에서 결국 어떠한 처리가 정상적으로 됐는지 안됐는지와 같은 값을 ui에 전달하여 정상처리됐다는 메시지를 내보낼지, 
	// 오류가 났다는 메시지를 내보낼지 이러한 것도 정할 수 있는 것

}
