package Workshop2;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class Task7 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInt = calculator.add(5, 8);
        System.out.println("Sum of 5 and 8 (two integers): " + sumInt);

        int sumIntThree = calculator.add(10, 15, 20);
        System.out.println("Sum of 10, 15, and 20 (three integers): " + sumIntThree);

        double sumDouble = calculator.add(3.5, 2.7);
        System.out.println("Sum of 3.5 and 2.7 (two doubles): " + sumDouble);

        double sumDoubleThree = calculator.add(1.1, 2.2, 3.3);
        System.out.println("Sum of 1.1, 2.2, and 3.3 (three doubles): " + sumDoubleThree);
    }
}
