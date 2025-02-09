package datastructurecomplexity;

public class DataStructureAnalysis {

    // Main method to test the search complexities of different data structures
    public static void main(String args[]) {
        // Create an instance of ArrayComplexity and display its search time results
        ArrayComplexity search = new ArrayComplexity();
        search.display();

        // Create an instance of HashSetComplexity and display its search time results
        HashSetComplexity hash = new HashSetComplexity();
        hash.display();

        // Create an instance of TreeSetComplexity and display its search time results
        TreeSetComplexity tree = new TreeSetComplexity();
        tree.display();
    }
}
