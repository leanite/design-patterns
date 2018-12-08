package behavioral.mediator;

public class Heater implements Component {

	private WashingMachineMediator mediator;
	
	@Override
	public void setMediator(WashingMachineMediator mediator) {
		this.mediator = mediator;
	}

	public void on(int temperature) {
		System.out.println("Heater is on ...");
        System.out.println("Temperature is set to "+ temperature +" degrees Celsius");

		if (mediator.checkTemperature(temperature)) {
			mediator.off();
		}
	}
	
	public void off() {
		System.out.println("Heater is off ...");
		mediator.wash();
	}
}
