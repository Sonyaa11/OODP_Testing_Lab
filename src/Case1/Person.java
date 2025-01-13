package Case1;
/**
 * Represents a person with basic details.
 */
public class Person {
	public int personID;
	public String name;
	public int age;
	public String gender;
	public String address;
	public String contactDetails;
        
     /**
      * Displays personal details of the person.
      */
     public void viewPersonalDetails() {
    	 System.out.println("Id: "+ personID+ " Name: "+ name+" age: " +age+" gender: "+ gender+" address: "+contactDetails+"\n");
     }
}
