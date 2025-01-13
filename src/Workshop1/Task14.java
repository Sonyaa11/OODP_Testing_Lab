package Workshop1;
import java.util.Scanner;

public class Task14 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter amount in USD: ");
	        double usd = scanner.nextDouble();

	        
	        System.out.print("Enter exchange rate (1 USD to target currency): ");
	        double rate = scanner.nextDouble();

	        
	        double converted = usd * rate;
	        System.out.println("Converted amount: " + converted);

	        scanner.close();
	    }

	}


