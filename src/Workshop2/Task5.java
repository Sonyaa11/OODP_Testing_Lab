package Workshop2;

public class Task5 {

    public static void main(String[] args) {
        
        Child childObj = new Child();

        
        System.out.println("Public Variable: " + childObj.publicVar);
        System.out.println("Protected Variable : " + childObj.getProtectedVar());

        childObj.displayVariables(); 
    }
}

class Parent {
    private String privateVar = "I am private"; // Private variable
    protected String protectedVar = "I am protected"; // Protected variable
    public String publicVar = "I am public"; // Public variable

    
    public String getPrivateVar() {
        return privateVar;
    }
}
class Child extends Parent {

   
    void displayVariables() {
       
        System.out.println("Private Variable : " + getPrivateVar());

    }


    public String getProtectedVar() {
        return protectedVar;
    }
}

