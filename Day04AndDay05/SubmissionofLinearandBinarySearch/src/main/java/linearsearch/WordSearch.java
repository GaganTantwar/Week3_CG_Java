package linearsearch;
import java.util.*;

public class WordSearch {
    // Method to find sentences containing the input word
    public String sentenceFinder(String input) {
        // Array of sentences to search within
        String[] words = {"Hello and Welcome To Capgemini", "I am Gagan Tantwar your host", "Lets Start this wonderful session"};
        StringBuilder sentence = new StringBuilder();

        // Loop through the sentences
        for (int i = 0; i < words.length; i++) {
            // Split each sentence into words
            String[] temp = words[i].split(" ");

            // Loop through the words in the sentence
            for (String word : temp) {
                // If the word matches the input word (case-insensitive), add the sentence to the result
                if (word.equalsIgnoreCase(input)) {
                    sentence.append(words[i]);
                    break;
                }
            }
        }

        // If no sentences contain the word, return "Word Not Found"
        if (sentence.toString().length() == 0) {
            sentence.append("Word Not Found");
        }

        return sentence.toString();
    }

    public static void main(String args[]) {
        // Create an instance of WordSearch
        WordSearch ws = new WordSearch();

        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String: ");
        String input = sc.next();

        // Get the sentence(s) containing the input word
        String sentence = ws.sentenceFinder(input);

        // Print the result
        System.out.println(sentence);
    }
}
