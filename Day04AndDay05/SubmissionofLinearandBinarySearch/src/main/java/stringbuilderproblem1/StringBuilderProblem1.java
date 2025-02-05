package stringbuilderproblem1;

import java.util.*;
public class StringBuilderProblem1 {
    // Class variable to store input string
    private String inputString;

    // Constructor to initialize the input string
    public StringBuilderProblem1(String inputString) {
        this.inputString = inputString;
    }

    // Method to return the input string
    public String getString() {
        return inputString;
    }

    // Method to reverse the input string using StringBuilder
    public String reverse() {
        StringBuilder sb = new StringBuilder();
        sb.append(inputString);
        sb.reverse();
        String s = new String(sb);
        return s;
    }

    public static void main(String args[]) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();

        // Create an instance of StringBuilderProblem1 with input string
        StringBuilderProblem1 out = new StringBuilderProblem1(s);

        // Call reverse method and store the result
        String ans1 = out.reverse();

        // Print the reversed string
        System.out.println("String is reversed: " + ans1);
    }
}
