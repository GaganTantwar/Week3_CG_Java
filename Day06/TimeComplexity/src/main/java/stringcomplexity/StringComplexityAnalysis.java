package stringcomplexity;

public class StringComplexityAnalysis {

    // Method to measure the time taken to concatenate a string 1000 times
    public double stringTime1() {
        double startTime = System.nanoTime();
        String checker = "";
        for (int i = 0; i < 1000; i++) {
            checker = checker.concat("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }

    // Method to measure the time taken to concatenate a string 10000 times
    public double stringTime2() {
        double startTime = System.nanoTime();
        String checker = "";
        for (int i = 0; i < 10000; i++) {
            checker = checker.concat("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }

    // Method to measure the time taken to concatenate a string 1000000 times
    public double stringTime3() {
        double startTime = System.nanoTime();
        String checker = "";
        for (int i = 0; i < 1000000; i++) {
            checker = checker.concat("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }
}
