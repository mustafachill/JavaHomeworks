import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter your ID: ");
            String userID = scanner.nextLine();

            System.out.print("Please enter your password: ");
            String password = scanner.nextLine();

            System.out.print("Please enter your password again: ");
            String passwordAgain = scanner.nextLine();

            if (password.equals(passwordAgain)) {
                System.out.println("Password is valid");
                break;
            } else {
                System.out.println("Passwords do not match. Please try again.");
            }

        } while (true);

    }
}