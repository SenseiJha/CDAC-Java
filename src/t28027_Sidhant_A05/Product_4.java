package t28027_Sidhant_A05;

class Product_4 {
    int productId;
    String productName;
    double price;

    public Product_4(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double calculateDiscount() {
        return this.price * 0.10;
    }

    public void displayProductDetails() {
        System.out.println("Product ID : " + this.productId);
        System.out.println("Product Name : " + this.productName);
        System.out.println("Price : " + this.price);
    }
    public static void main(String[] args) {

        Electronics_4 e = new Electronics_4(101,"Laptop",60000,"HP",2);
        Clothing_4 c = new Clothing_4(201,"T-Shirt",1500,"L","Cotton");
        e.displayElectronicsDetails();
        System.out.println();
        c.displayClothingDetails();
    }
}