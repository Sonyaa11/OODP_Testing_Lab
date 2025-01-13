package Workshop3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student1 {
    private String name;
    private int age;
    private char grade;

    public Student1(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }
}

public class Task8 {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student information (type 'done' to finish):");

        int id = 1;
        while (true) {
            System.out.print("Enter student name (or 'done' to stop): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter student age: ");
            int age = scanner.nextInt();

            System.out.print("Enter student grade (A, B, C, D, E, F): ");
            char grade = scanner.next().charAt(0);

            scanner.nextLine(); 

            students.add(new Student1(name, age, grade));
            id++;
        }

       
        String fileName = "students.csv";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("ID,Name,Age,Grade\n");

            id = 1;
            for (Student1 student : students) {
                writer.write(id + "," + student.getName() + "," + student.getAge() + "," + student.getGrade() + "\n");
                id++;
            }

            System.out.println("Student information has been saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
