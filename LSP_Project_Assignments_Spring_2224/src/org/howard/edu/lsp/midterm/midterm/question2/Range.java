package org.howard.edu.lsp.midterm.question2;

/**
 * The Range interface represents a range of values.
 */
public interface Range {
    
    /**
     * Checks if the specified value is contained within the range.
     * 
     * @param value The value to check.
     * @return true if the value is within the range, otherwise false.
     Rickelle Jones
     */
    public boolean contains(int value);
    
    /**
     * Checks if this range overlaps with another range.
     * 
     * @param other The other range to check for overlap.
     * @return true if there is an overlap, otherwise false.
     */
    public boolean overlaps(Range other);
    
    /**
     * Calculates the size of the range.
     * 
     * @return The number of elements in the range.
     */
    public int size();
}
