import java.util.Scanner;

public class MustafaCilArraysHomework {
    public static void main(String[] args) {
        // declaretion
        double[] insideTemperature = new double[10];
        double[] outsideTemperature = new double[10];
        double[] differenceTemperatureCelsius = new double[10];
        double biggestDifference = 0;
        final String name = "Mrs. Smith";
        double average;

        // start point the program
        System.out.println("Hello " + name.toUpperCase() + " !");
        System.out.println("------------------------------");

        // enter inside temperature values
        System.out.println("Please enter your input temperature values");
        getUserInputForTemperature(insideTemperature);
        // converting celsius inside temperature values
        convertToCelsius(insideTemperature);
        // displaying inside temperature values
        displayArray(insideTemperature);

        // enter outside temperature values
        System.out.println("Please enter your output temperature values: ");
        getUserInputForTemperature(outsideTemperature);
        // converting celsius outside temperature values
        convertToCelsius(outsideTemperature);
        // displaying outside temperature values
        displayArray(outsideTemperature);

        // create the third array with difference by inside-outside temperature (celsius) & initalize biggestDifference
        biggestDifference = determineDifference(insideTemperature, outsideTemperature, differenceTemperatureCelsius, biggestDifference);
        displayArray(differenceTemperatureCelsius);

        // Displaying the biggest difference
        System.out.println("Biggest difference is: " + biggestDifference);

        // calculating the average our values
        average = determineAverage(insideTemperature, outsideTemperature);
        System.out.println("Average is: " + average);
    }


    static double[] getUserInputForTemperature(double[] temperature) {

        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = keyboard.nextInt();
        }
        return temperature;
    }

    static double[] convertToCelsius(double[] temperatureList) {
        System.out.println("Converting to celsius...");
        for (int i = 0; i < temperatureList.length; i++) {
            temperatureList[i] = (temperatureList[i] - 32) * 5 / 9;
        }
        return temperatureList;
    }

    static void displayArray(double[] temperatureList) {
        System.out.println("Temperature list is: ");
        for (int i = 0; i < temperatureList.length; i++) {
            System.out.println(temperatureList[i]);
        }
    }

    static double determineDifference(double[] insideTemperature, double[] outsideTemperature, double[] differenceTemperatureCelsius, double biggestDifference) {
        double holdTheNumber = 0;
        for (int i = 0; i < insideTemperature.length; i++) {
            differenceTemperatureCelsius[i] = insideTemperature[i] - outsideTemperature[i];
        }
        for (int i = 0; i < differenceTemperatureCelsius.length; i++) {
            if (differenceTemperatureCelsius[i] < 0) {
                holdTheNumber = differenceTemperatureCelsius[i] * 1;
            } else {
                holdTheNumber = differenceTemperatureCelsius[i];
            }
            if (biggestDifference < holdTheNumber) {
                biggestDifference = holdTheNumber;
            }

        }
        return biggestDifference;
    }

    static double determineAverage(double[] insideTemperature, double[] outsideTemperature) {
        double sum = 0;
        for (int i = 0; i < insideTemperature.length; i++) {
            sum = insideTemperature[i] + outsideTemperature[i];
        }
        double average = sum / insideTemperature.length;

        return average;
    }
}