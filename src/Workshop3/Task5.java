package Workshop3;

interface PaymentMethod {
 void processPayment(double amount);
}

class Esewa implements PaymentMethod {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing payment of NPR " + amount + " through eSewa.");
 }
}

class Khalti implements PaymentMethod {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing payment of NPR " + amount + " through Khalti.");
 }
}

public class Task5{
 public static void main(String[] args) {

     PaymentMethod esewa = new Esewa();
     PaymentMethod khalti = new Khalti();

     System.out.println("Payment using eSewa:");
     esewa.processPayment(1500.00);

     System.out.println("\nPayment using Khalti:");
     khalti.processPayment(2500.00);
 }
}
