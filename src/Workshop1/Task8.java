package Workshop1;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();
		
		
        System.out.println("Enter the time in years:");
        double time = scanner.nextDouble();
		
		
        System.out.println("Enter the rate of interest in %:");
        double rate = scanner.nextDouble();
		
		
		double interest = (principal * time * rate)/100;
		
		  System.out.println("The simple interest is: " + interest);
		  
		  scanner.close();		

	}

}
