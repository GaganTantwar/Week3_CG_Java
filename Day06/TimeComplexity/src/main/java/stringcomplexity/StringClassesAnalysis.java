package stringcomplexity;

public class StringClassesAnalysis {

    // Main method to compare the performance of different string manipulation classes
    public static void main(String args[]) {
        // Create an instance of StringComplexityAnalysis and measure the time taken for string concatenation
        StringComplexityAnalysis stringanalysis = new StringComplexityAnalysis();
        double time1 = stringanalysis.stringTime1();
        System.out.println("Time Taken By Short String: " + time1);
        double time2 = stringanalysis.stringTime2();
        System.out.println("Time Taken By Medium String: " + time2);
        double time3 = stringanalysis.stringTime3();
        System.out.println("Time Taken By Long String: " + time3);

        // Create an instance of StringBufferComplexityAnalysis and measure the time taken for string concatenation using StringBuffer
        StringBufferComplexityAnalysis bufferanalysis = new StringBufferComplexityAnalysis();
        double time4 = bufferanalysis.stringBufferTime1();
        System.out.println("Time Taken By Short StringBuffer: " + time4);
        double time5 = bufferanalysis.stringBufferTime2();
        System.out.println("Time Taken By Medium StringBuffer: " + time5);
        double time6 = bufferanalysis.stringBufferTime3();
        System.out.println("Time Taken By Long StringBuffer: " + time6);

        // Create an instance of StringBuilderComplexityAnalysis and measure the time taken for string concatenation using StringBuilder
        StringBuilderComplexityAnalysis builderanalysis = new StringBuilderComplexityAnalysis();
        double time7 = builderanalysis.stringBuilderTime1();
        System.out.println("Time Taken By Short StringBuilder: " + time7);
        double time8 = builderanalysis.stringBuilderTime2();
        System.out.println("Time Taken By Medium StringBuilder: " + time8);
        double time9 = builderanalysis.stringBuilderTime3();
        System.out.println("Time Taken By Long StringBuilder: " + time9);
    }
}
