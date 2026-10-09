package t28027_Sidhant_A04;


import java.util.Scanner;

class ProductBilling_3 {
    int productId;
    String productName;
    double price;
    int quantity;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
    }

    double calculateBill() {
        return price * quantity;
    }

    void display() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + calculateBill());
    }
    
    public static void main(String[] args) {
    	ProductBilling_3 p = new ProductBilling_3();

        p.read();
        p.display();
    }
}
