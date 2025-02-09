package filecomplexity;
import java.io.*;

public class InputReaderComplexity {

    // Method to read a file using InputStreamReader and measure the complexity of file reading
    public void fileComplexity(String filepath) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filepath))) {
            int i;
            // Reading file content (not printing)
            while ((i = reader.read()) != -1) {
                // Do nothing, just read the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to measure and display the time taken to read files of different sizes
    public void display() {
        // Measuring time for small file
        double startTime1 = System.nanoTime();
        String filepath1 = "SmallFile.test";
        fileComplexity(filepath1);
        double endTime1 = System.nanoTime();
        double timeTaken1 = (endTime1 - startTime1) / 1000000;
        System.out.println("Time Taken By InputStreamReader Small File: " + timeTaken1);
        System.out.println(" ");

        // Measuring time for medium file
        double startTime2 = System.nanoTime();
        String filepath2 = "MediumFile.test";
        fileComplexity(filepath2);
        double endTime2 = System.nanoTime();
        double timeTaken2 = (endTime2 - startTime2) / 1000000;
        System.out.println("Time Taken By InputStreamReader Medium File: " + timeTaken2);
        System.out.println(" ");

        // Measuring time for large file
        double startTime3 = System.nanoTime();
        String filepath3 = "LargeFile.test";
        fileComplexity(filepath3);
        double endTime3 = System.nanoTime();
        double timeTaken3 = (endTime3 - startTime3) / 1000000;
        System.out.println("Time Taken By InputStreamReader Large File: " + timeTaken3);
    }
}
