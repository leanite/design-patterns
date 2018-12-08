package behavioral.mediator;


public class MainUsage {

	public static void main(String[] args) {
		WashingMachine washingMachine = new WashingMachine();
		Heater heater = new Heater();
		Valve valve = new Valve();
		PowerButton powerButton = new PowerButton();
		WashingMachineMediator mediator =
				new CottonProgramMediator(washingMachine, heater, new StainRemoval(), valve);
		
		powerButton.setMediator(mediator);
		washingMachine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);
		
		powerButton.press();
	}
}
