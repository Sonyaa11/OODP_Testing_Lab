package Workshop2;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.LocalDate;

public class Task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to Sign up.");
            System.out.println("Enter 2 to Quit.");
            System.out.print("Input: ");

            int choice;
            try {
                choice = input.nextInt();
                if (choice < 1 || choice > 3)
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.\n");
                input.nextLine();
                continue;
            }

            if (choice == 1) {
                input.nextLine(); // Clear the buffer
                while (true) {
                    try {
                        System.out.print("\nEnter your full name: ");
                        String fullName = input.nextLine();

                        System.out.print("Enter your mobile number: ");
                        String mobileNumber = input.nextLine();

                        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
                        String dob = input.nextLine();

                        System.out.print("Enter your password: ");
                        String password = input.nextLine();

                        System.out.print("Confirm your password: ");
                        String confirmPassword = input.nextLine();

                        if (fullName.length() < 4)
                            throw new Exception("Full name must be at least 4 characters long.");

                        if (!Pattern.matches("^[0]\\d{9}$", mobileNumber))
                            throw new Exception("Mobile number must be 10 digits starting with 0.");

                        if (!Pattern.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$", dob))
                            throw new Exception("Date of birth must be in the format DD/MM/YYYY.");

                        int year = Integer.parseInt(dob.split("/")[2]);
                        if (LocalDate.now().getYear() - year < 21)
                            throw new Exception("You must be at least 21 years old.");

                        if (!Pattern.matches("^[A-Z]([a-zA-Z]*)(?:@|&)\\d+$", password))
                            throw new Exception(
                                    "Password must:\n1. Start with an uppercase letter.\n2. Contain only alphabets followed by @ or &.\n3. End with digits.");

                        if (!password.equals(confirmPassword))
                            throw new Exception("Passwords do not match.");

                        System.out.printf("\nSigned up successfully!! USER : %s\n\n", mobileNumber);
                        break;

                    } catch (Exception e) {
                        System.out.printf("Error: %s\nPlease try again.\n\n", e.getMessage());
                    }
                }
            } else {
                System.out.println("Exiting the program.");
                break;
            }
        }
        input.close();
    }
}
