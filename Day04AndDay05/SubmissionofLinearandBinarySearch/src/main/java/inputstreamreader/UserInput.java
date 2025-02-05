package inputstreamreader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    // Method to write user input to a file
    public void fileWrite() {
        String path = "UserInput.txt";

        // Try-with-resources to read user input from the console
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            FileWriter fl = new FileWriter(path);
            String userInput;
            System.out.println("Enter text (type 'exit' to stop):");

            // Read user input until "exit" is typed
            while (!(userInput = br.readLine()).equalsIgnoreCase("exit")) {
                fl.write(userInput + System.lineSeparator());  // Write each line to the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        // Create an instance of UserInput
        UserInput takeInput = new UserInput();

        // Call the fileWrite method to write user input to a file
        takeInput.fileWrite();
    }
}
