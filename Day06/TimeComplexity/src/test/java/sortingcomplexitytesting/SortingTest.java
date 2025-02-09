package sortingcomplexitytesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sortingcomplexityanalysis.BubbleSortAnalysis;
import sortingcomplexityanalysis.MergeSortAnalysis;
import sortingcomplexityanalysis.QuickSortAnalysis;

import java.util.Random;

public class SortingTest {

    // Test method to compare the performance of different sorting algorithms
    @Test
    public void checkAlgorithm() {
        Random rand = new Random();
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(10);
        }

        // Measure time taken by Bubble Sort
        double startTime1 = System.nanoTime();
        BubbleSortAnalysis bubble = new BubbleSortAnalysis();
        bubble.bubbleSort(array);
        double endTime1 = System.nanoTime();
        double timeTaken1 = (endTime1 - startTime1);
        System.out.println("Time Taken By Bubble Sort: " + timeTaken1);

        // Measure time taken by Merge Sort
        double startTime2 = System.nanoTime();
        MergeSortAnalysis merge = new MergeSortAnalysis();
        merge.mergeSort(array, 0, 9);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2);
        System.out.println("Time Taken By Merge Sort: " + timeTaken2);

        // Measure time taken by Quick Sort
        double startTime3 = System.nanoTime();
        QuickSortAnalysis quick = new QuickSortAnalysis();
        quick.quickSort(array, 0, 9);
        double endTime3 = System.nanoTime();
        double timeTaken3 = (endTime3 - startTime3);
        System.out.println("Time Taken By Quick Sort: " + timeTaken3);

        // Check if the time taken by Bubble Sort is greater than both Merge Sort and Quick Sort
        boolean ans = false;
        if (timeTaken1 > timeTaken2 && timeTaken1 > timeTaken3) {
            if (timeTaken2 > timeTaken3) {
                ans = true;
            }
        }

        // Assert the result
        Assertions.assertEquals(true, ans);
        System.out.println("Testing Pass: ");
    }
}
