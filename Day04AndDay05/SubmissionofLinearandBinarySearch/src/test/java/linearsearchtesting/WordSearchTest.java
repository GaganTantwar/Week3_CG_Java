package linearsearchtesting;

import linearsearch.WordSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSearchTest {
    @Test
    public void searchWord() {
        // Create an instance of WordSearch
        WordSearch search = new WordSearch();

        // Get the sentence(s) containing the word "Hello"
        String sentence = search.sentenceFinder("Hello");
        boolean res = false;

        // Check if the result matches any of the expected sentences
        if (sentence.equals("Hello and Welcome To Capgemini")) {
            res = true;
        } else if (sentence.equals("I am Gagan Tantwar your host")) {
            res = true;
        } else if (sentence.equals("Lets Start this wonderful session")) {
            res = true;
        }

        // Assert that the result is as expected
        Assertions.assertEquals(res,true);

        // Print the result of the test
        System.out.println("Testing Successful");
    }
}
