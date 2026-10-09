package t28027_Sidhant_A05;

public class Manager_1 extends Employee_1 {
	String department;
	double bonus;
	public Manager_1(int employeeId, String employeeName, double basicSalary, String department, double bonus) {
		super(employeeId, employeeName, basicSalary);
		this.department = department;
		this.bonus = bonus;
	}
	
	public double calculateTotalSalary() {
		double totalSalary = basicSalary + bonus;
		return totalSalary;
	}
	
	public void displayManagerDetails() {
		this.displayEmployeeDetails();
		System.out.println("Department : "+this.department);
		System.out.println("Bonus : "+this.bonus);
		System.out.println("Total Salary : "+this.calculateTotalSalary());
	}
}
