package Workshop1;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        // Calculate the area using the formula: Area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

       
        System.out.println("The area of the circle is: " + area);

        
        scanner.close();

	}

}
