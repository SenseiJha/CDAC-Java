package t28027_Sidhant_A05;

public class ElectricCar_2 extends Car_2 {
	double batteryCapacity;
	int chargingTime;
	public ElectricCar_2(int vehicleNo, String brand, double price, String model, String fuelType,
			double batteryCapacity, int chargingTime) {
		super(vehicleNo, brand, price, model, fuelType);
		this.batteryCapacity = batteryCapacity;
		this.chargingTime = chargingTime;
	}
	
	public double calculateRange() {
		return (this.batteryCapacity / this.chargingTime) * 100;
	}
	
	public void displayElectricCarDetails() {
		this.displayCarDetails();
		System.out.println("Range : "+this.calculateRange()+" Kms");
	}
}
