package behavioral.mediator;

public class CottonProgramMediator implements WashingMachineMediator {
	
	private final WashingMachine washingMachine;
	private final Heater heater;
	private final Motor motor;
	private final Sensor sensor;
	private final StainRemoval stainRemoval;
	private final Valve valve;
	
	public CottonProgramMediator(WashingMachine washingMachine, Heater heater,
                                 StainRemoval stainRemoval, Valve valve) {
		this.washingMachine = washingMachine;
		this.heater = heater;
		this.motor = new Motor();
		this.sensor = new Sensor();
		this.stainRemoval = stainRemoval;
		this.valve = valve;
	}

	@Override
	public void start() {
		System.out.println("Cotton program started ...");
		washingMachine.start();
	}

	@Override
	public void wash() {
        System.out.println("Adding detergent ...");
        System.out.println("Adding softener ...");
        stainRemoval.low();
        motor.startMotor();
		motor.rotateDrum(700);
	}

	@Override
	public void open() {
		valve.open();
	}

	@Override
	public void closed() {
		valve.closed();
	}

	@Override
	public void on() {
		heater.on(40);
	}

	@Override
	public void off() {
		heater.off();
	}

	@Override
	public boolean checkTemperature(int temperature) {
		return sensor.checkTemperature(temperature);
	}
}
