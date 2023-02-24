package ifcontrol;

public class P91 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		// 세 가지 수의 최대 값과 최소 값을 구하시오
		
		// a b c
		// a c b
		// c a b
		
		// b a c
		// b c a
		// c b a
		
		int max = 0;
		int min = 0;
		
		if (a > b) {
			if (a > c) {
					if( b> c) {
						max = a;
						min = c;
					}else {
						max = a;
						min = b;
					}
				}else {	
					max = c;
					min = b;
				}
		}else {
				if (b > c) {
					if(a > c) {
						max = b;
						min = c;
					}else {
						max = b;
						min = a;
					}
				}else {
					max = c;
					min = a;
					
				}
			}
		
/* *********************************************************************		
		if( a > b) {
			max = a;
			min = b;
			if(a < c) {
				max = c;
			}
			
			else {
				max = b;
				min = a;
				if(b < c) {
					max = c;
				}
				
			}
		}
		
*/
			
		
//*********************************************************************		
		//max = (a > b) ? ((a > c)? a : c) : (b > c)? b : c;
		//min = (b > a) ? ((a < c)? a : c) : (b < c)? b : c;
		
		

//**********************************************************************
/*
		if (a > b) {
			max = Math.max(a, c);
			min = Math.min(b, c);
		}else {
			max = Math.max(b, c);
			min = Math.min(a, c);
		}
		
*/		
		
			
		
		
		System.out.printf("MAX: %d, MIN: %d", max, min);
		
		}

	}


