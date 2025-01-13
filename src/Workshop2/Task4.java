package Workshop2;

public class Task4 {

    public static void main(String[] args) {
        Employee emp = new Employee("Pratima", "Naxal", "IT Department");
        emp.displayDetails(); // Accessing protected attribute from subclass
    }
}

class Person {
    protected String address; // Protected attribute

    public Person(String address) {
        this.address = address;
    }
}

class Employee extends Person {
    private String name;
    private String department;

    public Employee(String name, String address, String department) {
        super(address); // Call superclass constructor
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address); // Accessing protected attribute
        System.out.println("Department: " + department);
    }
}
