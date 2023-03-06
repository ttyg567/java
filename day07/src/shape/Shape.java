package shape;

public abstract class Shape {
	protected int x;
	protected int y;
	
	// constructors
	public Shape() {
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// methods
	
	// Abstract Method
	public abstract double getArea();
	public abstract double getCircumn();
	
	public String getXY() {
		return x +" , "+ y;   // string result 값은 이렇게 한줄로 출력 가능
		
	}
	
	
	

}
