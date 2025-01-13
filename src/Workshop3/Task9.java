package Workshop3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        List<String[]> studentList = new ArrayList<>();
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            reader.readLine(); 
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                studentList.add(data); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

        System.out.println("\nStudents grouped by grade:");
        
        Map<Character, List<String[]>> gradeMap = new HashMap<>();
        
        for (String[] student : studentList) {
            char grade = student[3].charAt(0); 
            gradeMap.putIfAbsent(grade, new ArrayList<>());
            gradeMap.get(grade).add(student);
        }

        for (char grade = 'A'; grade <= 'F'; grade++) {
            List<String[]> studentsInGrade = gradeMap.get(grade);
            System.out.println("Grade " + grade + ":");
            if (studentsInGrade != null && !studentsInGrade.isEmpty()) {
                for (String[] student : studentsInGrade) {
                    System.out.println("  Name: " + student[1] + ", Age: " + student[2] + " years old");
                }
            } else {
                System.out.println("  No students in this grade.");
            }
        }
    }
}