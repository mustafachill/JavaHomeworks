public class CilMustafaHomework {
    public static void main(String[] args) {
        // the array has 4 row and 6 column
        int[][] population = {{5, 0, 5, 0, 5, 6}, {2, 8, 4, 5, 6, 7}, {0, 0, 5, 6, 6, 7}, {4, 5, 9, 8, 7, 7}};
        calculatorForTexas(population);
        calculatorForNY(population);
        calculatorForDC(population);
        calculatorForNM(population);
        calculatorForOK(population);
        calculatorForAL(population);


        totalNumberOfDogs(calculatorForKangal(population), calculatorForDoberman(population), calculatorForBeagle(population), calculatorForGoldenRetriever(population));
    }

    public static int calculatorForTexas(int[][] population) {
        int totalOfTexas = 0;
        System.out.println("Calculating number of Texas's dogs...");
        for (int row = 0; row < 4; row++) {
            totalOfTexas = totalOfTexas + population[row][0];
            System.out.println(population[row][0]);
        }
        System.out.println("Total numbers for Texas's dogs is: " + totalOfTexas);
        System.out.println("");
        return totalOfTexas;
    }

    public static int calculatorForNY(int[][] population) {
        int totalOfNY = 0;
        System.out.println("Calculating number of NY's dogs...");
        for (int row = 0; row < 4; row++) {
            totalOfNY = totalOfNY + population[row][1];
            System.out.println(population[row][1]);
        }
        System.out.println("Total numbers for NY's dogs is: " + totalOfNY);
        System.out.println("");
        return totalOfNY;
    }

    public static int calculatorForDC(int[][] population) {
        int totalOfDC = 0;
        System.out.println("Calculating number of DC's dogs...");
        for (int row = 0; row < 4; row++) {
            totalOfDC = totalOfDC + population[row][2];
            System.out.println(population[row][2]);
        }
        System.out.println("Total numbers for DC's dogs is: " + totalOfDC);
        System.out.println("");
        return totalOfDC;
    }

    public static int calculatorForNM(int[][] population) {
        int totalOfNM = 0;
        System.out.println("Calculating number of NM's dogs...");
        for (int row = 0; row < 4; row++) {
            totalOfNM = totalOfNM + population[row][3];
            System.out.println(population[row][3]);
        }
        System.out.println("Total numbers for NM's dogs is: " + totalOfNM);
        System.out.println("");
        return totalOfNM;
    }

    public static int calculatorForOK(int[][] population) {
        int totalOfOK = 0;
        System.out.println("Calculating number of OK's dogs...");
        for (int row = 0; row < 4; row++) {
            totalOfOK = totalOfOK + population[row][4];
            System.out.println(population[row][4]);
        }
        System.out.println("Total numbers for OK's dogs is: " + totalOfOK);
        System.out.println("");
        return totalOfOK;
    }

    public static int calculatorForAL(int[][] population) {
        int totalOfAL = 0;
        System.out.println("Calculating number of AL's dogs...");
        for (int row = 0; row < 4; row++) {
            totalOfAL = totalOfAL + population[row][5];
            System.out.println(population[row][5]);
        }
        System.out.println("Total numbers for AL's dogs is: " + totalOfAL);
        System.out.println("");
        return totalOfAL;
    }

    //
    public static int calculatorForKangal(int[][] population) {
        int totalOfKangal = 0;
        int antiCounter = 6;
        System.out.println("Calculating number of kangals...");
        for (int column = 0; column < 6; column++) {
            if(population[0][column] == 0){
                antiCounter--;
            }
            totalOfKangal = totalOfKangal + population[0][column];
            System.out.println(population[0][column]);
        }
        if(antiCounter <= 3){
            System.out.println("This species is in danger");
        }
        System.out.println("Total numbers for kangal is: " + totalOfKangal);
        System.out.println("");
        return totalOfKangal;
    }

    public static int calculatorForDoberman(int[][] population) {
        int totalOfDoberman = 0;
        int antiCounter = 6;
        System.out.println("Calculating number of dobermans...");
        for (int column = 0; column < 6; column++) {
            if(population[1][column] == 0){
                antiCounter--;
            }
            totalOfDoberman = totalOfDoberman + population[1][column];
            System.out.println(population[1][column]);
        }
        if(antiCounter <= 3){
            System.out.println("This species is in danger");
        }
        System.out.println("Total numbers for doberman is: " + totalOfDoberman);
        System.out.println("");
        return totalOfDoberman;
    }

    public static int calculatorForBeagle(int[][] population) {
        int totalOfBeagle = 0;
        int antiCounter = 6;
        System.out.println("Calculating number of beagles...");
        for (int column = 0; column < 6; column++) {
            if(population[2][column] == 0){
                antiCounter--;
            }
            totalOfBeagle = totalOfBeagle + population[2][column];
            System.out.println(population[2][column]);
        }
        if(antiCounter <= 3){
            System.out.println("This species is in danger");
        }
        System.out.println("Total numbers for beagle is: " + totalOfBeagle);
        System.out.println("");
        return totalOfBeagle;
    }

    public static int calculatorForGoldenRetriever(int[][] population) {
        int totalOfGoldenRetriever = 0;
        int antiCounter = 6;
        System.out.println("Calculating number of golden retrievers...");
        for (int column = 0; column < 6; column++) {
            if(population[3][column] == 0){
                antiCounter--;
            }
            totalOfGoldenRetriever = totalOfGoldenRetriever + population[3][column];
            System.out.println(population[3][column]);
        }
        if(antiCounter <= 3){
            System.out.println("This species is in danger");
        }
        System.out.println("Total numbers for golden retriever is: " + totalOfGoldenRetriever);
        System.out.println("");
        return totalOfGoldenRetriever;
    }

    public static int totalNumberOfDogs(int calculatorForKangal, int calculatorForDoberman, int calculatorForBeagle, int calculatorForGoldenRetriever) {
        int totalOfDogs = 0;

        totalOfDogs = calculatorForKangal + calculatorForDoberman + calculatorForBeagle + calculatorForGoldenRetriever;
        System.out.println("Total number of dogs is: " + totalOfDogs);
        return totalOfDogs;
    }
}