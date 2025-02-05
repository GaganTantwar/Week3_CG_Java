package binarysearch;

public class TwoDbinarySearch {
    // Method to perform binary search in a 2D array
    public boolean twodBinarySearching(int value) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = array.length;
        int cols = array[0].length;
        int left = 0;
        int right = rows * cols - 1;

        // Binary search to find the element in the 2D array
        while (left <= right) {
            int mid = (left + right) / 2;
            int row = mid / cols;
            int col = mid % cols;

            // If the element is found, return true
            if (array[row][col] == value) {
                return true;
            } else if (array[row][col] > value) {
                right = mid - 1; // Move the right pointer to mid - 1
            } else {
                left = mid + 1; // Move the left pointer to mid + 1
            }
        }
        return false; // Return false if the element is not found
    }

    public static void main(String args[]) {
        // Create an instance of TwoDbinarySearch
        TwoDbinarySearch search = new TwoDbinarySearch();
        int target = 8;

        // Perform binary search for the target element
        boolean found = search.twodBinarySearching(target);

        // Print the result based on whether the element is found
        if (found == true) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
