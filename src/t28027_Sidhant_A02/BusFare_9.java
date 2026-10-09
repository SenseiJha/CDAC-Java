package t28027_Sidhant_A02;


import java.util.Scanner;

public class BusFare_9 {
    static int calculateFare(int age) {
        if (age < 5) {
            return 0;
        } else if (age <= 12) {
            return 20;
        } else if (age <= 59) {
            return 40;
        } else {
            return 25;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else {
            int fare = calculateFare(age);
            System.out.println("Bus Fare = Rs. " + fare);

            if (fare == 0) {
                System.out.println("Travel is free.");
            }
        }

        sc.close();
    }
}
