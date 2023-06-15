
public class IncrementHottubTemperature implements Command {

	Hottub hottub;
	
	public  IncrementHottubTemperature(Hottub hottub) {
		
		this.hottub = hottub;
		
		
	}
	public void execute() {
		
		if (hottub.getTemperature() <= 109) {
		hottub.setTemperature(hottub.getTemperature() + 1);
		System.out.println("The temperature has increased by 1. The temperature is now " + hottub.getTemperature());
		}
		else System.out.println("Hottub is at max temperature. The temperature is now " + hottub.getTemperature());
	}
}
