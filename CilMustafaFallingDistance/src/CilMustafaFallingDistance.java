import java.util.Scanner;
public class CilMustafaFallingDistance {
    public static void main(String[] args) {
        boolean repeater = true;
        while (repeater == true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter the time: ");
            double time = keyboard.nextDouble();
            if (time >= 1 && time <= 10) {
                System.out.println("Your distance is: " + fallingDistance(time));
                repeater = false;
                for(int i=1; i<=10; i++){
                    System.out.println("Your distance is: " + fallingDistance(i));
                }
            } else {
                System.out.println("Your time has to between 1 - 10. Please try again.");
            }
        }
    }
    static double fallingDistance(double time){
        double distance = 0;
        double gravitationalConstant = 9.8;
        distance = gravitationalConstant * time * time / 2;
        return distance;
    }
}