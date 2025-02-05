package challengeproblems;

import java.util.Arrays;

public class ChallengeProblem2 {
    // Method to find the first missing positive integer
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Place nums[i] in its correct position if it is within the range
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        // Find the first index where the element is not in its correct position
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1; // The first missing positive
            }
        }
        return nums.length + 1; // If all elements are in their correct positions
    }

    // Method to perform binary search on the sorted array
    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        Arrays.sort(nums); // Sort the array before binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1; // Move the high pointer to mid - 1
            } else {
                low = mid + 1; // Move the low pointer to mid + 1
            }
        }
        return index;
    }

    public static void main(String args[]) {
        // Create an instance of ChallengeProblem2
        ChallengeProblem2 challenge = new ChallengeProblem2();

        // Array to find the first missing positive integer and perform binary search
        int[] nums = {5, 8, 1, 6, 7};

        // Get the first missing positive integer
        int number = challenge.firstMissingPositive(nums);

        // Perform binary search for the value 6
        int index = challenge.binarySearch(nums, 6);

        // Print the results
        System.out.println("First Positive Number: " + number);
        System.out.println("Index of the given value: " + index);
    }
}
