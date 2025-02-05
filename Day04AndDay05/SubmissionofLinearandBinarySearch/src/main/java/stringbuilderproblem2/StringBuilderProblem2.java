package stringbuilderproblem2;

import java.util.HashSet;
import java.util.*;
public class StringBuilderProblem2 {
    // Class variables to store input string and set of characters
    private String input;
    private HashSet<Character> set;

    // Constructor to initialize the input string and the set
    public StringBuilderProblem2(String input) {
        this.input = input;
        this.set = new HashSet<Character>();
    }

    // Method to return a unique string by removing duplicate characters
    public String uniqueString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            // If the character is not already in the set, add it to the set and the result
            if (!set.contains(input.charAt(i))) {
                set.add(input.charAt(i));
                result.append(input.charAt(i));
            }
        }

        // Convert the result to a string and return it
        String unique = new String(result);
        return unique;
    }

    public static void main(String args[]) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.next();

        // Create an instance of StringBuilderProblem2 with input string
        StringBuilderProblem2 out = new StringBuilderProblem2(input);

        // Call uniqueString method and store the result
        String result = out.uniqueString();

        // Print the unique string
        System.out.println("Unique String: " + result);
    }
}
