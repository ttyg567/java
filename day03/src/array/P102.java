package array;

public class P102 {

	public static void main(String[] args) {
		
		int a = 100;
		
		// int arr [] = new int[]; -> 오류나는 이유: 개수가 정의되어 있지 않아서
		int arr [] = new int[3]; //배열은 reference 타입																																																																																							
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr);   //주소 정보가 찍힘
		
		for(int i=0; i < arr.length; i++) {
			System.out.printf("%d \t", arr[i]);
		}
		
		System.out.println("Type 2 ");
		
		for(int data : arr) {
			System.out.printf("%d \t", data);
		}
		
		

	}

}
