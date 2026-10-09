package t28027_Sidhant_A02;


import java.util.Scanner;

public class EmployeeSalary_6 {
    static double calculateSalary(double basicSalary) {
        double hra;

        if (basicSalary >= 50000) {
            hra = basicSalary * 0.20;
        } else {
            hra = basicSalary * 0.10;
        }

        return basicSalary + hra;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: Rs. ");
        double basicSalary = sc.nextDouble();

        if (basicSalary < 0) {
            System.out.println("Invalid salary.");
        } else {
            System.out.println("Total Salary = Rs. "
                               + calculateSalary(basicSalary));
        }

        sc.close();
    }
}
