import java.util.Scanner;
public class MustafaCil26102023V2 {
    public static void main(String[] args) {
        double euroToDollar = 1.08;
        double dollarToEuro = 0.9259;
        double userAmount = 0;

        moneyCalculator(euroToDollar,dollarToEuro,userAmount);

    }
    static void moneyCalculator(double euroToDollar, double dollarToEuro, double userAmount){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please choice your calculation: (press 1 for Dollar to Euro, press 2 for Euro to Dollar)");
        int choice = keyboard.nextInt();

        switch (choice){
            case 1:
                System.out.print("Please enter your money/Dollar: ");
                userAmount = keyboard.nextDouble();
                double convertToEuro = userAmount * dollarToEuro;
                System.out.printf("Your amount is €%.1f\n", convertToEuro);
                break;
            case 2:
                System.out.print("Please enter your money/Euro: ");
                userAmount = keyboard.nextDouble();
                double convertToDollar = userAmount * euroToDollar;
                System.out.printf("Your amount is $%.1f%n", convertToDollar);
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                moneyCalculator(euroToDollar,dollarToEuro,userAmount);
        }
    }
}