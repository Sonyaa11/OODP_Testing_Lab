package Tutorial1;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the temperature in celcius: "); 
		double celcius = scanner .nextDouble();
		
		double fahrenheit = (celcius * 9/5) + 32;
		System.out.println("Temperature in fahrenheit: " + fahrenheit);
		scanner .close();		
		
		
		
	}

}
