package binarysearch;

import java.util.Arrays;

public class SortedRotated {
    // Method to find the index of the minimum element in a sorted and rotated array
    public int binarySearch(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        // Binary search to find the minimum element
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If left is equal to right, we have found the minimum element
            if (left == right) {
                index = left;
                break;
            }

            // If the middle element is greater than the rightmost element, move left pointer to mid + 1
            if (array[mid] > array[right]) {
                left = mid + 1;
            } else {
                // Otherwise, move right pointer to mid
                right = mid;
            }
        }
        return index;
    }

    // Method to print the index of the minimum element in a sorted and rotated array
    public void indexOfMin() {
        int[] array = {4, 5, 6, 7, 8, 2, 3};
        int index = binarySearch(array);

        // Print the result based on the index found
        if (index == -1) {
            System.out.println("Nothing Searched");
        } else {
            System.out.println("Index of Min: " + index);
        }
    }

    public static void main(String args[]) {
        // Create an instance of SortedRotated
        SortedRotated sc = new SortedRotated();

        // Call the indexOfMin method to find and print the index of the minimum element
        sc.indexOfMin();
    }
}
