// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final int arrayBounds = 10;
        int[] myList = new int[arrayBounds];
        myList[0] = 4;

        int[] myListForCopying = {19, 1, 2, 3, 4, 5, 6, 7, 8};

        // for filling an array
        int number = 0;
        for (int i = 0; i < arrayBounds; i++) {
            myList[i] = number;
            number++;
        }

        // for printing an array
        for (int i : myList) {
            System.out.println(i);
        }

        // comparing two array
        boolean status = true;
        if (myList.length == myListForCopying.length) {
            for (int i = 0; i < arrayBounds; i++) {
                if (myList[i] == myListForCopying[i]) {
                    // do something
                } else {
                    status = false;
                }
            }
        } else {
            status = false;
        }
        if (status) {
            System.out.println("This arrays are equal arrays");
        } else {
            System.out.println("This arrays are not equal arrays");
        }

        // finding the smallest element of the array
        int smallestNumber = myListForCopying[0];
        for (int i : myListForCopying) {
            if (i < smallestNumber) {
                smallestNumber = i;
            }
        }
        System.out.println("Smallest number is: " + smallestNumber);

        // summing the elements of an array
        int sum = 0;
        for (int i : myList) {
            sum = sum + i;
        }
        System.out.println("Sum of these number is: " + sum);

        // finding the average of elements for an array
        int sumForAverage = 0;
        for (int i : myList) {
            sumForAverage = sumForAverage + i;
        }
        double average = sumForAverage / myList.length;
        System.out.println("Average is: " + average);
    }
}