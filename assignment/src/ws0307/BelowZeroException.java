package ws0307;

public class BelowZeroException extends Exception {

	public BelowZeroException() {
		
	}
	
	public BelowZeroException(String msgcode) {
		super(msgcode);
	}
}
