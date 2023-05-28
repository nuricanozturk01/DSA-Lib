/**
 * FILE		    : QueueArrayTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 28.05.2023
 * QueueArrayTest class is test class for QueueArray class.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static nuricanozturk.dev.util.collection.DataStructureCollections.createEmptyQueueArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueArrayTest {
    private static final String[] stringArr = new String[]{"Nuri", "Can", "ozturk", "stack", "array"};
    private QueueArray<String> m_queue;

    @BeforeEach
    public void setup() {
        m_queue = createEmptyQueueArray();
        Arrays.stream(stringArr).forEach(m_queue::enqueue);
    }

    @DisplayName("Validate Enqueue Operation Size")
    @Test
    public void testPushOperationSize() {
        assertEquals(stringArr.length, m_queue.getSize());
    }

    @DisplayName("Validate Queue Items")
    @Test
    public void testQueueItems() {
        int index = 0;
        while (!m_queue.isEmpty())
            assertEquals(stringArr[index++], m_queue.dequeue().orElse(null));
    }

    @DisplayName("Dequeue all item and check size of Queue")
    @Test
    public void popAndSizeZeroTest() {
        while (!m_queue.isEmpty())
            m_queue.dequeue();
        assertEquals(0, m_queue.getSize());
    }
}
