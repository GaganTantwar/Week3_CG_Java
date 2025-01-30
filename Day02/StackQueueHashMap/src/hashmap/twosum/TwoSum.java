// Package declaration
package hashmap.twosum;

import java.util.*;

// Class representing the TwoSum problem
public class TwoSum {

    // Method to find two indices such that their values add up to the target
    public static int[] twosum(int arr[], int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if (maps.containsKey(remaining)) {
                return new int[]{maps.get(remaining), i};
            }
            maps.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    // Main method to test the TwoSum class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target");
        int target = sc.nextInt();

        int ans[] = twosum(arr, target);
        if (ans[0] == -1 && ans[1] == -1) {
            System.out.println("No Target Sum:");
        } else {
            System.out.println("Indices are: " + ans[0] + " and " + ans[1]);
        }
    }
}
