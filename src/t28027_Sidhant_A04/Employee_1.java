package t28027_Sidhant_A04;

import java.util.Scanner;

class Employee_1 {
    int employeeId;
    String employeeName;
    double basicSalary;
    double hra;
    double da;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    double calculateSalary() {
        return basicSalary + hra + da;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateSalary());
    }
    
    public static void main(String[] args) {
        Employee_1 e = new Employee_1();

        e.read();
        e.display();
    }
}
