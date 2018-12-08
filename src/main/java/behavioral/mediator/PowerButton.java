package behavioral.mediator;

public class PowerButton implements Component {
	
	private WashingMachineMediator mediator;
	
	@Override
    public void setMediator(WashingMachineMediator mediator) {
		this.mediator = mediator;
	}
	
	public void press() {
		System.out.println("Power button pressed ...");
		mediator.start();
	}

}
