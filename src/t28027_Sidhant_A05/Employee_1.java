package t28027_Sidhant_A05;

public class Employee_1 {
	int employeeId;
	String employeeName;
	double basicSalary;
	
	public Employee_1(int employeeId, String employeeName, double basicSalary) {
		this.basicSalary = basicSalary;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee ID : "+this.employeeId);
		System.out.println("Employee Name : "+this.employeeName);
		System.out.println("Basic Salary : "+this.basicSalary);
	}
	
	public static void main(String[] args) {
		Manager_1 a = new Manager_1(101, "SJ", 10000, "Air Dragons", 1200);
		a.displayManagerDetails();
	}
}
