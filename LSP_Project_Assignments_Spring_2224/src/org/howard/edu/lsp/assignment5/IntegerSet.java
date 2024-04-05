package org.howard.edu.assignment5;

import java.util.ArrayList;
import java.util.List;


/**
 * Represents a set of integers. 
 */

public class IntegerSet {
	/**
	 * Original set elements before modifications
	 */
    // Store the set elements in an ArrayList
    private List<Integer> originalSet = new ArrayList<>();
    /**
     * Current set elements after modifications. 
     */
    //store current set elements in an ArrayList
    private List<Integer> set = new ArrayList<>();
    /**
     * Elements added when modified
     */
    //stores added elemnts 
    private List<Integer> addedElements = new ArrayList<>();
    /**
     * Default constructor for Integer Set
     */
    // Default Constructor
    public IntegerSet() {
    }

    /**
     * Constructor for IntegerSet with initial values
     * @param set The initial set of integers. 
     */
    // Constructor if you want to pass in already initialized
    public IntegerSet(ArrayList<Integer> set) {
        this.originalSet = new ArrayList<>(set);
    	this.set = new ArrayList<>(set);
    }
    /**
     * Clears internal representation of the set
     */
    // Clears the internal representation of the set
    public void clear() {
        set = new ArrayList<>(originalSet);
    }
    /**
     * Returns the number of elements in the set
     * @return The number of elements in the set
     */
    // Returns the length of the set
    public int length() {
        return set.size();
    }
    /** 
     * Checks if the set is equal to another set
     * @param The object compares with this set
     * @return true if the sets are equal, false otherwise
     */
    /*
     * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
     * they contain all of the same values in ANY order. This overrides the equal
     * method from the Object class.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }
    /**
     * Checks if the set contains a specific value
     * 
     * @param value The value to check for in the set
     * @return true if the set contains the value, otherwise false
     */
    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }
    /**
     * 
     * @return The largest element in the set
     * @throws IntegerSetException
     */
    // Returns the largest item in the set; Throws a IntegerSetException if the set is empty
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            int current = set.get(i);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
    /**
     * Finds the smallest element in the set 
     * @return The smallest element in the set
     * @throws IntegerSetException
     */
    // Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            int current = set.get(i);
            if (current < min) {
                min = current;
            }
        }
        return min;
    }
    
    /** 
     * Adds an element to the set if its not already there
     * @param item The item to add to the set 
     */

    // Adds an item to the set or does nothing it already there
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
            addedElements.add(item); //tracks changed elements
        }
    }
    /** 
     * Removes an element from the set if it is present 
     * @param item The item to remove from the set 
     */
    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove((Integer) item);
    }
    /**
     * Performs a set union operation with another set
     * @param intSetb The other set to perform union with
     */
    // Set union
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            add(item);
        }
    }
    /**
     * Reverses the effect of a union operation with anothe rset
     * @param intSetb The other set to reverse union with 
     */
    //reverses any operation done by union
    public void reverseUnion(IntegerSet intSetb) {
        for (int item : addedElements) {
            intSetb.remove(item); // Remove added elements from intSetb
        }
    }
    
    /** 
     * Performs a set intersection operation with another set
     * @param intSetb The other set to intersect with 
     */

    // Set intersection, all elements in s1 and s2
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }
    
    /** 
     * Performs a set difference with another set
     * @param intSetb The other set to find the difference with 
     */

    // Set difference, i.e., s1 –s2
    public void diff(IntegerSet intSetb) {
        List<Integer> copySet = new ArrayList<>(originalSet);
        copySet.removeAll(intSetb.set);
        set = copySet;
    }
    
    /**
     * Performs a set complement operation with another set
     * @param intSetb The other set to complement with 
     */
    
 // Set complement, all elements not in s1
    public void complement(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                add(item);
            }
        }
    }
    
    /**
     * Checks if the set is empty
     * @return True if the set is empty and false otherwise 
     */

    // Returns true if the set is empty, false otherwise
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set 
     * @return The string representation of the set
     */
    // Return String representation of your set. This overrides the equal method from
    // the Object class.
    @Override
    public String toString() {
        return set.toString();
    }
}

class IntegerSetException extends Exception {
    public IntegerSetException(String message) {
        super(message);
    }
}
