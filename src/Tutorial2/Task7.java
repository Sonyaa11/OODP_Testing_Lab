package Tutorial2;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        AreaCalculator areaCalc = new AreaCalculator();

		        // Calculate and display area of a rectangle
		        System.out.println("Area of Rectangle: " + areaCalc.calculateArea1(10, 5) + " square units");

		        // Calculate and display area of a square
		        System.out.println("Area of Square: " + areaCalc.calculateArea(6) + " square units");

		        // Calculate and display area of a triangle
		        System.out.println("Area of Triangle: " + areaCalc.calculateArea1(8, 4.5) + " square units");
		    }
		}

		// Class with overloaded methods for area calculation
		class AreaCalculator {

		    // Method to calculate area of a rectangle
		    double calculateArea1(double length, double width) {
		        return length * width;
		    }

		    // Method to calculate area of a square
		    double calculateArea(double side) {
		        return side * side;
		    }

		    // Method to calculate area of a triangle
		    double calculateArea(double base, double height) {
		        return 0.5 * base * height;
		    }
		


	}


