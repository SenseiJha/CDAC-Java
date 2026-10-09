package t28027_Sidhant_A02;


import java.util.Scanner;

public class SimpleCalculator_8 {
    static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operator.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result = calculate(a, b, operator);

        if (!Double.isNaN(result)) {
            System.out.println("Result = " + result);
        }

        sc.close();
    }
}
