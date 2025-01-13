package Workshop1;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the quantity of items:");
        int quantity = scanner.nextInt();

       
        System.out.println("Enter the price per item:");
        double pricePerItem = scanner.nextDouble();

        // Calculate the total cost using the formula: Total Cost = Quantity * Price per item
        double totalCost = quantity * pricePerItem;

        
        System.out.println("The total cost is: " + totalCost);

        
        scanner.close();

	}

}
