// Package declaration
package hashmap.longestconsecutivesquence;

import java.util.*;

// Class representing the LongestConsecutiveSequence problem
public class LongestConsecutiveSequence {

    // Method to find the longest consecutive sequence in an array
    public static int consecutive(int nums[]) {
        if (nums.length == 0) return 0;

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num); // Store numbers in a HashSet for quick lookups
        }

        int longest = 0;

        for (int num : numSet) {
            // Only start counting if it's the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int length = 1;
                int curr = num;
                while (numSet.contains(curr + 1)) {
                    length++;
                    curr++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    // Main method to test the LongestConsecutiveSequence class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Value: ");
            arr[i] = sc.nextInt();
        }
        int longest = consecutive(arr);
        System.out.println("Longest Consecutive: " + longest);
    }
}
