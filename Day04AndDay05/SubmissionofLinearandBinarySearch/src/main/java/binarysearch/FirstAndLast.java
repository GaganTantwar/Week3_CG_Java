package binarysearch;

public class FirstAndLast {
    // Method to find the first occurrence of the target element in the array
    public int first(int target) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 7, 8};
        int left = 0;
        int right = nums.length - 1;

        // Binary search to find the first occurrence
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid - 1; // Move the right pointer to mid - 1
                continue;
            } else if (nums[mid] > target) {
                right = mid - 1; // Move the right pointer to mid - 1
            } else {
                left = mid + 1; // Move the left pointer to mid + 1
            }
        }
        return left;
    }

    // Method to find the last occurrence of the target element in the array
    public int last(int target) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 7, 8};
        int left = 0;
        int right = nums.length - 1;

        // Binary search to find the last occurrence
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid + 1; // Move the left pointer to mid + 1
                continue;
            } else if (nums[mid] > target) {
                right = mid - 1; // Move the right pointer to mid - 1
            } else {
                left = mid + 1; // Move the left pointer to mid + 1
            }
        }
        return right;
    }

    public static void main(String args[]) {
        // Create an instance of FirstAndLast
        FirstAndLast index = new FirstAndLast();

        // Find the first and last occurrences of the target element
        int firstOccurrence = index.first(4);
        int lastOccurrence = index.last(4);

        // Print the results
        System.out.println("First Index of the Element: " + firstOccurrence);
        System.out.println("Last Index of the Element: " + lastOccurrence);
    }
}
