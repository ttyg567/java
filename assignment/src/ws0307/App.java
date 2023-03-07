package ws0307;

import java.util.Scanner;

public class App {
	
		
	public static void main(String[] args) {
		
		Account acc = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Input Command(c, w, d, s, q)..");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye..");
				break;
			
			// ***********계좌 생성 *****************	
			}else if (cmd.equals("c")) {
				System.out.println("Create Account");
				System.out.println("Input Account Info[name, accHolder, balance]");
				System.out.println("Input Name: ");
				String name = sc.next();
				System.out.println("Input AccHolder: ");
				String accHolder = sc.next();
				System.out.println("Input Balance: ");
				double balance = Double.parseDouble(sc.next());
				try {
					acc = new Account(name, accHolder, balance);
					System.out.println(acc);
				} catch (BelowZeroException e1) { 
					System.out.println(e1.getMessage());
				}
				
				
			
			// *********** 계좌 출금 ***************	
			}else if (cmd.equals("w")) {
				System.out.println("Withdraw: ");
				System.out.println("Input Withdraw Money ..");
				double money = Double.parseDouble(sc.next());
				try {
					acc.withdraw(money);
				} catch (BelowZeroException e1) {
					System.out.println(e1.getMessage());
				} catch (ZeroBalanceException e2) {
					System.out.println(e2.getMessage());
				}
				System.out.println(acc);
			
				
			// ********** 계좌 입금 ************	
			}else if (cmd.equals("d")) {
				System.out.println("Deposit: ");
				System.out.println("Input Deposit Money ..");
				double money = Double.parseDouble(sc.next());
				try {
				acc.deposit(money);
				} catch(BelowZeroException e1) {
					System.out.println(e1.getMessage());
				}
				System.out.println(acc);
			
				
			// ********** 계좌 정보 조회 ************
			}else if (cmd.equals("s")) {
				System.out.println("Select: ");
				System.out.println(acc);
				System.out.println(acc.getBalance());
				
			}else {
				System.out.println("다시 입력하세요.");
			}
			
			
			
		}
		
		sc.close();
		
		
		
	}
}
