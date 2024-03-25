import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CilMustafaNameSorter {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "";
        System.out.println("How many name entry do you want?");
        int howManyName = keyboard.nextInt();
        ArrayList<String> names = new ArrayList<String>();

        System.out.println("Please enter your names:");
        for (int i = 0; i < howManyName; i++) {
            name = keyboard.next();
            names.add(name);
        }

        ArrayList<String> namesSelectionSort = new ArrayList<String>(names);
        ArrayList<String> namesBubbleSort = new ArrayList<String>(names);

        int selectionSortSwaps = selectionSort(namesSelectionSort);
        int bubbleSortSwaps = bubbleSort(namesBubbleSort);

        System.out.println("Number of selection sort swaps: " + selectionSortSwaps);
        System.out.println("Number of bubble sort swaps: " + bubbleSortSwaps);

        String algorithmWithFewerSwaps = (selectionSortSwaps < bubbleSortSwaps) ? "Selection Sort" : "Bubble Sort";
        System.out.println("The algorithm that requires less swaps is: " + algorithmWithFewerSwaps);
    }

    // for doing selection sort
    public static int selectionSort(ArrayList<String> names) {
        int n = names.size();
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (names.get(j).length() < names.get(minIndex).length()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Collections.swap(names, i, minIndex);
                swaps++;
            }
        }
        return swaps;
    }

    // for doing bubble sort
    public static int bubbleSort(ArrayList<String> names) {
        int n = names.size();
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names.get(j).length() > names.get(j + 1).length()) {
                    Collections.swap(names, j, j + 1);
                    swaps++;
                }
            }
        }
        return swaps;
    }
}
