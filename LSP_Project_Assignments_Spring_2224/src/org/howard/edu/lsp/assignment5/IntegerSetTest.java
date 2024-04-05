package org.howard.edu.assignment5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {
    private IntegerSet set;

    @BeforeEach
    public void setUp() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.add(5);
        set.add(10);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(0, set.length());
        set.add(5);
        set.add(10);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet otherSet = new IntegerSet();
        set.add(5);
        set.add(10);
        otherSet.add(10);
        otherSet.add(5);
        assertTrue(set.equals(otherSet));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        set.add(5);
        set.add(10);
        assertTrue(set.contains(5));
        assertFalse(set.contains(15));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        set.add(5);
        set.add(10);
        assertEquals(10, set.largest());
        set.clear();
        assertThrows(IntegerSetException.class, () -> set.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        set.add(5);
        set.add(10);
        assertEquals(5, set.smallest());
        set.clear();
        assertThrows(IntegerSetException.class, () -> set.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set.add(5);
        set.add(10);
        assertEquals(2, set.length());
        set.add(5);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set.add(5);
        set.add(10);
        set.remove(5);
        assertFalse(set.contains(5));
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet otherSet = new IntegerSet();
        set.add(5);
        set.add(10);
        otherSet.add(10);
        otherSet.add(15);
        set.union(otherSet);
        assertTrue(set.contains(5));
        assertTrue(set.contains(10));
        assertTrue(set.contains(15));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet otherSet = new IntegerSet();
        set.add(5);
        set.add(10);
        otherSet.add(10);
        otherSet.add(15);
        set.intersect(otherSet);
        assertTrue(set.contains(10));
        assertFalse(set.contains(5));
        assertFalse(set.contains(15));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet otherSet = new IntegerSet();
        set.add(5);
        set.add(10);
        otherSet.add(10);
        otherSet.add(15);
        set.diff(otherSet);
        assertTrue(set.contains(5));
        assertFalse(set.contains(10));
        assertFalse(set.contains(15));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet otherSet = new IntegerSet();
        set.add(5);
        set.add(10);
        otherSet.add(10);
        otherSet.add(15);
        set.complement(otherSet);
        assertTrue(set.contains(15));
        assertFalse(set.contains(5));
        assertFalse(set.contains(10));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(set.isEmpty());
        set.add(5);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        set.add(5);
        set.add(10);
        assertEquals("[5, 10]", set.toString());
    }
}
