package Workshop1;

import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the sides of the triangle
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        // Calculate the semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}



	


