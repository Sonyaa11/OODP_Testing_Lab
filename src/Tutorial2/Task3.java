package Tutorial2;

public class Task3 {	
	public static void main (String[]args) {
		Employee empObj = new Employee("Pratima",20,4004);
		System.out.println(empObj);
        }

	}
class Person{
	String name;
	int age;

}
class Employee extends Person{
	int employeeId;
	
	Employee(String name,int age,int employeeId){
		super.name = name;
		super.age = age;
		this.employeeId = employeeId;
		
	};
    @Override
    public String toString() {
        return "Employee [Name: " + name + ", Age: " + age + ", Employee ID: " + employeeId + "]";
    }
}

	
	
	
