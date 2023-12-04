import java.util.Scanner;
public class MustafaCilHomework26102023 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userName, password, passwordAgain;
        int menu = 0;
        System.out.println("for quit press 0");
        System.out.println("-----------------");
        System.out.println("for sign up and login press 1");
        System.out.println("-----------------");

        menu = keyboard.nextInt();
        switch (menu){
            case 0:
                System.out.println("System closing...");
                System.exit(0);
                break;
            case 1:
                System.out.print("Please enter a username for sign up: ");
                userName = keyboard.next();
                System.out.print("Please enter a password for sign up: ");
                password = keyboard.next();
                System.out.print("Please enter again your password for sign up: ");
                passwordAgain = keyboard.next();
                if(password.equals(passwordAgain)){
                    System.out.println("Your signup is succesfull.");
                    login(userName, password,passwordAgain);
                }
                else {
                    System.out.println("Your passwords are doesn't match. System ending...");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("There is a mistake. System ending...");
                System.exit(0);
        }



    }
    static void login (String userName, String password,String passwordAgain){
        String userNameInput, passwordInput, passwordAgainInput;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a username for login: ");
        userNameInput = keyboard.next();
        System.out.print("Please enter a password for login: ");
        passwordInput = keyboard.next();
        System.out.print("Please enter again your password for login: ");
        passwordAgainInput = keyboard.next();

        if (userName.equals(userNameInput) && password.equals(passwordInput) && passwordAgain.equals(passwordAgainInput)) {
            System.out.println("Your login is successfull. Welcome!");
        }
        else {
            System.out.println("There is a mistake, please try again.");
            login(userName, password,passwordAgain);
        }
    }
}