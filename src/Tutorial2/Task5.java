package Tutorial2;

public class Task5 {

	public static void main(String[] args) {
	

		
		        // Create a Dog object
		        Dog dogObj = new Dog("Buddy", 20.5, "Brown", 5, "Golden Retriever", true);

		        // Create a Cat object
		        Cat catObj = new Cat("Whiskers", 10.2, "White", 3, 25.5);

		        // Display the attributes of Dog
		        System.out.println("Dog Details:");
		        System.out.println("Name: " + dogObj.name);
		        System.out.println("Weight: " + dogObj.weight + " kg");
		        System.out.println("Color: " + dogObj.color);
		        System.out.println("Age: " + dogObj.age + " years");
		        System.out.println("Breed: " + dogObj.breed);
		        System.out.println("Is Indoor: " + (dogObj.isIndoor ? "Yes" : "No"));

		        // Display the attributes of Cat
		        System.out.println("\nCat Details:");
		        System.out.println("Name: " + catObj.name);
		        System.out.println("Weight: " + catObj.weight + " kg");
		        System.out.println("Color: " + catObj.color);
		        System.out.println("Age: " + catObj.age + " years");
		        System.out.println("Height: " + catObj.height + " cm");
		    }
		}

		// Base class: Animal
		class Animal {
		    String name;
		    double weight;
		    String color;
		    int age;

		    // Constructor for Animal
		    Animal(String name, double weight, String color, int age) {
		        this.name = name;
		        this.weight = weight;
		        this.color = color;
		        this.age = age;
		    }
		}

		// Subclass: Dog
		class Dog extends Animal {
		    String breed;
		    boolean isIndoor;

		    // Constructor for Dog
		    Dog(String name, double weight, String color, int age, String breed, boolean isIndoor) {
		        super(name, weight, color, age); // Call the Animal constructor
		        this.breed = breed;
		        this.isIndoor = isIndoor;
		    }
		}

		// Subclass: Cat
		class Cat extends Animal {
		    double height;

		    // Constructor for Cat
		    Cat(String name, double weight, String color, int age, double height) {
		        super(name, weight, color, age); // Call the Animal constructor
		        this.height = height;
		    }
		

		// TODO Auto-generated method stub

	}


