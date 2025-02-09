package FibonacciComplexity;
import java.util.*;

public class Fibonacci {

    // Recursive method to calculate the nth Fibonacci number
    public int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method to calculate the nth Fibonacci number
    public int fibonacciIterative(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    // Main method to compare the performance of recursive and iterative Fibonacci methods
    public static void main(String args[]) {
        Fibonacci fib = new Fibonacci();
        Scanner sc = new Scanner(System.in);

        // Input the value of n
        System.out.println("Enter Value Of Number :");
        int n = sc.nextInt();

        // Measure time taken by recursive method
        double startTime = System.nanoTime();
        int recursion = fib.fibonacciRecursive(n);
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;
        System.out.println("Fibonacci: " + recursion);
        System.out.println("Time Taken By Recursive Fibonacci: " + timeTaken);

        // Measure time taken by iterative method
        double startTime2 = System.nanoTime();
        int iteration = fib.fibonacciIterative(n);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2) / 1000000;
        System.out.println("Fibonacci: " + iteration);
        System.out.println("Time Taken By Iterative Fibonacci: " + timeTaken2);
    }
}
