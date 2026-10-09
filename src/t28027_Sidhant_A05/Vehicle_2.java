package t28027_Sidhant_A05;

public class Vehicle_2 {
	int vehicleNo;
	String brand;
	double price;
	
	public Vehicle_2(int vehicleNo, String brand, double price) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.price = price;
	}
	
	public double calculateTax() {
		return (0.2 * price);
	}
	
	public void displayVehicleDetails() {
		System.out.println("Vehicle Number : "+this.vehicleNo);
		System.out.println("Brand Name : "+this.brand);
		System.out.println("Price : "+this.price);
		System.out.println("Tax Amount : "+this.calculateTax());
	}
	
	public static void main(String[] args) {
		ElectricCar_2 tesla = new ElectricCar_2(7363, "Tesla", 19000000, "Model-S Flagship Sedan", "Electric", 250, 15);
		tesla.displayElectricCarDetails();
	}
}
