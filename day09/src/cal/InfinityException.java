package cal;

// 사용자 정의 예외 클래스 선언
public class InfinityException extends Exception {
	
	public InfinityException() {
	
	}
	
	public InfinityException(String msgcode) {
		super(msgcode);
	}

}
