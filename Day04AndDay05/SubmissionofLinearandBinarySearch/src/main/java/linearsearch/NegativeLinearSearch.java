package linearsearch;

public class NegativeLinearSearch {
    // Method to find the index of the first negative element in the array
    public int negativeIndex() {
        int[] array = {1, 2, 3, 4, -2, 3, -4, 2};
        int indexOfNegative = -1;

        // Loop through the array to find the first negative element
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                indexOfNegative = i;
                break;
            }
        }

        return indexOfNegative;
    }

    public static void main(String args[]) {
        // Create an instance of NegativeLinearSearch
        NegativeLinearSearch index = new NegativeLinearSearch();

        // Get the index of the first negative element
        int negativeIndex = index.negativeIndex();

        // Print the result based on the index found
        if (negativeIndex == -1) {
            System.out.println("No Negative Value Present in Array:");
        } else {
            System.out.println("Index of First Negative Element: " + negativeIndex);
        }
    }
}
