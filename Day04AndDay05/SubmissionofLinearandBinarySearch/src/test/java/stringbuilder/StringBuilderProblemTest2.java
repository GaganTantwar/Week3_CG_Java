package stringbuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import stringbuilderproblem2.StringBuilderProblem2;

public class StringBuilderProblemTest2 {
    @Test
    public void uniqueStringTest() {
        // Create an instance of StringBuilderProblem2 with a test string
        StringBuilderProblem2 unique = new StringBuilderProblem2("Gagan");

        // Call the uniqueString method and store the result
        String result = unique.uniqueString();

        // Assert that the unique string matches the expected result
        Assertions.assertEquals(result, "Gagn");

        // Print the result of the test
        System.out.println("Testing Successful");
    }
}
