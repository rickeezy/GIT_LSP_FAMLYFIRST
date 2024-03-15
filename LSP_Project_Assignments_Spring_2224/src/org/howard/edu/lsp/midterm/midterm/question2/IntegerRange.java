package org.howard.edu.lsp.midterm.question2;

/**
 * The IntegerRange class represents a range of integers defined by a lower bound and an upper bound.
 Rickelle Jones
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange object with the specified lower and upper bounds.
     * 
     * @param lowerBound The lower bound of the range.
     * @param upperBound The upper bound of the range.
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the specified value is contained within the range.
     * 
     * @param value The value to check.
     * @return true if the value is within the range, otherwise false.
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if this range overlaps with another range.
     * 
     * @param other The other range to check for overlap.
     * @return true if there is an overlap, otherwise false.
     */
    @Override
    public boolean overlaps(Range other) {
        return this.contains(((IntegerRange) other).getLowerBound()) || 
               this.contains(((IntegerRange) other).getUpperBound());
    }

    /**
     * Calculates the size of the range.
     * 
     * @return The number of integers in the range.
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Checks if this IntegerRange object is equal to another object.
     * Two IntegerRange objects are considered equal if their lower and upper bounds are the same.
     * 
     * @param obj The object to compare with.
     * @return true if the objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }

    /**
     * Gets the lower bound of the range.
     * 
     * @return The lower bound of the range.
     */
    public int getLowerBound() {
        return lowerBound;
    }

    /**
     * Gets the upper bound of the range.
     * 
     * @return The upper bound of the range.
     */
    public int getUpperBound() {
        return upperBound;
    }
}
