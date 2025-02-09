package complexityoflinearandbinarysearch;
import java.util.*;
public class SearchTarget {
    // Merge function to merge two halves of an array
    void merge(int array[], int mid, int low, int high) {
        int i, j, k;
        int[] temp = new int[high - low + 1]; // Temporary array to store merged elements
        i = low;
        j = mid + 1;
        k = 0;

        // Merge the two halves into temp array
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of the left half
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }

        // Copy remaining elements of the right half
        while (j <= high) {
            temp[k] = array[j];
            j++;
            k++;
        }

        // Copy the merged elements back to the original array
        for (int h = 0; h < temp.length; h++) {
            array[low + h] = temp[h];
        }
    }

    // Merge Sort function
    int[] mergeSorting(int array[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSorting(array, low, mid);
            mergeSorting(array, mid + 1, high);
            merge(array, mid, low, high);
        }
        return array;
    }

    // Linear search for small-sized data
    public double linearTimeForSmallData(int target){
        int []smallArray = new int[1000];
        Random rand = new Random();

        // Generate random numbers
        for(int i = 0; i < 1000; i++){
            smallArray[i] = rand.nextInt(1000);
        }

        int index = -1;
        double startTime = System.nanoTime();

        // Perform linear search
        for(int i = 0; i < 1000; i++){
            if(smallArray[i] == target){
                index = i;
                break;
            }
        }

        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000; // Convert to milliseconds

        if(index != -1){
            System.out.println("Element Found at Index: " + index + " and Time Taken By Linear Search for Small Size Data: " + timeTaken);
        } else {
            System.out.println("Element Not Found but Time Taken By Linear Search for Small Size Data: " + timeTaken);
        }

        return timeTaken;
    }

    // Linear search for medium-sized data
    public double linearTimeForMediumData(int target){
        int []mediumArray = new int[10000];
        Random rand = new Random();

        // Generate random numbers
        for(int i = 0; i < 10000; i++){
            mediumArray[i] = rand.nextInt(10000);
        }

        int index = -1;
        double startTime = System.nanoTime();

        // Perform linear search
        for(int i = 0; i < 10000; i++){
            if(mediumArray[i] == target){
                index = i;
                break;
            }
        }

        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;

        if(index != -1){
            System.out.println("Element Found at Index: " + index + " and Time Taken By Linear Search for Medium Size Data: " + timeTaken);
        } else {
            System.out.println("Element Not Found but Time Taken By Linear Search for Medium Size Data: " + timeTaken);
        }

        return timeTaken;
    }
    // Function to perform linear search on a large dataset and measure the time taken
    public double linearTimeForLargeData(int target) {
        int[] largeArray = new int[1000000];
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            int x = rand.nextInt(1000000);
            largeArray[i] = x;
        }
        int index = -1;
        double startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            if (largeArray[i] == target) {
                index = i;
                break;
            }
        }
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;
        if (index != -1) {
            System.out.println("Element Found Index: " + index + " Time Taken By Linear Search for Large Size Data: " + timeTaken);
        } else {
            System.out.println("Element Not Found but Time Taken By Linear Search for Large Size Data: " + timeTaken);
        }
        return timeTaken;
    }

        // Binary search for small-sized data
    public double binaryTimeForSmallData(int target){
        int []smallArray = new int[1000];
        Random rand = new Random();

        // Generate random numbers
        for(int i = 0; i < 1000; i++){
            smallArray[i] = rand.nextInt(1000);
        }

        // Sort the array before binary search
        int[] smallSortedArray = mergeSorting(smallArray, 0, smallArray.length - 1);

        int index = -1;
        int low = 0, high = 999;
        double startTime = System.nanoTime();

        // Perform binary search
        while(low <= high){
            int mid = (low + high) / 2;
            if(smallSortedArray[mid] == target){
                index = mid;
                break;
            }
            else if(target > smallSortedArray[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;

        if(index != -1){
            System.out.println("Element Found at Index: " + index + " and Time Taken By Binary Search for Small Size Data: " + timeTaken);
        } else {
            System.out.println("Element Not Found but Time Taken By Binary Search for Small Size Data: " + timeTaken);
        }

        return timeTaken;
    }
    public double binaryTimeForMediumData(int target) {
        int[] mediumArray = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int x = rand.nextInt(10000);
            mediumArray[i] = x;
        }

        // Call the mergeSorting function to sort the array
        int[] mediumSortedArray = mergeSorting(mediumArray, 0, mediumArray.length - 1);

        int index = -1;
        int low = 0;
        int high = 9999;
        double startTime = System.nanoTime();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mediumSortedArray[mid] == target) {
                index = mid;
                break;
            } else if (target > mediumSortedArray[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;
        if (index != -1) {
            System.out.println("Element Found at Index: " + index + " and Time Taken By Binary Search for Medium Size Data: " + timeTaken);
        } else {
            System.out.println("Element Not Found but Time Taken By Binary Search for Medium Size Data: " + timeTaken);
        }
        return timeTaken;
    }
    public double binaryTimeForLargeData(int target) {
        int[] largeArray = new int[1000000];
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            int x = rand.nextInt(1000000);
            largeArray[i] = x;
        }

        // Call the mergeSorting function to sort the array
        int[] largeSortedArray = mergeSorting(largeArray, 0, largeArray.length - 1);

        int index = -1;
        int low = 0;
        int high = 999999;
        double startTime = System.nanoTime();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (largeSortedArray[mid] == target) {
                index = mid;
                break;
            } else if (target > largeSortedArray[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000000;
        if (index != -1) {
            System.out.println("Element Found at Index: " + index + " and Time Taken By Binary Search for Large Size Data: " + timeTaken);
        } else {
            System.out.println("Element Not Found but Time Taken By Binary Search for Large Size Data: " + timeTaken);
        }
        return timeTaken;
    }
    public static void main(String args[]){
        SearchTarget sc = new SearchTarget();

        // Testing linear and binary search for different data sizes
        double result1 = sc.linearTimeForSmallData(110);
        double result2 = sc.linearTimeForMediumData(1100);
        double result3 = sc.linearTimeForLargeData(11000);
        double result4 = sc.binaryTimeForSmallData(110);
        double result5 = sc.binaryTimeForMediumData(1100);
        double result6 = sc.binaryTimeForLargeData(11000);
    }
}
