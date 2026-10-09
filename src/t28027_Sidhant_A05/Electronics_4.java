package t28027_Sidhant_A05;

class Electronics_4 extends Product_4 {
    String brand;
    int warranty;

    public Electronics_4(int productId, String productName, double price,String brand, int warranty) {
        super(productId, productName, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    public double calculateFinalPrice() {
        return this.price - this.calculateDiscount();
    }

    public void displayElectronicsDetails() {
        this.displayProductDetails();
        System.out.println("Brand : " + brand);
        System.out.println("Warranty : " + warranty + " years");
        System.out.println("Discount : " + this.calculateDiscount());
        System.out.println("Final Price : " + this.calculateFinalPrice());
    }
}