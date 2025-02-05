package challengeproblems;

import java.io.*;

public class ChallengeProblem1 {
    // Method to measure the time taken by StringBuilder to concatenate strings
    public void getTime1() {
        long startTime, endTime;
        startTime = System.nanoTime();

        // Create a StringBuilder and append "Hello" 1,000,000 times
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            builder.append("Hello");
        }

        endTime = System.nanoTime();
        long result = endTime - startTime;
        System.out.println("Time Required by String Builder: " + result);
    }

    // Method to measure the time taken by StringBuffer to concatenate strings
    public void getTime2() {
        long startTime, endTime;
        startTime = System.nanoTime();

        // Create a StringBuffer and append "Hello" 1,000,000 times
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            buffer.append("Hello");
        }

        endTime = System.nanoTime();
        long result = endTime - startTime;
        System.out.println("Time Required by String Buffer: " + (endTime - startTime));
    }

    // Method to count words in a file using BufferedReader and FileReader, and measure the time taken
    public void fileReader() {
        String filepath = "Sample2.txt";
        int count = 0;

        // Try-with-resources to read lines from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            long startTime = System.nanoTime();

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split(" ");

                // Count the number of words
                for (String word : words) {
                    count += 1;
                }
            }

            long endTime = System.nanoTime();
            long res = endTime - startTime;
            System.out.println("Time Taken by FileReader: " + res);
            System.out.println("Count of Word in File: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to count words in a file using BufferedReader and InputStreamReader, and measure the time taken
    public void inputReader() {
        String filepath = "Sample2.txt";
        int count = 0;

        // Try-with-resources to read lines from the file
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filepath)))) {
            String line;
            long startTime = System.nanoTime();

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split(" ");

                // Count the number of words
                for (String word : words) {
                    count += 1;
                }
            }

            long endTime = System.nanoTime();
            long res = endTime - startTime;
            System.out.println("Time Taken by InputStreamReader: " + res);
            System.out.println("Count of Word in File: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        // Create an instance of ChallengeProblem1
        ChallengeProblem1 challenge1 = new ChallengeProblem1();

        // Measure the time taken by StringBuilder
        challenge1.getTime1();

        // Measure the time taken by StringBuffer
        challenge1.getTime2();

        // Count words in a file using BufferedReader and FileReader, and measure the time taken
        challenge1.fileReader();

        // Count words in a file using BufferedReader and InputStreamReader, and measure the time taken
        challenge1.inputReader();
    }
}
