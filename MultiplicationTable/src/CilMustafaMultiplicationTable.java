import java.util.Scanner;

public class CilMustafaMultiplicationTable {
    public static void main(String[] args) {
        int number = 0;
        System.out.print("Enter your integer number: ");
        printTable(userInput(number));
    }
    static int userInput(int number){
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        return number;
    }
    static void printTable(int number){
        System.out.println("-------------------------");
        int result = 0;
        for(int i=1; i<=10; i++){
            result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }
    }
}