package binarysearch;

public class PeakElement {
    // Method to find the peak index in the array
    public int peakIndex(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int indexOfPeak = -1;

        // Binary search to find the peak element
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                indexOfPeak = mid;
                break;
            } else if (array[mid - 1] > array[mid]) {
                right = mid - 1; // Move the right pointer to mid - 1
            } else if (array[mid] < array[mid + 1]) {
                left = mid + 1; // Move the left pointer to mid + 1
            }
        }
        return indexOfPeak;
    }

    public static void main(String args[]) {
        // Array to find the peak index
        int[] array = {1, 2, 5, 4, 3, 2, 1};

        // Create an instance of PeakElement
        PeakElement peak = new PeakElement();

        // Get the peak index
        int index = peak.peakIndex(array);

        // Print the result based on the index found
        if (index == -1) {
            System.out.println("Nothing Searched");
        } else {
            System.out.println("Index of Peak: " + index);
        }
    }
}
