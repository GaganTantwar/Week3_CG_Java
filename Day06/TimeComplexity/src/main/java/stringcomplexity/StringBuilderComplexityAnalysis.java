package stringcomplexity;

public class StringBuilderComplexityAnalysis {

    // Method to measure the time taken to append a string 1000 times using StringBuilder
    public double stringBuilderTime1() {
        double startTime = System.nanoTime();
        StringBuilder checker = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            checker.append("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }

    // Method to measure the time taken to append a string 10000 times using StringBuilder
    public double stringBuilderTime2() {
        double startTime = System.nanoTime();
        StringBuilder checker = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            checker.append("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }

    // Method to measure the time taken to append a string 1000000 times using StringBuilder
    public double stringBuilderTime3() {
        double startTime = System.nanoTime();
        StringBuilder checker = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            checker.append("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }
}
