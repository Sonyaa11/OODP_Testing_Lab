package Workshop1;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature in celcius");
		double celsius = scanner.nextDouble();
		
		// Convert Celsius to Fahrenheit using the formula F = C * 9/5 + 32
        double fahrenheit = celsius * 9 / 5 + 32;
        
        System.out.println("The temperature in fahrenheit is :"+ fahrenheit);
        
        scanner.close();
		}

}
