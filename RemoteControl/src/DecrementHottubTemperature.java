
public class DecrementHottubTemperature implements Command{
	
	Hottub hottub;
	
	public  DecrementHottubTemperature(Hottub hottub) {
		
		this.hottub = hottub;
		
		
	}
	public void execute() {
		
		if (hottub.getTemperature() >= 81) {
		hottub.setTemperature(hottub.getTemperature() - 1);
		System.out.println("The temperature has decreased by 1. The temperature is now " + hottub.getTemperature());
		}
		else System.out.println("Hottub is at minimum temperature. The temperature is now " + hottub.getTemperature());
	}

}
