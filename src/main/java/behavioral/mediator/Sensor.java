package behavioral.mediator;

public class Sensor {
	
	public boolean checkTemperature(int temperature) {
		System.out.println("Temperature reached " + temperature + " degrees Celsius");
		return true;
	}
}
