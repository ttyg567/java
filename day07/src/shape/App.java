package shape;

public class App {

	public static void main(String[] args) {
		// Shape s = new Shape(10,10);  -> 생성할 수 없음, 도형이라는 실체가 없음
		
		Shape s1 = new Rectangle(10, 20, 100, 80);
		System.out.println(s1.getXY());
		System.out.println(s1.getArea());
		System.out.println(s1.getCircumn());
		
		

	}

}
