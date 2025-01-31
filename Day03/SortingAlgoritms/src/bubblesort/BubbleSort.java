// Package declaration
package bubblesort;

import java.util.*;

// Class representing the BubbleSort algorithm
public class BubbleSort {

    // Method to perform bubble sort on an array
    public static void bubblesorting(int arr[]) {
        boolean isSorted;
        for (int i = 0; i < arr.length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    // Main method to test the BubbleSort class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Marks in Array: ");
            marks[i] = sc.nextInt();
        }
        bubblesorting(marks);
        System.out.println("Array in Sorted Order: " + Arrays.toString(marks));
    }
}
