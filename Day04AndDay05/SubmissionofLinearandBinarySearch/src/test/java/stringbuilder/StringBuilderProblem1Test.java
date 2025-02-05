package stringbuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilderproblem1.StringBuilderProblem1;

public class StringBuilderProblem1Test {
    @Test
    public void reverseTest() {
        // Create an instance of StringBuilderProblem1 with a test string
        StringBuilderProblem1 s1 = new StringBuilderProblem1("Gagan");

        // Call the reverse method and store the result
        String result = s1.reverse();

        // Get the original string
        String temp = s1.getString();

        // Create StringBuilder object and reverse the original string
        StringBuilder expected = new StringBuilder(temp);
        expected.reverse();

        // Convert the expected result to String
        String ans = expected.toString();

        // Assert that the reversed string matches the expected result
        Assertions.assertEquals(result, ans);

        // Print the actual and expected reversed strings
        System.out.println("String Result: " + result);
        System.out.println("String Expected: " + ans);
    }
}
