package datastructuretesting;

import datastructurecomplexity.ArrayComplexity;
import datastructurecomplexity.HashSetComplexity;
import datastructurecomplexity.TreeSetComplexity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureTesting {

    // Test method to compare the performance of different data structures
    @Test
    public void dsaTesting() {
        ArrayComplexity arrCheck = new ArrayComplexity();
        int array[] = {1, 4, 6, 3, 9, 5, 7, 8, 2, 10};

        // Measure time taken by array search
        long startTime1 = System.nanoTime();
        arrCheck.arraySearching(array, 7);
        long endTime1 = System.nanoTime();
        long timeTaken1 = endTime1 - startTime1;
        System.out.println("Time Taken By Array: " + timeTaken1);

        HashSetComplexity hashCheck = new HashSetComplexity();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add((i + 1));
        }

        // Measure time taken by HashSet search
        long startTime2 = System.nanoTime();
        hashCheck.hashSearching(set, 7);
        long endTime2 = System.nanoTime();
        long timeTaken2 = endTime2 - startTime2;
        System.out.println("Time Taken By Hash Set: " + timeTaken2);

        TreeSetComplexity treeCheck = new TreeSetComplexity();
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            tree.add((i + 1));
        }

        // Measure time taken by TreeSet search
        long startTime3 = System.nanoTime();
        treeCheck.treeSearching(tree, 7);
        long endTime3 = System.nanoTime();
        long timeTaken3 = endTime3 - startTime3;
        System.out.println("Time Taken By Tree Set: " + timeTaken3);

        // Check if the time taken by array search is greater than both HashSet and TreeSet searches
        boolean ans = false;
        if (timeTaken1 > timeTaken2 && timeTaken1 > timeTaken3) {
            if (timeTaken3 != timeTaken2) {
                ans = true;
            }
        }

        // Assert the result
        Assertions.assertEquals(true, ans);
        System.out.println("Testing Pass");
    }
}
