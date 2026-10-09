package t28027_Sidhant_A01;


import java.util.Scanner;

public class TemperatureConversion_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        sc.close();
    }
}
