
public class Bike extends Vehicle {

	private int engineCC;

	public Bike(String brand, int speed, int engineCC) {
		super(brand, speed);
		this.engineCC = engineCC;
	}

	
	
	public int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	
	
	public void showDetails() {
		super.showDetails();
		System.out.println("EngineCC :" + engineCC);
	}
	
	

}
