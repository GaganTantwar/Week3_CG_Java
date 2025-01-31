// Package declaration
package selectionsort;

import java.util.*;

// Class representing the SelectionSort algorithm
public class SelectionSort {

    // Method to perform selection sort on an array of marks
    public static void selectionSorting(int marks[]) {
        int length = marks.length;
        int indexOfMinimum;
        int temp;

        // Iterate over the array to find the minimum element and swap it with the current element
        for (int i = 0; i < length - 1; i++) {
            indexOfMinimum = i;
            for (int j = i + 1; j < length; j++) {
                if (marks[indexOfMinimum] > marks[j]) {
                    indexOfMinimum = j;
                }
            }
            if (indexOfMinimum != i) {
                temp = marks[indexOfMinimum];
                marks[indexOfMinimum] = marks[i];
                marks[i] = temp;
            }
        }
    }

    // Main method to test the SelectionSort class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Marks in Array: ");
            marks[i] = sc.nextInt();
        }
        selectionSorting(marks);
        System.out.println("Sorted Marks: " + Arrays.toString(marks));
    }
}
