package t28027_Sidhant_A01;

import java.util.Scanner;

public class LargestOfTwo_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest number = " + a);
        } else if (b > a) {
            System.out.println("Largest number = " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}

