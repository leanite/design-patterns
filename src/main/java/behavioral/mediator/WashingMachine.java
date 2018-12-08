package behavioral.mediator;

public class WashingMachine implements Component {

	private WashingMachineMediator mediator;
	
	@Override
	public void setMediator(WashingMachineMediator mediator) {
		this.mediator = mediator;
	}
	
	public void start() {
		mediator.open();
	}
	
	public void wash() {
		mediator.wash();
	}
}
