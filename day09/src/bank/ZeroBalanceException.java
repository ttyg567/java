package bank;

public class ZeroBalanceException extends Exception {

	public ZeroBalanceException() {
		
	}
	
	public ZeroBalanceException(String msgcode) {
		super(msgcode);
	}
}
