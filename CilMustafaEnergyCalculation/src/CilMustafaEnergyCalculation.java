import java.util.Scanner;
public class CilMustafaEnergyCalculation {
    public static void main(String[] args) {
        boolean repeater = true;
        double speedOfLight = 299800000;
        while (repeater == true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter the mass: ");
            double mass = keyboard.nextDouble();
            if (mass >= 0){
                energyCalculation(mass, speedOfLight);
                repeater = false;
            }
            else {
                System.out.println("Mass has to bigger than 0, please try again.");
            }
        }
    }
    public static void energyCalculation(double mass, double speedOfLight ){
        double energy = mass * speedOfLight * speedOfLight;
        System.out.println("Your energy is: " + energy);
    }
}