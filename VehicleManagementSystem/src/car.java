
public class car extends Vehicle {

	private String fueltype;

	public car(String brand, int speed, String fueltype) {
		super(brand, speed);
		this.fueltype = fueltype;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public void showDetails() {
		super.showDetails();
		System.out.println("Fueltype : "+ fueltype);
	}
	
	
	
}
