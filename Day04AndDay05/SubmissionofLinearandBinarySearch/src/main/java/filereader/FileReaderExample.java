package filereader;
import java.io.*;

public class FileReaderExample {
    // Method to read the contents of a file and return it as a string
    public String fileReader() {
        String filepath = "Sample.txt";
        String result = "";

        // Try-with-resources to read lines from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Print each line to the console
                result += line;
                result += " ";  // Add space between lines
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String args[]) {
        // Create an instance of FileReaderExample
        FileReaderExample read = new FileReaderExample();

        // Read the contents of the file and store the result
        String result = read.fileReader();

        // Print the result
        System.out.println(result);
    }
}
