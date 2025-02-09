package filecomplexity;

public class FileAnalysis {

    // Main method to compare the performance of InputReaderComplexity and FileReaderComplexity
    public static void main(String args[]) {
        // Create an instance of InputReaderComplexity and display its file reading time results
        InputReaderComplexity file1 = new InputReaderComplexity();
        file1.display();
        System.out.println(" ");
        // Create an instance of FileReaderComplexity and display its file reading time results
        FileReaderComplexity file2 = new FileReaderComplexity();
        file2.display();
    }
}
