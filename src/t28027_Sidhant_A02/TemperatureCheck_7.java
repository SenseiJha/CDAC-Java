package t28027_Sidhant_A02;


import java.util.Scanner;

public class TemperatureCheck_7 {
    static double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = convertTemperature(celsius);

        System.out.println("Temperature in Fahrenheit = "
                           + fahrenheit);

        if (fahrenheit > 100) {
            System.out.println("Temperature exceeds 100 F.");
        } else {
            System.out.println("Temperature does not exceed 100 F.");
        }

        sc.close();
    }
}
