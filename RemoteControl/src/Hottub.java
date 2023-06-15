public class Hottub {
	boolean on;
	int temperature;
	int max_temp = 110;
	int min_temp = 80;

	public Hottub() {
	}

	public void on() {
		on = true;
		heat();
	}

	public void off() {
		on = false;
	}

	public void bubblesOn() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("Hottub is not bubbling");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		}
	}

	public void setTemperature(int temperature) {
		
		if (temperature >= min_temp && temperature <= max_temp) {
		
			this.temperature = temperature;
		}
		else System.out.println("Select a temperature between 80 and 110.");
	}
	
	public int getTemperature() {
		
		return temperature;
	}
	public void heat() {
		temperature = 105;
		System.out.println("Hottub is heating to a steaming 105 degrees");
	}

	public void cool() {
		temperature = 98;
		System.out.println("Hottub is cooling to 98 degrees");
	}

}
