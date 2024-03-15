package org.howard.edu.lsp.midterm.question2;

/**
 * The RangeTester class contains a main method to test the functionality of the IntegerRange class.
 Rickelle Jones
 */
public class RangeTester {
    
    /**
     * The main method of the RangeTester class.
     * Creates instances of IntegerRange and tests its methods.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a new IntegerRange instance
        Range range1 = new IntegerRange(4, 9);
        
        // Test the contains method
        System.out.println("Does range1 contain 2? " + range1.contains(2)); // Should print true
        
        // Test the overlaps method
        IntegerRange range2 = new IntegerRange(2, 22);
        System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2)); // Should print true
        
        // Test the size method
        System.out.println("Size of range1: " + range1.size()); // Should print 6
        
        // Test the equals method
        IntegerRange range3 = new IntegerRange(4, 9);
        System.out.println("Are range1 and range3 equal? " + range1.equals(range3)); // Should print true
    }
}
