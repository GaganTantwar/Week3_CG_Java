package stringbuffer;
import java.util.*;

public class StringConcat {
    // Method to concatenate strings from an array using StringBuffer
    public String concatString() {
        String[] strings = {"Hello ", "Welcome ", "to ", "Java ", "Tutorial"};
        StringBuffer result = new StringBuffer();

        // Append each string from the array to the result
        for (int i = 0; i < strings.length; i++) {
            result.append(strings[i]);
        }

        // Convert the result to a string and return it
        String answer = result.toString();
        return answer;
    }

    public static void main(String args[]) {
        // Create an instance of StringConcat
        StringConcat sc = new StringConcat();

        // Call concatString method and store the result
        String answer = sc.concatString();

        // Print the concatenated string
        System.out.println("Concatenated String: " + answer);
    }
}
