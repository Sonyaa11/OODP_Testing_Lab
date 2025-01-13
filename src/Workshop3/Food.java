package Workshop3;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "food.txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            System.out.println("Enter the names of foods (type 'exit' to stop):");

            while (true) {
                System.out.print("Food name: ");
                String foodName = scanner.nextLine();

                if (foodName.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(foodName + "\n");
                System.out.println("Added: " + foodName);
            }

            System.out.println("Food names saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}