package linearsearchtesting;

import linearsearch.NegativeLinearSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeLinearTest {
    @Test
    public void checkIndex() {
        // Create an instance of NegativeLinearSearch
        NegativeLinearSearch negative = new NegativeLinearSearch();

        // Get the index of the first negative element
        int index = negative.negativeIndex();

        // Assert that the index is not equal to -1 (i.e., a negative element is found)
        Assertions.assertNotEquals(-1,index);

        // Print the result of the test
        System.out.println("Testing Successful:");
    }
}
