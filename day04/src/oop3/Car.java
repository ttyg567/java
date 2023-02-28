package oop3;

public class Car {
	private String name;
	private String color;
	private int size;
	private int fsize; // 연료함 사이즈 
	private int cfsize; // 현재 기름의 양
	
	
	//생성자. (constructor)
	
	//Default Constructor
	public Car() {
	}

	
	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}


	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}


	//출력하는 역할
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}
	
	
	// 기름을 넣는다.
	// 연료함 양을 초과하여 넣으려고 하면 '다시 주유 하세요.' 출력
	// 음수 값을 입력했을 때도 '다시 주유 하세요.' 출력
	public void setCfsize(int size) {
		
		if(size <= 0 || fsize < (cfsize + size)) {     
			System.out.println("다시 주유 하세요.");
			return;
		}
			this.cfsize += size;
			System.out.printf("cfsize = %d", cfsize);
	}
	
	// 주행을 한다.
	// 1리터 당 10km를 주행할 수 있다.
	// 만약, 입력 받은 distance 값 만큼 주행할 기름이 남아있지 않거나, cfsize 가 0 보다 작으면 주행 못함)
	public void go(int distance) {
		if(cfsize < 0 || cfsize < (distance/10)) {
			System.out.println("주유하신 후 출발 하세요.");
			return;
		}
		System.out.printf("%s %d Go   ...", this.name, distance);
		cfsize = cfsize - (distance/10);
	}
	
	// 멈춘다.
	public void stop() {
		System.out.printf("%s Stop ...", this.name);
		
	}
	
	
	
	
	
	
}