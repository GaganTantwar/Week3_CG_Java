package binarysearchtesting;

import binarysearch.SortedRotated;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedRotatedTest {
    @Test
    public void sortedTest() {
        // Create an instance of SortedRotated
        SortedRotated index = new SortedRotated();

        // Array to find the index of the minimum element
        int[] array = {4, 5, 6, 7, 8, 2, 3};

        // Get the index of the minimum element
        int res = index.binarySearch(array);

        // Assert that the index is not -1
        Assertions.assertNotEquals(-1, res);

        // Print the result of the test
        System.out.println("Testing Pass");
    }
}
