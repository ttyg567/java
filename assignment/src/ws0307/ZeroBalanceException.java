package ws0307;

public class ZeroBalanceException extends Exception {

	public ZeroBalanceException() {
		
	}
	
	public ZeroBalanceException(String msgcode) {
		super(msgcode);
	}
}
