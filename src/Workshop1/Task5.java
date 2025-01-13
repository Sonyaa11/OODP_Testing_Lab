package Workshop1;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of one side of square");
        double length = scanner.nextDouble();
        
        double area = length*length;
        System.out.println("The area of the square is: " + area);
        
        scanner .close();      
	}

}
