package shape;

public abstract class Circle extends Shape {
	
	private double radius;
	
	// contructor
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}




	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	

	@Override
	public double getCircumn() {
		return 2 * radius * Math.PI;
		}

}
