package stringcomplexity;

public class StringBufferComplexityAnalysis {

    // Method to measure the time taken to append a string 1000 times using StringBuffer
    public double stringBufferTime1() {
        double startTime = System.nanoTime();
        StringBuffer checker = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            checker.append("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }

    // Method to measure the time taken to append a string 10000 times using StringBuffer
    public double stringBufferTime2() {
        double startTime = System.nanoTime();
        StringBuffer checker = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            checker.append("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }

    // Method to measure the time taken to append a string 1000000 times using StringBuffer
    public double stringBufferTime3() {
        double startTime = System.nanoTime();
        StringBuffer checker = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            checker.append("Hello");
        }
        double endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000);
        return timeTaken;
    }
}
