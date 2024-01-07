// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[][] carList = {{35,40,45},{42,38,44},{50,80,15}};


        //
        int totalVehicleForA = 0;
        for(int row = 0; row < 3; row++){
            totalVehicleForA = totalVehicleForA + carList[row][0];
        }
        int totalVehicleForB = 0;
        for(int row = 0; row < 3; row++){
            totalVehicleForB = totalVehicleForB + carList[row][1];
        }
        int totalVehicleForC = 0;
        for(int row = 0; row < 3; row++){
            totalVehicleForC = totalVehicleForC + carList[row][2];
        }

        if(totalVehicleForB > totalVehicleForA && totalVehicleForB > totalVehicleForC){
            System.out.println("the max is b");
            System.out.println(totalVehicleForB);
        }
        else if(totalVehicleForA > totalVehicleForB && totalVehicleForA > totalVehicleForC){
            System.out.println("the max is a");
            System.out.println(totalVehicleForA);
        }
        else if(totalVehicleForC > totalVehicleForB && totalVehicleForC > totalVehicleForA){
            System.out.println("the max is c");
            System.out.println(totalVehicleForC);
        }
    }
}