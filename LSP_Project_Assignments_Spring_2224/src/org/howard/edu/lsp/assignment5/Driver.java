package org.howard.edu.assignment5;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Test your IntegerSet class here
        ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        ArrayList<Integer> set2 = new ArrayList<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        IntegerSet intSet1 = new IntegerSet(set1);
        IntegerSet intSet2 = new IntegerSet(set2);

        System.out.println("Set 1: " + intSet1);
        System.out.println("Set 2: " + intSet2);

        intSet1.union(intSet2);
        System.out.println("Union: " + intSet1);
        
        intSet1.reverseUnion(intSet2);


        intSet1.intersect(intSet2);
        System.out.println("Intersection: " + intSet1);

        intSet1.diff(intSet2);
        System.out.println("Difference: " + intSet1);
        
        intSet1.add(3);
        System.out.println(intSet1);

        try {
            System.out.println("Largest in Set 1: " + intSet1.largest());
            System.out.println("Smallest in Set 1: " + intSet1.smallest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Is Set 1 empty? " + intSet1.isEmpty());
    }
}
