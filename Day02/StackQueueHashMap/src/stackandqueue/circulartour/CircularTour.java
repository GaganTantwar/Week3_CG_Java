// Package declaration
package stackandqueue.circulartour;

import java.util.*;

// Class representing the CircularTour problem
public class CircularTour {

    // Method to find the best starting position for the circular tour
    public static int bestPosition(int[] petrol, int[] costs, int length) {
        Deque<Integer> queue = new LinkedList<>();
        int totalFuel = 0;
        int totalCost = 0;
        int curr = 0;
        int ans = 0;
        queue.offer(ans);

        // Calculate total fuel and total cost
        for (int i = 0; i < length; i++) {
            totalFuel += petrol[i];
            totalCost += costs[i];
        }

        // If total cost is greater than total fuel, return -1
        if (totalCost > totalFuel) {
            return -1;
        }

        // Find the best starting position
        for (int i = 0; i < length; i++) {
            curr += (petrol[i] - costs[i]);
            if (curr < 0) {
                ans = i + 1;
                queue.offer(ans);
                curr = 0;
            }
        }
        return queue.pollLast();
    }

    // Main method to test the CircularTour class
    public static void main(String args[]) {
        int[] petrol = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int position = bestPosition(petrol, cost, cost.length);
        System.out.println("Best Position for Starting Journey: " + position);
        //Object obj=new Object();
    }

}
