package com.kbstar.dto;

public class TransactionDTO {
	private String date;
	private String accNo;
	private double balance;
	private String type;  // I / O 입금 및 출금
	private String desc;
	
	/* Key 값은 유일한 값을 잡아야 한다, 해당 키를 통해 접근할 수 있는 유니크한 속성*/
	
	public TransactionDTO() {
	}

	public TransactionDTO(String date, String accNo, double balance, String type, String desc) {
		this.date = date;
		this.accNo = accNo;
		this.balance = balance;
		this.type = type;
		this.desc = desc;
	}
	
	

	@Override
	public String toString() {
		return "TransactionDTO [date=" + date + ", accNo=" + accNo + ", balance=" + balance + ", type=" + type
				+ ", desc=" + desc + "]";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
