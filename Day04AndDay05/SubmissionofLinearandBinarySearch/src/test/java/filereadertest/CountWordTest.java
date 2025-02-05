package filereadertest;

import filereader.CountWordInFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountWordTest {
    @Test
    public void countTest() {
        // Create an instance of CountWordInFile
        CountWordInFile counter = new CountWordInFile();

        // Count occurrences of the word "Hello" and get the result
        boolean result = counter.countWord("Hello");

        // Assert that the word "Hello" exists in the file
        Assertions.assertEquals(result, true);

        // Print the result of the test
        System.out.println("Testing Successful");
    }
}
