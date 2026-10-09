package t28027_Sidhant_A04;

import java.util.Scanner;

class ElectricityBill_4 {
    long consumerNumber;
    String consumerName;
    int units;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Consumer Number: ");
        consumerNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        units = sc.nextInt();
    }

    double calculateBill() {
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        } else {
            bill = (100 * 2) + (100 * 3)
                   + (units - 200) * 5;
        }

        return bill;
    }

    void display() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: Rs. " + calculateBill());
    }
    public static void main(String[] args) {
        ElectricityBill_4 eb = new ElectricityBill_4();

        eb.read();

        if (eb.units < 0) {
            System.out.println("Invalid units consumed.");
        } else {
            eb.display();
        }
    }
}
