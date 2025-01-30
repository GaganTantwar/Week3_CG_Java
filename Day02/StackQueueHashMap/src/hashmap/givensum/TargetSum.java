// Package declaration
package hashmap.givensum;

import java.util.*;

// Class representing the TargetSum problem
public class TargetSum {

    // Method to find two values in the array that add up to the target
    public static int[] targetsum(int arr[], int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if (maps.containsValue(remaining)) {
                return new int[]{remaining, arr[i]};
            }
            maps.put(i, arr[i]);
        }
        return new int[]{-1, -1};
    }

    // Main method to test the TargetSum class
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

        int ans[] = targetsum(arr, target);
        if (ans[0] == -1 && ans[1] == -1) {
            System.out.println("No Target Sum:");
        } else {
            System.out.println("Values are: " + ans[0] + " and " + ans[1]);
        }
    }
}
