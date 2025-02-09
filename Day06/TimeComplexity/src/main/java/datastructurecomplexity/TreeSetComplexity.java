package datastructurecomplexity;

import java.util.HashSet;
import java.util.Random;
import java.util.*;

public class TreeSetComplexity {

    // Method to search for a target element in a TreeSet
    public void treeSearching(TreeSet<Integer> treeSet, int target) {
        if (treeSet.contains(target)) {
            System.out.println("Element Found: ");
        } else {
            System.out.println("Element Not Found: ");
        }
    }

    // Method to generate TreeSets of different sizes and measure search times
    public void display() {
        Random rand = new Random();

        // Small TreeSet
        System.out.println("Small Tree Set: ");
        TreeSet<Integer> small = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {
            small.add(rand.nextInt(1000));
        }
        double startTime1 = System.nanoTime();
        treeSearching(small, 259);
        double endTime1 = System.nanoTime();
        double timeTaken1 = (endTime1 - startTime1) / 1000000;
        System.out.println("Time Taken By Small TreeSet: " + timeTaken1);

        // Medium TreeSet
        System.out.println("Medium TreeSet: ");
        TreeSet<Integer> medium = new TreeSet<>();
        for (int i = 0; i < 100000; i++) {
            medium.add(rand.nextInt(100000));
        }
        double startTime2 = System.nanoTime();
        treeSearching(medium, 25029);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2) / 1000000;
        System.out.println("Time Taken By Medium TreeSet: " + timeTaken2);

        // Large TreeSet
        System.out.println("Large TreeSet: ");
        TreeSet<Integer> large = new TreeSet<>();
        for (int i = 0; i < 1000000; i++) {
            large.add(rand.nextInt(1000000));
        }
        double startTime3 = System.nanoTime();
        treeSearching(large, 201209);
        double endTime3 = System.nanoTime();
        double timeTaken3 = (endTime3 - startTime3) / 1000000;
        System.out.println("Time Taken By Large TreeSet: " + timeTaken3);
    }
}
