package datastructurecomplexity;

import java.util.HashSet;
import java.util.Random;

public class HashSetComplexity {

    // Method to search for a target element in a HashSet
    public void hashSearching(HashSet<Integer> hashSet, int target) {
        if (hashSet.contains(target)) {
            System.out.println("Element Found: ");
        } else {
            System.out.println("Element Not Found: ");
        }
    }

    // Method to generate HashSets of different sizes and measure search times
    public void display() {
        Random rand = new Random();

        // Small HashSet
        System.out.println("Small Set: ");
        HashSet<Integer> small = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            small.add(rand.nextInt(1000));
        }
        double startTime1 = System.nanoTime();
        hashSearching(small, 259);
        double endTime1 = System.nanoTime();
        double timeTaken1 = (endTime1 - startTime1) / 1000000;
        System.out.println("Time Taken By Small Set: " + timeTaken1);

        // Medium HashSet
        System.out.println("Medium Set: ");
        HashSet<Integer> medium = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            medium.add(rand.nextInt(100000));
        }
        double startTime2 = System.nanoTime();
        hashSearching(medium, 25029);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2) / 1000000;
        System.out.println("Time Taken By Medium Set: " + timeTaken2);

        // Large HashSet
        System.out.println("Large Set: ");
        HashSet<Integer> large = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            large.add(rand.nextInt(1000000));
        }
        double startTime3 = System.nanoTime();
        hashSearching(large, 201209);
        double endTime3 = System.nanoTime();
        double timeTaken3 = (endTime3 - startTime3) / 1000000;
        System.out.println("Time Taken By Large Set: " + timeTaken3);
    }
}
