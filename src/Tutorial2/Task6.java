package Tutorial2;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations mathOps = new MathOperations();
		
		System.out.println("Addition of two integers:" + mathOps.add(4,5));
		System.out.println("Addition of two double: "+ mathOps.add(2.3,5.6));
		System.out.println("Addition of three integers:" + mathOps.add(7,8));
		
	}

}
  class MathOperations{
	  int add(int a, int b) {
	        return a + b;
	  }
	  
	  

	    // Method to add two doubles
	    double add(double a, double b) {
	        return a + b;
	    }

	    // Method to add three integers
	    int add(int a, int b, int c) {
	        return a + b + c;
	    }
  }


