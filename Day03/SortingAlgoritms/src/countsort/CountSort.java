// Package declaration
package countsort;

import java.util.*;

// Class representing the CountSort algorithm
public class CountSort {

    // Method to perform counting sort on an array of student ages
    public static int[] countingSort(int studentAge[]) {
        int length = studentAge.length;
        int maxi = 0;

        // Find the maximum value in the array
        for (int i = 0; i < length; i++) {
            maxi = Math.max(maxi, studentAge[i]);
        }

        // Create a count array to store the count of each unique element
        int countArray[] = new int[maxi + 1];
        for (int i = 0; i < length; i++) {
            countArray[studentAge[i]]++;
        }

        // Modify the count array to store the cumulative count of elements
        for (int j = 1; j <= maxi; j++) {
            countArray[j] += countArray[j - 1];
        }

        // Create a sorted array to store the sorted elements
        int[] sortedAges = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            sortedAges[countArray[studentAge[i]] - 1] = studentAge[i];
            countArray[studentAge[i]]--;
        }

        return sortedAges;
    }

    // Main method to test the CountSort class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        int[] studentAges = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Student Age in Array: ");
            studentAges[i] = sc.nextInt();
        }
        int[] sortedAges = countingSort(studentAges);
        System.out.println("Sorted Student Age: " + Arrays.toString(sortedAges));
    }
}
