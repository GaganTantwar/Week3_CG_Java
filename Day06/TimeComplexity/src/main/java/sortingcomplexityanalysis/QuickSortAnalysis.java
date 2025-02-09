package sortingcomplexityanalysis;

import java.util.Random;

public class QuickSortAnalysis {

    // Method to partition the array around the pivot
    public int partition(int array[], int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;
        int temp;

        // Partition the array around the pivot
        do {
            while (i <= high && array[i] <= pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        } while (i < j);

        // Swap the pivot element with the element at index j
        temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }

    // Method to perform quick sort on the array
    public void quickSort(int array[], int low, int high) {
        int partitionIndex; // Index of pivot after partition

        if (low < high) {
            partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Method to generate arrays of different sizes, sort them using Quick Sort, and measure the time taken
    public void display() {
        Random rand = new Random();

        // Small array
        System.out.println("For Small Array: ");
        int smallArray[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
            smallArray[i] = rand.nextInt(1000);
        }
        double startTime = System.nanoTime();
        quickSort(smallArray, 0, 999);
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;
        System.out.println("Time Taken By Quick Sort: " + timeTaken);

        // Medium array
        System.out.println("For Medium Array: ");
        int mediumArray[] = new int[10000];
        for (int i = 0; i < 10000; i++) {
            mediumArray[i] = rand.nextInt(10000);
        }
        double startTime2 = System.nanoTime();
        quickSort(mediumArray, 0, 9999);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2) / 1000000;
        System.out.println("Time Taken By Quick Sort: " + timeTaken2);

        // Large array
        System.out.println("For Large Array: ");
        int largeArray[] = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            largeArray[i] = rand.nextInt(1000000);
        }
        double startTime3 = System.nanoTime();
        quickSort(largeArray, 0, 999999);
        double endTime3 = System.nanoTime();
        double timeTaken3 = (endTime3 - startTime3) / 1000000;
        System.out.println("Time Taken By Quick Sort: " + timeTaken3);
    }
}
