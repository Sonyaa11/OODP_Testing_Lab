package Workshop1;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a char:");
		char var1 = scanner.next().charAt(0);
		 
		System.out.println("Enter a doule");
		double var2 = scanner.nextDouble();
		
		System.out.println("Enter a integer");
		int var3 = scanner.nextInt();
		
		scanner.close();
		
		  System.out.println("The character you entered is: " + var1);
	        System.out.println("The double you entered is: " + var2);
	        System.out.println("The integer you entered is: " + var3);
		
	}

}
