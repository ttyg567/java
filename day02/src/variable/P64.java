package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2345;
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def";
		System.out.printf("%d %4.2f %s \n",a,d,str1);
		// %4.2f 에서 4는 소수점 앞 4자리를 표시, 소수점 아래는 2자리 표시하라는 의미인데, 그 아래는 반올림
		if(str1 == str2) {   //stack 영역에 있는 주소값이 둘 다 같으니 true
			System.out.println("OK");
		}
		
		if(str1.equals(str2)) {   // string과 string을 비교
			System.out.println("OK2");
		}
		
		String str3 = new String("abc");
		String str4 = new String("abc");
	

	}

}
