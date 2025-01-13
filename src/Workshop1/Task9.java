package Workshop1;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter the first integer:");
	        int num1 = scanner.nextInt();

	     
	        System.out.println("Enter the second integer:");
	        int num2 = scanner.nextInt();

	        // Perform arithmetic operations
	        int addition = num1 + num2;
	        int subtraction = num1 - num2;
	        int multiplication = num1 * num2;

	        // Perform division and handle the case of division by zero
	        if (num2 != 0) {
	            double division = (double) num1 / num2;
	            System.out.println("The result of division is: " + division);
	        } else {
	            System.out.println("Division by zero is not allowed.");
	        }

	        
	        System.out.println("The result of addition is: " + addition);
	        System.out.println("The result of subtraction is: " + subtraction);
	        System.out.println("The result of multiplication is: " + multiplication);
   
	        scanner.close();
	    }
	}


