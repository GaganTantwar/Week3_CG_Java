package stringcomplexitytesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringcomplexity.StringBufferComplexityAnalysis;
import stringcomplexity.StringBuilderComplexityAnalysis;
import stringcomplexity.StringComplexityAnalysis;

public class StringClassesTesting {

    // Test method to compare the performance of different string manipulation classes with small size input
    @Test
    public void testStringSmallSize() {
        StringComplexityAnalysis string = new StringComplexityAnalysis();
        StringBufferComplexityAnalysis stringbuffer = new StringBufferComplexityAnalysis();
        StringBuilderComplexityAnalysis stringbuilder = new StringBuilderComplexityAnalysis();

        // Measure time taken for String concatenation
        long startTime1 = System.nanoTime();
        string.stringTime1();
        long endTime1 = System.nanoTime();
        long timeTaken1 = (endTime1 - startTime1);
        System.out.println("String Time: " + timeTaken1);

        // Measure time taken for StringBuffer append
        long startTime2 = System.nanoTime();
        stringbuffer.stringBufferTime1();
        long endTime2 = System.nanoTime();
        long timeTaken2 = (endTime2 - startTime2);
        System.out.println("String Buffer Time: " + timeTaken2);

        // Measure time taken for StringBuilder append
        long startTime3 = System.nanoTime();
        stringbuilder.stringBuilderTime1();
        long endTime3 = System.nanoTime();
        long timeTaken3 = (endTime3 - startTime3);
        System.out.println("String Builder Time: " + timeTaken3);

        // Check if the time taken by String is greater than both StringBuffer and StringBuilder
        boolean ans = false;
        if (timeTaken1 > timeTaken2 && timeTaken1 > timeTaken3) {
            if (timeTaken2 > timeTaken3) {
                ans = true;
            }
        }

        // Assert the result
        Assertions.assertEquals(true, ans);
        System.out.println("Testing Pass");
    }
}
