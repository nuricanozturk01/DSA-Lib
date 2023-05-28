/**
 * FILE		    : LinkedListQueueTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 28.05.2023
 * LinkedListQueueTest class is test class for LinkedListQueue class.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListQueueTest {
    private LinkedListQueue<Integer> linkedListQueue;

    @BeforeEach
    public void setUp() {
        linkedListQueue = new LinkedListQueue<>();
    }

    @Test
    public void testEnqueueAndDequeue() {
        // Enqueue elements
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);

        // Dequeue elements
        assertEquals(10, linkedListQueue.dequeue().orElseThrow());
        assertEquals(20, linkedListQueue.dequeue().orElseThrow());
        assertEquals(30, linkedListQueue.dequeue().orElseThrow());
    }

    @Test
    public void testPeek() {
        // Enqueue elements
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);

        // Check the front element
        assertEquals(10, linkedListQueue.peek().get());

        // Dequeue an element
        linkedListQueue.dequeue();

        // Check the front element again
        assertEquals(20, linkedListQueue.peek().orElseThrow());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(linkedListQueue.isEmpty());

        // Enqueue elements
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);

        assertFalse(linkedListQueue.isEmpty());

        // Dequeue all elements
        linkedListQueue.dequeue();
        linkedListQueue.dequeue();
        linkedListQueue.dequeue();

        assertTrue(linkedListQueue.isEmpty());
    }
}
