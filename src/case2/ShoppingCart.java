package case2;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a shopping cart for a customer.
 */
public class ShoppingCart {
    private Map<Product, Integer> cartItems;
    public double totalPrice;

    /**
     * Constructs a new ShoppingCart.
     */
    public ShoppingCart() {
        this.cartItems = new HashMap<>();
        this.totalPrice = 0.0;
    }

    /**
     * Adds a product to the shopping cart.
     * @param product the product
     * @param quantity the quantity of the product
     */
    public void addProduct(Product product, int quantity) {
        if (product.checkAvailability(quantity)) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            product.stockQuantity -= quantity;
            System.out.println(quantity + " of " + product.name + " added to the cart.");
        } else {
            System.out.println("Insufficient stock for " + product.name);
        }
    }

    /**
     * Removes a product from the shopping cart.
     * 
     * @param product the product to remove
     */
    public void removeProduct(Product product) {
        if (cartItems.containsKey(product)) {
            int quantity = cartItems.remove(product);
            product.stockQuantity += quantity;
            System.out.println(product.name + " removed from the cart.");
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    /**
     * Calculates the total price of items in the shopping cart.
     */
    public void calculateTotalPrice() {
        totalPrice = 0.0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            totalPrice += entry.getKey().price * entry.getValue();
        }
    }

    /**
     * Displays the items in the shopping cart.
     */
    public void viewCartItems() {
        System.out.println("Cart Items:");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey().name + " - Quantity: " + entry.getValue());
        }
    }
}


