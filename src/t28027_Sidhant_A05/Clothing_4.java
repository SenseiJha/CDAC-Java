package t28027_Sidhant_A05;

class Clothing_4 extends Product_4 {
    String size;
    String material;

    public Clothing_4(int productId, String productName, double price, String size, String material) {
        super(productId, productName, price);
        this.size = size;
        this.material = material;
    }

    public double calculateFinalPrice() {
        return this.price - this.calculateDiscount();
    }

    public void displayClothingDetails() {
        this.displayProductDetails();
        System.out.println("Size : " + this.size);
        System.out.println("Material : " + this.material);
        System.out.println("Discount : " + this.calculateDiscount());
        System.out.println("Final Price : " + this.calculateFinalPrice());
    }
}
