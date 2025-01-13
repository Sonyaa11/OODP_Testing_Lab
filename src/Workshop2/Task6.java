package Workshop2;

public class Task6 {

    public static void main(String[] args) {
        FinalClass finalClassObj = new FinalClass();
        finalClassObj.displayMessage();

        SubClass subClassObj = new SubClass();
        subClassObj.displayAnotherMessage();
     
    }
}

// Final class cannot be extended
final class FinalClass {
    void displayMessage() {
        System.out.println("This is a message from the FinalClass.");
    }
}


// Class containing a final method
class SuperClass {
    final void displayMessage() {
        System.out.println("This is a final method in SuperClass.");
    }

    void displayAnotherMessage() {
        System.out.println("This is a non-final method in SuperClass.");
    }
}

// Subclass of SuperClass
class SubClass extends SuperClass {
    
    @Override
    void displayAnotherMessage() {
        System.out.println("This is an overridden non-final method in SubClass.");
    }
}
