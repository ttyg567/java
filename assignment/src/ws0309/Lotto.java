package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class Lotto {
	
	private Set<Integer> winningNum;
	private double prizeMoney;
	
	/* ------------------ Constructors ------------------  */
	public Lotto() {
		this.winningNum = new HashSet<Integer>();
        this.prizeMoney = 0.0;
	}

	
	/* ------------------ toString ------------------  */
	
	@Override
	public String toString() {
		return "Lotto [winningNum=" + winningNum + ", prizeMoney=" + prizeMoney + "]";
	}
	
	
	/* -------- Getter, Setter --------  */
	public Set<Integer> getWinningNum() {
		return winningNum;
	}
	
	
	/* -------- 당첨번호, 당첨금 생성 --------  */


		public void makeWinningNumberMoney() {
	    
		// 랜덤 번호
	    Random r = new Random();
	    while(this.winningNum.size() < 3) {
	        int num = r.nextInt(25) + 1;
	        winningNum.add(num);
	    }
	    // 랜덤 금액
	    this.prizeMoney = r.nextDouble() * 2000000000 + 1;
	}

	
			
	
	/* -------- 등수 확인 --------  */
		
	public int checkRanking(ArrayList<Integer> myNum) {
		
		int cnt = 0; 
		for (int num : myNum) {
            if (this.winningNum.contains(num)) {
                cnt++;
            }
        }
		
		int grade = 0;
		
		switch (cnt) {
        case 3:
            grade = 1;
            break;
        case 2:
            grade = 2;
            break;
        case 1:
            grade = 3;
            break;
        default:
            grade = 0;
            break;
		}

		return grade;
	}
	

	
	/* -------- 등수에 따른 금액 비율 결정 --------  */
	
	public double prizeMoney(int grade) {
	    double prize = 0;
	    
	    switch (grade) {
	        case 1:
	            prize = prizeMoney*0.5; // 1등 상금: 전체 상금 50%	            break;
	        case 2:
	            prize = prizeMoney*0.3; // 2등 상금: 전체상금 30%
	            break;
	        case 3:
	            prize = prizeMoney*0.2; // 3등 상금: 전체상금 20%
	            break;
	        default:
	            break;
	    }
	    
	    return prize;
	}

	
	






}
	
	
	
	

