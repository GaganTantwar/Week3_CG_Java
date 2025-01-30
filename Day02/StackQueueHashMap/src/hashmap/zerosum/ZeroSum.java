// Package declaration
package hashmap.zerosum;

import java.util.*;

// Class representing the ZeroSum problem
public class ZeroSum {

    // Method to calculate subarrays with zero sum
    public static HashMap<Integer, Integer> calculate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    map.put(i, j);
                }
            }
        }
        return map;
    }

    // Main method to test the ZeroSum class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Values:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value:");
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = calculate(arr);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }
}
