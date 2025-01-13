package case2;

/**
 * Represents a product in the e-commerce system.
 */
public class Product {
    public int productId;
    public String name;
    public double price;
    public int stockQuantity;

    /**
     * Constructs a new Product.
     * @param productId The id number of product
     * @param name The name of product
     * @param price The price of product
     * @param stockQuantity The quantity of product in stock
     */
    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Displays the details of the product.
     */
    public void getDetails() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: $" + price + ", Stock: " + stockQuantity);
    }

    /**
     * Checks if the product is available in the required quantity.
     * @param quantity The quantity of product
     * @return True or False
     */
    public boolean checkAvailability(int quantity) {
        return stockQuantity >= quantity;
    }
}


