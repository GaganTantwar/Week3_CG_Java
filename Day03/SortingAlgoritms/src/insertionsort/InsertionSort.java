// Package declaration
package insertionsort;

import java.util.*;

// Class representing the InsertionSort algorithm
public class InsertionSort {

    // Method to perform insertion sort on an array
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[++j] = key;
        }
    }

    // Main method to test the InsertionSort class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        int[] employeeId = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Employee Id in Array: ");
            employeeId[i] = sc.nextInt();
        }
        insertionSort(employeeId);
        System.out.println("Employee Id In Sorted Order: " + Arrays.toString(employeeId));
    }
}
