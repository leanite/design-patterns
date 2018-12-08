package behavioral.mediator;

public interface WashingMachineMediator {
	
	void start();
	void wash();
	void open();
	void closed();
	void on();
	void off();
	boolean checkTemperature(int temp);
}
