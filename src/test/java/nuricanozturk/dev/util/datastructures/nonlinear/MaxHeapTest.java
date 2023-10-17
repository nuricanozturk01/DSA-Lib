/**
 * FILE		    : LinkedListCircularQueueTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 17.10.2023
 * MaxHeapTest class is test class for MaxHeapTest class. Created with ChatGPT
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.nonlinear;

import nuricanozturk.dev.util.collection.NCollection;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("all")
public class MaxHeapTest
{
    @Test
    public void testInsertAndExtractMaxStrings()
    {
        var maxHeap = (MaxHeap<String>) NCollection.createEmptyMaxHeap();
        maxHeap.insert("nuri");
        maxHeap.insert("can");
        maxHeap.insert("ozturk");

        assertEquals("ozturk", maxHeap.extractMax());
        assertEquals("nuri", maxHeap.extractMax());
        assertEquals("can", maxHeap.extractMax());
    }

    @Test
    public void testIsEmpty()
    {
        var maxHeap = (MaxHeap<String>) NCollection.createEmptyMaxHeap();
        assertTrue(maxHeap.isEmpty());
        maxHeap.insert("ahmet");
        assertFalse(maxHeap.isEmpty());
    }
}
