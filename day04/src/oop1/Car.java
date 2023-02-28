package oop1;

// public static void main(String[] args) 이건 필요 없다
public class Car {
	public String name;
	public String color;
	public int size;
	
	//생성자. (constructor) - 속성을 초기화 해주는 역할
	// public 클래스명() {속성 및 속성값(?)}
	public Car() {
		name = "k1";
		color = "red";
		size = 1000;
	}
	
	public Car(String name, String color, int size) { 
		this.name = name;    //this는 app 파일에서 지정한 것을 넣어주는 역할
		this.color = color;
		this.size = size;
	}
	// () 괄호 안에 있는 내용이  argument
	
	public void go() {
		System.out.printf("%s, %s, Go car ... ", this.name, this.color); // 여기서 this는 번지수를 의미함 #100과 같이..
	}
	
	public void stop() {
		System.out.printf("%s, %s, Stop car ...\n", this.name, this.color);
	}

}
