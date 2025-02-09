package sortingcomplexityanalysis;

public class SotingAnalysis {

    // Main method to test and compare the performance of different sorting algorithms
    public static void main(String args[]) {

        BubbleSortAnalysis bubbleSort = new BubbleSortAnalysis();
        bubbleSort.display();

        // Create an instance of MergeSortAnalysis and display its sorting time results
        MergeSortAnalysis mergeSort = new MergeSortAnalysis();
        mergeSort.display();

        // Create an instance of QuickSortAnalysis and display its sorting time results
        QuickSortAnalysis quickSort = new QuickSortAnalysis();
        quickSort.display();
    }
}
