package fibonaccitesting;

import FibonacciComplexity.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTesting {

    // Test method to compare the performance of recursive and iterative Fibonacci methods
    @Test
    public void checkNumber() {
        Fibonacci fib = new Fibonacci();

        // Measure time taken by recursive method
        long startTime1 = System.nanoTime();
        int ans1 = fib.fibonacciRecursive(10);
        long endTime1 = System.nanoTime();
        long timeTaken1 = (endTime1 - startTime1);

        // Measure time taken by iterative method
        long startTime2 = System.nanoTime();
        int ans2 = fib.fibonacciIterative(10);
        long endTime2 = System.nanoTime();
        long timeTaken2 = (endTime2 - startTime2);

        // Check if the time taken by recursive method is greater than iterative method
        // and the results of both methods are the same
        boolean check = false;
        if ((timeTaken1 > timeTaken2) && (ans1 == ans2)) {
            check = true;
        }

        // Assert the result
        Assertions.assertEquals(true, check);
        System.out.println("Testing Pass:");
    }
}
