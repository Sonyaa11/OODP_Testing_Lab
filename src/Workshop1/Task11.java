package Workshop1;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter the distance in miles:");
	        double miles = scanner.nextDouble();

	        // Convert miles to kilometers (1 mile = 1.60934 kilometers)
	        double kilometers = miles * 1.60934;

	        
	        System.out.println("The distance in kilometers is: " + kilometers);

	        
	        scanner.close();
	    }
	}


