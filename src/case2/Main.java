package case2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class to demonstrate the e-commerce shopping cart system.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        // Load Products
        products.add(new Product(1, "Laptop", 800.0, 10));
        products.add(new Product(2, "Phone", 500.0, 20));
        products.add(new Product(3, "Headphones", 50.0, 50));

        // Register Customer
        System.out.println("Register Customer:");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        Customer customer = new Customer(1, name, email, password);
        customer.register();

        // Login
        System.out.println("\nLogin:");
        System.out.print("Enter Email: ");
        String loginEmail = scanner.nextLine();
        System.out.print("Enter Password: ");
        String loginPassword = scanner.nextLine();
        if (!customer.login(loginEmail, loginPassword)) {
            return;
        }

        // Shopping Actions
        boolean shopping = true;
        while (shopping) {
            System.out.println("\n=== Shopping Menu ===");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    customer.viewProducts(products);
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Product selectedProduct = products.stream()
                            .filter(p -> p.productId == productId)
                            .findFirst()
                            .orElse(null);
                    if (selectedProduct != null) {
                        customer.addToCart(selectedProduct, quantity);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    customer.cart.viewCartItems();
                    break;

                case 4:
                    customer.checkout();
                    shopping = false;
                    break;

                case 5:
                    shopping = false;
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
        scanner.close();
    }
}


