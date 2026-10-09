package t28027_Sidhant_A02;


import java.util.Scanner;

public class ProductDiscount_3 {
    static double calculateFinalPrice(double price) {
        double discount;

        if (price >= 10000) {
            discount = 20;
        } else if (price >= 5000) {
            discount = 10;
        } else if (price >= 2000) {
            discount = 5;
        } else {
            discount = 0;
        }

        return price - (price * discount / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: Rs. ");
        double price = sc.nextDouble();

        if (price < 0) {
            System.out.println("Invalid price.");
        } else {
            double finalPrice = calculateFinalPrice(price);
            System.out.println("Final Price = Rs. " + finalPrice);
        }

        sc.close();
    }
}
