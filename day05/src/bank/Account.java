package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;

	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum(); //static 을 함께 사용하여 객체를 생성하지 않고 
	}

	public Account(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}

	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	


	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	//잔액조회
	public double getBalance() {
		return balance;
	}
	
	// 출금	
	public void withdraw(double money) {
		if (money <= 0 ) {
			System.out.println("출금 금액을 확인하세요.");
			return;			
		}
		if (this.balance < money) {                   //if else를 사용하면 중간에 해당되는 것에서 끝나는 것이므로 if를 여러개 사용
			System.out.println("잔액이 부족합니다.");
			return;			
		}
		this.balance -= money;
		

	}
	

	// 입금
	public void deposit(double money) {
		
		if (money <= 0) {
			System.out.println("입금 금액을 확인하세요.");
			return;
		}
		this.balance += money;
		
		
		

	}


	

}
