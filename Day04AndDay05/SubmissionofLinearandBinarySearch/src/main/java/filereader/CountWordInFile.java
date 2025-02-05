package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWordInFile {
    // Method to count occurrences of a word in a file
    public boolean countWord(String input) {
        String filepath = "Sample.txt";
        int count = 0;

        // Try-with-resources to read lines from the file
        try (BufferedReader lineReader = new BufferedReader(new FileReader(filepath))) {
            String line;

            // Read each line from the file
            while ((line = lineReader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split(" ");

                // Count occurrences of the input word
                for (String word : words) {
                    if (word.equals(input)) {
                        count += 1;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the count of the input word
        System.out.println("Count of the given word: " + count);

        // Return true if the word is found, false otherwise
        return count > 0;
    }

    public static void main(String args[]) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        String filepath = "Sample.txt";

        // Prompt user to enter a word
        System.out.println("Enter a String: ");
        String input = sc.next();

        // Create an instance of CountWordInFile
        CountWordInFile words = new CountWordInFile();

        // Count occurrences of the input word and get the result
        boolean result = words.countWord(input);

        // Print if the word exists in the file
        System.out.println("Word exist : " + result);
    }
}
