package bank;

public class Account {
	
	private String accNo;
	private double balance;
	
	/*constructors*/
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNum();
	}
	
	public Account(double balance) throws Exception{
		this();  // this는 항상 맨 윗줄에
		if(balance < 0) {
			throw new Exception("ER0001");
		}
		this.balance = balance;
	}
	
	public Account(String accNo, double balance) throws Exception {
		if(balance < 0) {
			throw new Exception("ER0001");
		}
		this.accNo = accNo;
		this.balance = balance;
	}

	

	/* tostring */
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	/* -----------------------    출금    ------------------------ */
	public void withdraw(double money) throws Exception {
		if (money <= 0) {
			throw new Exception("ER0002");
		}
		
		if (balance < money) {
			throw new Exception("ER0003");
		}
		balance -= money;
		
	}



	
	
	

}
