package Workshop3;

abstract class Vehicle {
 
 abstract void startEngine();
 abstract void stopEngine();
}

class Car extends Vehicle {
 @Override
 void startEngine() {
     System.out.println("The car engine starts with a push button.");
 }

 @Override
 void stopEngine() {
     System.out.println("The car engine stops when the key is turned off.");
 }
}

class Motorcycle extends Vehicle {
 @Override
 void startEngine() {
     System.out.println("The motorcycle engine starts with a kickstart.");
 }

 @Override
 void stopEngine() {
     System.out.println("The motorcycle engine stops when the kill switch is used.");
 }
}


public class Task3 {
 public static void main(String[] args) {
  
     Vehicle car = new Car();
     Vehicle motorcycle = new Motorcycle();

     System.out.println("Car Operations:");
     car.startEngine();
     car.stopEngine();

     System.out.println("\nMotorcycle Operations:");
     motorcycle.startEngine();
     motorcycle.stopEngine();
 }
}

