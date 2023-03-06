package shape;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	
	// constructor
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);   // 상위 클래스의 값을 가져옴
		this.width = width;
		this.height = height;
	}

	
	// 아래 함수들은 필수적으로 있어야함
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircumn() {
		return (width + height) * 2;
	}
	
	



}
