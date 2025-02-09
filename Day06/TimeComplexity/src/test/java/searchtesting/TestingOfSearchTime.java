package searchtesting;

import complexityoflinearandbinarysearch.SearchTarget;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingOfSearchTime {

    // Test method to compare the performance of linear search and binary search with small size input
    @Test
    public void testingTimeSmall() {
        SearchTarget st = new SearchTarget();
        double result1 = st.linearTimeForSmallData(322);
        double result2 = st.binaryTimeForSmallData(322);
        boolean check = false;
        if (result1 > result2) {
            check = true;
        }
        // Assert the result
        Assertions.assertEquals(true, check);
        System.out.println("Testing Pass");
    }

    // Test method to compare the performance of linear search and binary search with medium size input
    @Test
    public void testingTimeMedium() {
        SearchTarget st = new SearchTarget();
        double result1 = st.linearTimeForMediumData(322);
        double result2 = st.binaryTimeForMediumData(322);
        boolean check = false;
        if (result1 > result2) {
            check = true;
        }
        // Assert the result
        Assertions.assertEquals(true, check);
        System.out.println("Testing Pass");
    }

    // Test method to compare the performance of linear search and binary search with large size input
    @Test
    public void testingTimeLarge() {
        SearchTarget st = new SearchTarget();
        double result1 = st.linearTimeForLargeData(322);
        double result2 = st.binaryTimeForLargeData(322);
        boolean check = false;
        if (result1 > result2) {
            check = true;
        }
        // Assert the result
        Assertions.assertEquals(true, check);
        System.out.println("Testing Pass");
    }
}
