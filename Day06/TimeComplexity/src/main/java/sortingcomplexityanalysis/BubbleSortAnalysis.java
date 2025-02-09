package sortingcomplexityanalysis;
import java.util.*;

public class BubbleSortAnalysis {

    // Method to perform Bubble Sort on an array
    public void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method to generate arrays of different sizes, sort them using Bubble Sort, and measure the time taken
    public void display() {
        Random rand = new Random();

        // Small array
        int smallArray[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
            smallArray[i] = rand.nextInt(1000);
        }
        System.out.println("For Small Array: ");
        double startTime = System.nanoTime();
        bubbleSort(smallArray);
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;
        System.out.println("Time Taken By Bubble Sort: " + timeTaken);

        // Medium array
        int mediumArray[] = new int[10000];
        for (int i = 0; i < 10000; i++) {
            mediumArray[i] = rand.nextInt(10000);
        }
        System.out.println("For Medium Array: ");
        double startTime2 = System.nanoTime();
        bubbleSort(mediumArray);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2) / 1000000;
        System.out.println("Time Taken By Bubble Sort: " + timeTaken2);

        // Large array
        int largeArray[] = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            largeArray[i] = rand.nextInt(1000000);
        }
        System.out.println("For Large Array: ");
        double startTime3 = System.nanoTime();
        bubbleSort(largeArray);
        double endTime3 = System.nanoTime();
        double timeTaken3 = (endTime3 - startTime3) / 1000000;
        System.out.println("Time Taken By Bubble Sort: " + timeTaken3);
    }
}
