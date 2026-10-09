package t28027_Sidhant_A05;

public class Car_2 extends Vehicle_2 {
	String model;
	String fuelType;
	
	public Car_2(int vehicleNo, String brand, double price, String model, String fuelType) {
		super(vehicleNo, brand, price);
		this.model = model;
		this.fuelType = fuelType;
	}
	
	public double calculateInsurance() {
		return (this.price * 0.21);
	}
	
	public void displayCarDetails() {
		this.displayVehicleDetails();
		System.out.println("Model : "+this.model);
		System.out.println("Fuel Type : "+this.fuelType);
		System.out.println("Car Insurance : "+this.calculateInsurance());
	}
}
