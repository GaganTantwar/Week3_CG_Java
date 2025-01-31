// Package declaration
package quicksort;

import java.util.*;

// Class representing the QuickSort algorithm
public class QuickSort {

    // Method to partition the array and return the pivot index
    public static int partition(int productPrice[], int low, int high) {
        int pivot = productPrice[low];
        int i = low + 1;
        int j = high;
        int temp;

        // Partition the array around the pivot
        do {
            while (i <= high && productPrice[i] <= pivot) {
                i++;
            }
            while (productPrice[j] > pivot) {
                j--;
            }
            if (i < j) {
                temp = productPrice[i];
                productPrice[i] = productPrice[j];
                productPrice[j] = temp;
            }
        } while (i < j);

        // Swap the pivot element with the element at index j
        temp = productPrice[low];
        productPrice[low] = productPrice[j];
        productPrice[j] = temp;
        return j;
    }

    // Method to perform quick sort on the array
    public static void quickSorting(int productPrice[], int low, int high) {
        int partitionIndex; // Index of pivot after partition

        if (low < high) {
            partitionIndex = partition(productPrice, low, high);
            quickSorting(productPrice, low, partitionIndex - 1);
            quickSorting(productPrice, partitionIndex + 1, high);
        }
    }

    // Main method to test the QuickSort class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        int[] productPrice = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Product Prices in Array: ");
            productPrice[i] = sc.nextInt();
        }
        quickSorting(productPrice, 0, productPrice.length - 1);
        System.out.println("Sorted Product Prices: " + Arrays.toString(productPrice));
    }
}
