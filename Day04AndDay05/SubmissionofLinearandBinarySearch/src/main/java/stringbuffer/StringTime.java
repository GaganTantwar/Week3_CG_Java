package stringbuffer;
import java.util.*;

public class StringTime {
    // Method to measure the time taken by StringBuilder to concatenate strings
    public long getTime1() {
        long startTime, endTime;
        startTime = System.nanoTime();

        // Create a StringBuilder and append "Hello" 1,000,000 times
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            builder.append("Hello");
        }

        endTime = System.nanoTime();
        long result = endTime - startTime;
        System.out.println("Time Required by StringBuilder: " + (endTime - startTime));
        return result;
    }

    // Method to measure the time taken by StringBuffer to concatenate strings
    public long getTime2() {
        long startTime, endTime;
        startTime = System.nanoTime();

        // Create a StringBuffer and append "Hello" 1,000,000 times
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            buffer.append("Hello");
        }

        endTime = System.nanoTime();
        long result = endTime - startTime;
        System.out.println("Time Required by StringBuffer: " + (endTime - startTime));
        return result;
    }

    // Method to compare the time taken by StringBuilder and StringBuffer
    public boolean display() {
        long result1 = getTime1();
        long result2 = getTime2();

        // Return false if the times are equal, true otherwise
        if (result2 == result1) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        // Create an instance of StringTime
        StringTime time = new StringTime();

        // Call display method to compare times
        boolean check = time.display();
    }
}
