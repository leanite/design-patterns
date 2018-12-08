package behavioral.mediator;

public class Valve implements Component {

	private WashingMachineMediator mediator;
	
	@Override
	public void setMediator(WashingMachineMediator mediator){
		this.mediator = mediator;
	}
	
	public void open(){
		System.out.println("Valve is open ...");
		System.out.println("Filling the tub with water ...");
		mediator.closed();
	}
	
	public void closed(){
		System.out.println("Valve is closed ...");
		mediator.on();
	}
}
