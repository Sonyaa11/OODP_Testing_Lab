package Workshop1;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius of a cylinder");
		double radius = scanner.nextDouble();
		
		
		System.out.println("Enter the height of a cylinder");
		double height = scanner.nextDouble();
		
		
		 // Calculate the volume of the cylinder using the formula V = πr²h
        double volume = Math.PI * Math.pow(radius, 2) * height;
        
        
        System.out.println("The volume of the cylinder is: "+ volume);
        
        scanner.close();
 
 

	}

}
