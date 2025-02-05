package binarysearchtesting;

import binarysearch.FirstAndLast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstandLastTest {
    @Test
    public void testing() {
        // Create an instance of FirstAndLast
        FirstAndLast index = new FirstAndLast();

        // Get the first and last occurrences of the target element
        int first = index.first(4);
        int last = index.last(4);

        // Assert that the first and last occurrences are not -1
        Assertions.assertNotEquals(-1, first);
        Assertions.assertNotEquals(-1, last);

        // Print the result of the test
        System.out.println("Testing Pass");
    }
}
