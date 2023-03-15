package ws0302;

public class App {

	public static void main(String[] args) {
		
		
		// 6개의 Account 객체 배열을 만들어 다음과 같은 객체를 입력 한다.
		Account accList[] = new Account[6];
		accList[0] = new Account("james1", 10000, 0.35, "VIP"); 
		accList[1] = new Account("james2", 10000, 0.45, "GOLD");
		accList[2] = new Account("james3", 10000, 0.55, "SIVER");
		accList[3] = new Account("james4", 10000, 0.15, "GOLD");
		accList[4] = new Account("james5", 10000, 0.28, "SIVER");
		accList[5] = new Account("james6", 10000, 0.31, "VIP");
		
		// 6개의 계좌 정보를 출력 하시오
		for(int i=0; i < accList.length; i++) {
			System.out.println(accList[i].toString());
		}
		
		
		// 모든 계좌의 잔액과 현재 이자금액을 출력 하시오
		for(int i=0; i < accList.length; i++) {
			System.out.printf("balance: %.2f, Interest: %.2f \n", accList[i].getBalance() ,accList[i].getInterest());
		}
		
		// VIP들의 잔액의 합과 평균을 출력 하시오
		double sum = 0;
		double avg = 0;
		int cnt = 0;
		for(int i=0; i < accList.length; i++) {
			if(accList[i].getGrade().equals("VIP")) {
				sum += accList[i].getBalance();
				cnt ++;
				}
			}
			avg = (sum*1.0) / cnt;
			System.out.printf("VIP 고객의 잔액의 합은: %.2f, 평균은: %.2f", sum, avg);
			
			
		
		
		
		
		
		
		

	}

}
