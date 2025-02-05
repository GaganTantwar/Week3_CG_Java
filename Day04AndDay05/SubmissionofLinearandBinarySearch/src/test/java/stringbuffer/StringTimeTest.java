package stringbuffer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuffer.StringTime;

public class StringTimeTest {
    @Test
    public void timeTest() {
        // Create an instance of StringTime
        StringTime check = new StringTime();

        // Call the display method and store the result
        boolean result = check.display();

        // Assert that the result is true
        Assertions.assertEquals(result, true);

        // Print the result of the test
        System.out.println("Testing Successful: ");
    }
}
