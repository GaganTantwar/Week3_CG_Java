package sortingcomplexityanalysis;

import java.util.Random;

public class MergeSortAnalysis {

    // Method to merge two halves of an array
    public void merge(int array[], int mid, int low, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int temp[] = new int[high + 1];

        // Merge the two halves into temp array
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
                k++;
            } else {
                temp[k] = array[j];
                j++;
                k++;
            }
        }

        // Copy remaining elements of the left half
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }

        // Copy remaining elements of the right half
        while (j <= high) {
            temp[k] = array[j];
            j++;
            k++;
        }

        // Copy the merged elements back to the original array
        for (int l = low; l <= high; l++) {
            array[l] = temp[l];
        }
    }

    // Method to perform Merge Sort on an array
    public void mergeSort(int array[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, mid, low, high);
        }
    }

    // Method to generate arrays of different sizes, sort them using Merge Sort, and measure the time taken
    public void display() {
        Random rand = new Random();

        // Small array
        System.out.println("For Small Array: ");
        int smallArray[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
            smallArray[i] = rand.nextInt(1000);
        }

        double startTime = System.nanoTime();
        mergeSort(smallArray, 0, 999);
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;
        System.out.println("Time Taken By Merge Sort: " + timeTaken);
        System.out.println(" ");

        // Medium array
        System.out.println("For Medium Array: ");
        int mediumArray[] = new int[10000];
        for (int i = 0; i < 10000; i++) {
            mediumArray[i] = rand.nextInt(10000);
        }
        double startTime2 = System.nanoTime();
        mergeSort(mediumArray, 0, 9999);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2) / 1000000;
        System.out.println("Time Taken By Merge Sort: " + timeTaken2);

        // Large array
        System.out.println("For Large Array: ");
        int largeArray[] = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            largeArray[i] = rand.nextInt(1000000);
        }

        double startTime3 = System.nanoTime();
        mergeSort(largeArray, 0, 999999);
        double endTime3 = System.nanoTime();
        double timeTaken3 = (endTime3 - startTime3) / 1000000;
        System.out.println("Time Taken By Merge Sort: " + timeTaken3);
    }
}
