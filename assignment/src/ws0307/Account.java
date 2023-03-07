package ws0307;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;
	
	
	
	// Constructor - 음수 예외 상황
	
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNum();
	}


	public Account(String name, String accHolder, double balance) throws BelowZeroException {
		this();
		this.name = name;
		this.accHolder = accHolder;
		if (balance < 0) {
            throw new BelowZeroException("잔액은 0보다 커야합니다.");
        }
		this.balance = balance;
	}


	public Account(String accNo, String name, String accHolder, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	// 계좌 정보 조회
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	
	
	// 잔액 조회
	public double getBalance() {
		return balance;
	}
	
	// 입금 - 음수 예외 사항
	public void deposit(double money) throws BelowZeroException {
		
		// 음수 예외
		if (money < 0) {
			throw new BelowZeroException("음수를 입력하였습니다.");	
		}
		
		balance += money;
				
	}
	
	
	
	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황
	public void withdraw(double money) throws BelowZeroException, ZeroBalanceException {
		//잔액부족 예외
		if (money > balance) {
			throw new BelowZeroException("잔액이 부족 합니다.");	
		}
		
		// 음수 예외
		if (money < 0) {
			throw new BelowZeroException("음수를 입력하였습니다.");	
		}
		this.balance -= money;
	}
}
