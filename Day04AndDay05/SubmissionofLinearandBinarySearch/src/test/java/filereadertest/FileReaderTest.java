package filereadertest;

import filereader.FileReaderExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileReaderTest {
    @Test
    public void readerTest() {
        // Create an instance of FileReaderExample
        FileReaderExample reader = new FileReaderExample();

        // Read the contents of the file and store the result
        String sentence = reader.fileReader();

        // Expected result from the file
        String result = "Hello and Welcome To Capgemini I am Gagan Tantwar your host Lets Start this wonderful session ";

        // Assert that the file contents match the expected result
        Assertions.assertEquals(sentence, result);

        // Print the result of the test
        System.out.println("Testing Successful:");
    }
}
