package datastructurecomplexity;
import java.util.*;

public class ArrayComplexity {

    // Method to search for a target element in an array
    public void arraySearching(int[] array, int target) {
        int index = -1;
        // Loop through the array to find the target element
        for (int i = 0; i < array.length - 1; i++) {
            if (target == array[i]) {
                index = i;
                break;
            }
        }
        // Print the result
        if (index == -1) {
            System.out.println("Element Not Found: ");
        } else {
            System.out.println("Element Found at Index: " + index);
        }
    }

    // Method to generate arrays of different sizes and measure search times
    public void display() {
        Random rand = new Random();

        // Small array
        System.out.println("Small Array: ");
        int[] small = new int[1000];
        for (int i = 0; i < 1000; i++) {
            small[i] = rand.nextInt(1000);
        }
        double startTime1 = System.nanoTime();
        arraySearching(small, 259);
        double endTime1 = System.nanoTime();
        double timeTaken1 = (endTime1 - startTime1) / 1000000;
        System.out.println("Time Taken By Small Array: " + timeTaken1);

        // Medium array
        System.out.println("Medium Array: ");
        int[] medium = new int[100000];
        for (int i = 0; i < 100000; i++) {
            medium[i] = rand.nextInt(100000);
        }
        double startTime2 = System.nanoTime();
        arraySearching(medium, 25029);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2) / 1000000;
        System.out.println("Time Taken By Medium Array: " + timeTaken2);

        // Large array
        System.out.println("Large Array: ");
        int[] large = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            large[i] = rand.nextInt(1000000);
        }
        double startTime3 = System.nanoTime();
        arraySearching(large, 201209);
        double endTime3 = System.nanoTime();
        double timeTaken3 = (endTime3 - startTime3) / 1000000;
        System.out.println("Time Taken By Large Array: " + timeTaken3);
    }
}
