package case2;

import java.util.ArrayList;

/**
 * Represents a customer in the e-commerce system.
 */
public class Customer {
    public int customerId;
    public String name;
    public String email;
    private String password;
    public ShoppingCart cart;

    /**
     * Constructs a new Customer.
     */
    public Customer(int customerId, String name, String email, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cart = new ShoppingCart();
    }

    /**
     * Registers a new customer.
     */
    public void register() {
        System.out.println(name + " has registered with email: " + email);
    }

    /**
     * Logs in the customer.
     */
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful!");
            return true;
        }
        System.out.println("Invalid credentials!");
        return false;
    }

    /**
     * Displays a list of available products.
     * @param products the list of products
     */
    public void viewProducts(ArrayList<Product> products) {
        System.out.println("Available Products:");
        for (Product product : products) {
            product.getDetails();
        }
    }

    /**
     * Adds a product to the customer's shopping cart.
     */
    public void addToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    /**
     * Proceeds to checkout and calculates the total price.
     */
    public void checkout() {
        cart.calculateTotalPrice();
        System.out.println("Total Price: $" + cart.totalPrice);
    }
}

