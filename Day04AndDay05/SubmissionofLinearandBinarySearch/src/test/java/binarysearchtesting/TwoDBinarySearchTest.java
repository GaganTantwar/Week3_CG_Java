package binarysearchtesting;

import binarysearch.TwoDbinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoDBinarySearchTest {
    @Test
    public void twoTesting() {
        // Create an instance of TwoDbinarySearch
        TwoDbinarySearch search = new TwoDbinarySearch();

        // Perform binary search for the value 5
        boolean res = search.twodBinarySearching(5);

        // Assert that the value 5 is found in the 2D array
        Assertions.assertEquals(res, true);

        // Print the result of the test
        System.out.println("Testing Successful");
    }
}
