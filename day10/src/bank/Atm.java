package bank;

public class Atm {

	public static void main(String[] args) {
		
		Account acc1 = null;
		try {
			acc1 = new Account(-10000);
			acc1.withdraw(200000);
			System.out.println(acc1);
		} catch (Exception e) {
			System.out.println(MakeMessage.makeMessage(e.getMessage()));
			System.out.println(e.getMessage());
		}

	}

}
