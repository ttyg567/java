package ws0302;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;
	
	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum();
	}

	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}
	
	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	

	public double getBalance() {
		return balance;
	}

	public String getGrade() {
		return grade;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}
	
	
	
	//*******************기능***********************
	
	// 입금
	public void deposit(double money) {
			
		if (money <= 0) {
			System.out.println("입금 금액을 확인하세요.");
			return;
		}
		this.balance += money;
			
	}
		
	//출금
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
	
	// 현재 이자금액
	public double getInterest() {
		return this.balance * this.rate;
	}
	
	
	

}
