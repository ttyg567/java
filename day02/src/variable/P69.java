package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";
		str = str.toUpperCase();
		System.out.println(str);
		
		String str2 = str.replace('A', 'Z');
		System.out.println(str2);
		
		int lng = str.length();
		System.out.println(lng);
		
		int t = str.indexOf("B");
		System.out.println(t);
		
		char c = str.charAt(0);
		System.out.println(c);
		
		String str3 = str.substring(1, 3);
		System.out.println(str3);
		
		
//		
//		String id = "";
//		String domain = "";
//		
//		System.out.println("%s , %s", id, domain);
//		

	}

}
