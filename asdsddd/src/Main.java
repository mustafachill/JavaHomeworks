import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int howMuchFib = keyboard.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;

        for (int i=1; i<= howMuchFib; i++){
            int thirdNumber = firstNumber + secondNumber;
            System.out.println(thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;

        }
    }
}