package ClassesObjectMethods.ex1;

public class Product {
    private int productId;
    private double price;

    public Product(int productId, double price, String name) {
        this.productId = productId;
        this.price = price;
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    private String name;
}

