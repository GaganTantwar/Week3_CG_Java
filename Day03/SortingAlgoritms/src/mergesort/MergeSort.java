// Package declaration
package mergesort;

import java.util.*;

// Class representing the MergeSort algorithm
public class MergeSort {

    // Method to merge two halves of the array
    public static void merge(double bookPrice[], int mid, int low, int high) {
        int i, j, k;
        double[] temp = new double[(high + 1)];
        i = low;
        j = mid + 1;
        k = low;

        // Merge the two halves into temp array
        while (i <= mid && j <= high) {
            if (bookPrice[i] < bookPrice[j]) {
                temp[k] = bookPrice[i];
                i++;
                k++;
            } else {
                temp[k] = bookPrice[j];
                j++;
                k++;
            }
        }
        // Copy remaining elements of the left half
        while (i <= mid) {
            temp[k] = bookPrice[i];
            k++;
            i++;
        }
        // Copy remaining elements of the right half
        while (j <= high) {
            temp[k] = bookPrice[j];
            k++;
            j++;
        }
        // Copy the merged elements back to the original array
        for (int h = low; h <= high; h++) {
            bookPrice[h] = temp[h];
        }
    }

    // Method to perform merge sort on the array
    public static void mergeSorting(double bookPrice[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSorting(bookPrice, low, mid);
            mergeSorting(bookPrice, mid + 1, high);
            merge(bookPrice, mid, low, high);
        }
    }

    // Main method to test the MergeSort class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        double[] bookPrice = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Book Price in Array: ");
            bookPrice[i] = sc.nextDouble();
        }
        mergeSorting(bookPrice, 0, bookPrice.length - 1);
        System.out.println("Sorted Book Prices: " + Arrays.toString(bookPrice));
    }
}
