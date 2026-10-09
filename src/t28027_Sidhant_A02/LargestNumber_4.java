package t28027_Sidhant_A02;


import java.util.Scanner;

public class LargestNumber_4 {
    static int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Largest number = " + findLargest(a, b));

        if (a == b) {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
