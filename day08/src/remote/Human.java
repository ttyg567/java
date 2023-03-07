package remote;

public class Human {

	public static void main(String[] args) {
		// TV 제어
		Remote remote = new Tv();
		// Audio 제어
		// Remote remote = new Audio();
		remote.turnOff();
		remote.turnOn();

	}

}
