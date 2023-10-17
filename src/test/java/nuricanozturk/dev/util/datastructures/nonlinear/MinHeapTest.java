/**
 * FILE		    : LinkedListCircularQueueTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 17.10.2023
 * MinHeapTest class is test class for MinHeapTest class. Created with ChatGPT
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.nonlinear;

import static org.junit.Assert.*;

import nuricanozturk.dev.util.collection.NCollection;
import org.junit.Test;

@SuppressWarnings("all")
public class MinHeapTest {
    @Test
    public void testInsertAndExtractMinStrings() {
        var minHeap = (MinHeap<String>) NCollection.createEmptyMinHeap();
        minHeap.insert("nuri");
        minHeap.insert("can");
        minHeap.insert("ozturk");

        assertEquals("can", minHeap.extractMin());
        assertEquals("nuri", minHeap.extractMin());
        assertEquals("ozturk", minHeap.extractMin());
    }

    @Test
    public void testIsEmpty() {
        var minHeap = (MinHeap<String>) NCollection.createEmptyMinHeap();
        assertTrue(minHeap.isEmpty());
        minHeap.insert("ahmet");
        assertFalse(minHeap.isEmpty());
    }
}
