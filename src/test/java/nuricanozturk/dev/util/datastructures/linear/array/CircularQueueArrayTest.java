/**
 * FILE		    : CircularQueueArrayTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 28.05.2023
 * CircularQueueArrayTest class is test class for CircularQueueArray class.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularQueueArrayTest {
    private CircularQueueArray<Integer> queue;

    @BeforeEach
    public void init() {
        queue = new CircularQueueArray<>(5);
    }

    @Test
    public void testEnqueueAndDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.dequeue().orElseThrow());
        assertEquals(20, queue.dequeue().orElseThrow());
        assertEquals(30, queue.dequeue().orElseThrow());
    }

    @Test
    public void testPeek() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.peek().orElseThrow());

        queue.dequeue();

        assertEquals(20, queue.peek().orElseThrow());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertFalse(queue.isEmpty());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertTrue(queue.isEmpty());
    }
}
