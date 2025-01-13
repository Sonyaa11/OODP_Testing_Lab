package Workshop1;
	

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        // Prompt the user to enter the width of the rectangle
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        // Calculate the perimeter using the formula P = 2 * (length + width)
        double perimeter = 2 * (length + width);

        // Display the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}

