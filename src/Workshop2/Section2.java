package Workshop2;


import java.util.Scanner;
import java.util.regex.*;
import java.time.LocalDate;
import java.time.Period;

public class Section2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] users = new String[10]; // To store up to 10 users
        int userIndex = 0;

        while (true) {
            // Displaying menu
            System.out.println("Please enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()

            if (choice == 2) {
                System.out.println("Exiting the application...");
                break;
            } else if (choice == 1) {
                if (userIndex >= users.length) {
                    System.out.println("User limit reached. Cannot register more users.");
                    break;
                }

                boolean validSignup = false;
                while (!validSignup) {
                    String fullName = getFullName(scanner);
                    String mobileNumber = getMobileNumber(scanner);
                    String password = getPassword(scanner);
                    String passwordConfirmation = getPasswordConfirmation(scanner, password);
                    String dob = getDOB(scanner);

                    if (fullName != null && mobileNumber != null && password != null && passwordConfirmation != null && dob != null) {
                        // Storing valid user data
                        users[userIndex] = "Name: " + fullName + ", Mobile: " + mobileNumber + ", DOB: " + dob;
                        userIndex++;

                        System.out.println("You have successfully signed up.");
                        validSignup = true;
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        }
    }

    private static String getFullName(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();

        if (fullName.length() > 4) {
            return fullName;
        } else {
            System.out.println("Full name must be longer than 4 characters. Please start again.");
            return null;
        }
    }

    private static String getMobileNumber(Scanner scanner) {
        System.out.print("Please enter your mobile number (username): ");
        String mobileNumber = scanner.nextLine();

        if (mobileNumber.matches("0\\d{9}")) {
            return mobileNumber;
        } else {
            System.out.println("Mobile number must be 10 digits and start with 0. Please start again.");
            return null;
        }
    }

    private static String getPassword(Scanner scanner) {
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();

        if (password.matches("[A-Z][@&]\\d+")) {
            return password;
        } else {
            System.out.println("Password must start with a capital letter, followed by @ or & and end with a numeric value. Please start again.");
            return null;
        }
    }

    private static String getPasswordConfirmation(Scanner scanner, String password) {
        System.out.print("Please confirm your password: ");
        String passwordConfirmation = scanner.nextLine();

        if (passwordConfirmation.equals(password)) {
            return passwordConfirmation;
        } else {
            System.out.println("Your passwords are not matching. Please start again.");
            return null;
        }
    }

    private static String getDOB(Scanner scanner) {
        System.out.print("Please enter your Date of Birth #DD/MM/YYYY (No space): ");
        String dob = scanner.nextLine();

        if (dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
            String[] dobParts = dob.split("/");
            int day = Integer.parseInt(dobParts[0]);
            int month = Integer.parseInt(dobParts[1]);
            int year = Integer.parseInt(dobParts[2]);

            // Check if user is at least 21 years old
            int currentYear = LocalDate.now().getYear();
            if (currentYear - year >= 21) {
                return dob;
            } else {
                System.out.println("You must be at least 21 years old. Please start again.");
                return null;
            }
        } else {
            System.out.println("You have entered the Date of Birth in invalid format. Please start again.");
            return null;
        }
    }
}
