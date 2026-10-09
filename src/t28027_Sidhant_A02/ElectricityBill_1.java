package t28027_Sidhant_A02;


import java.util.Scanner;

public class ElectricityBill_1 {
    static double calculateBill(int units) {
        double bill = 0;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        } else if (units <= 300) {
            bill = (100 * 2) + (100 * 3)
                   + (units - 200) * 5;
        } else {
            bill = (100 * 2) + (100 * 3)
                   + (100 * 5) + (units - 300) * 7;
        }

        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid units.");
        } else {
            System.out.println("Electricity Bill = Rs. "
                               + calculateBill(units));
        }

        sc.close();
    }
}
