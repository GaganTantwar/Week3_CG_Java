package binarysearchtesting;

import binarysearch.PeakElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakIndexTest {
    @Test
    public void peakTesting() {
        // Create an instance of PeakElement
        PeakElement peak = new PeakElement();

        // Array to find the peak index
        int[] array = {1, 2, 5, 4, 3, 2, 1};

        // Get the peak index
        int index = peak.peakIndex(array);

        // Assert that the peak index is not -1
        Assertions.assertNotEquals(-1, index);

        // Print the result of the test
        System.out.println("Testing Pass");
    }
}
