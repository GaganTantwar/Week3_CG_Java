package stringbuffer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuffer.StringConcat;

public class StringConcatTest {
    @Test
    public void concatTest() {
        // Create an instance of StringConcat
        StringConcat concat = new StringConcat();

        // Call the concatString method and store the result
        String result = concat.concatString();

        // Define the expected concatenated sentence
        String sentence = "Hello Welcome to Java Tutorial";

        // Assert that the result matches the expected sentence
        Assertions.assertEquals(result, sentence);

        // Print the result of the test
        System.out.println("Test Successful");
    }
}
