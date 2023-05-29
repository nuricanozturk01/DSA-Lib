package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    void testInsertFirst() {
        linkedList.insertFirst("Nuri");
        linkedList.insertFirst("Can");
        assertEquals(2, linkedList.size());
        assertEquals("Can", linkedList.removeFirst().orElse(null));
        assertEquals("Nuri", linkedList.removeFirst().orElse(null));
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void testInsertLast() {
        linkedList.insertLast("John");
        linkedList.insertLast("Wick");
        assertEquals(2, linkedList.size());
        assertEquals("John", linkedList.removeFirst().orElse(null));
        assertEquals("Wick", linkedList.removeFirst().orElse(null));
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void testRemoveElement() {
        linkedList.insertLast("Apple");
        linkedList.insertLast("Banana");
        linkedList.insertLast("Cherry");

        Optional<String> removedElement = linkedList.removeElement("Banana");
        assertTrue(removedElement.isPresent());
        assertEquals("Banana", removedElement.orElse(null));
        assertEquals(2, linkedList.size());
        assertFalse(linkedList.contains("Banana"));

        removedElement = linkedList.removeElement("Grapes");
        assertFalse(removedElement.isPresent());
        assertEquals(2, linkedList.size());
    }
}
