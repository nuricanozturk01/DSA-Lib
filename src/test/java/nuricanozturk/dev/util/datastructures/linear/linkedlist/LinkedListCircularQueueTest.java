/**
 * FILE		    : LinkedListCircularQueueTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 28.05.2023
 * LinkedListCircularQueueTest class is test class for LinkedListCircularQueue class.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListCircularQueueTest {
    private LinkedListCircularQueue<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new LinkedListCircularQueue<>(3);
    }

    @Test
    public void testEnqueueAndDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.getSize());

        assertEquals(1, queue.dequeue().orElseThrow());
        assertEquals(2, queue.dequeue().orElseThrow());
        assertEquals(3, queue.dequeue().orElseThrow());
        assertEquals(0, queue.getSize());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEnqueueWhenFull() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        assertEquals(3, queue.getSize());
        assertFalse(queue.isEmpty());

        assertEquals(2, queue.dequeue().orElseThrow());
        assertEquals(3, queue.dequeue().orElseThrow());
        assertEquals(4, queue.dequeue().orElseThrow());
        assertEquals(0, queue.getSize());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.peek().orElseThrow());

        queue.dequeue();

        assertEquals(2, queue.peek().orElseThrow());

        queue.dequeue();

        assertTrue(queue.peek().isEmpty());
    }

    @Test
    public void testIsFullAndIsEmpty() {
        assertTrue(queue.isEmpty());
        assertFalse(queue.isFull());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertFalse(queue.isEmpty());
        assertTrue(queue.isFull());

        queue.dequeue();

        assertFalse(queue.isFull());
    }
}