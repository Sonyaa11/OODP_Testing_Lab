package Tutorial2;

public class Task4 {
    public static void main(String[] args) {

        Child childObj = new Child();
        childObj.displayGrandParent();
        childObj.displayParent();
        childObj.displayChild();
    }
}


class GrandParent {

    void displayGrandParent() {
        System.out.println("I am Grandparent");
    }
}

class Parent extends GrandParent {
    void displayParent() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("I am Child");
    }
}
