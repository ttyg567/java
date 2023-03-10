package statics;

public class Car {
	private String name;
	private String maker;
	public static String makerName = "HD";
	/* static 으로 선언하면
	 * 객체를 새로 만들 때
	 * 해당 속성이 넘어가지 않는다
	 * 일반적으로 객체를 새로 만들면
	 * name, maker 만 넘어가는데
	 * 필요에 따라 해당 속성을 받으려면
	 * 객체를 선언할 때 
	 * Car.makerName 으로 해서 넘긴다*/
	
	
	/* 
	 * static 함수는 유틸리티로 많이 사용하는데,
	 * 다른 클래스에 있는 함수를 객체 생성 없이 가져와서 사용하고 싶으면 그렇게 하면된다
	 * 다만, 그 안에 들어가는 변수가 static 변수여야만 가능하다
	 * makeAccountNum 파일 참고*/
	
	public Car() {
	}
	
	
	public Car(String name) {
		this.name = name;	
	}
	
	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}

	
	
}
