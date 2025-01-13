package Workshop2;

public class Task1 {

    public static void main(String[] args) {

        // Create a Dog object
        Dog dogObj = new Dog("Bruno", 1, "Dachshund");

        // Display the details using overridden method
        dogObj.displayDetails();
    }
}

class Animal {
    String name;
    int age;

    // Constructor for Animal
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    // Constructor for Dog
    Dog(String name, int age, String breed) {
        super(name, age); // Call the parent class constructor
        this.breed = breed;
    }

    // Overriding the displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the parent class method
        System.out.println("Dog Breed: " + breed);
    }
}


