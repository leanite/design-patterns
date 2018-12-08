package behavioral.mediator;

public class Motor {
	
	public void startMotor() {
		System.out.println("Starting motor ...");
	}

	public void rotateDrum(int rpm) {
		System.out.println("Drum is rotating at "+ rpm +" rpm ...");
	}
}
