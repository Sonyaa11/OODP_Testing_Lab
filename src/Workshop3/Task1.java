package Workshop3;

public class Task1 {

    public static void main(String[] args) {
        
        Student student1 = new Student(1, "Ram", 20, 'A');
        
        System.out.println("Student 1:");
        System.out.println("ID: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());

   
        student1.setGrade('A');
        System.out.println("\nUpdated Grade for Student 2: " + student1.getGrade());
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private char grade;

    public Student(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}