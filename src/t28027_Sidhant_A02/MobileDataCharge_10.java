package t28027_Sidhant_A02;


import java.util.Scanner;

public class MobileDataCharge_10 {
    static int calculateCharge(double data) {
        if (data <= 1) {
            return 50;
        } else if (data <= 5) {
            return 100;
        } else if (data <= 10) {
            return 200;
        } else {
            return 350;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data usage in GB: ");
        double data = sc.nextDouble();

        if (data < 0) {
            System.out.println("Invalid data usage.");
        } else {
            System.out.println("Mobile Data Charge = Rs. "
                    + calculateCharge(data));
        }

        sc.close();
    }
}
