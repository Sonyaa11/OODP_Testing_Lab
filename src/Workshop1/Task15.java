package Workshop1;

public class Task15 {

	    public static void main(String[] args) {
	        Person person1 = new Person(); 
	        Person person2 = new Person("John"); 
	        Person person3 = new Person("Alice", 25); 

	        person1.printDetails();
	        person2.printDetails();
	        person3.printDetails();
	    }
	}

	class Person {
	    String name;
	    int age;

	    Person() {
	        name = "Unknown";
	        age = 0;
	    }

	    Person(String name) {
	        this.name = name;
	        age = 0;
	    }

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void printDetails() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}
	


	