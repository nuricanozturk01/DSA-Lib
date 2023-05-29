package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new DoublyLinkedList<>();
    }

    @Test
    void testInsertFirst() {
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        assertEquals(3, list.size());
        assertEquals(Optional.of(1), list.removeFirst());
        assertEquals(Optional.of(2), list.removeFirst());
        assertEquals(Optional.of(3), list.removeFirst());
        assertTrue(list.isEmpty());
    }

    @Test
    void testInsertLast() {
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);

        assertEquals(3, list.size());
        assertEquals(Optional.of(3), list.removeLast());
        assertEquals(Optional.of(2), list.removeLast());
        assertEquals(Optional.of(1), list.removeLast());
        assertTrue(list.isEmpty());
    }

    @Test
    void testInsert() {
        list.insertFirst(1);
        list.insertLast(3);

        DoublyLinkedListNode<Integer> node = list.getHead();
        list.insert(node, 2);

        assertEquals(3, list.size());
        assertEquals(Optional.of(1), list.removeFirst());
        assertEquals(Optional.of(2), list.removeFirst());
        assertEquals(Optional.of(3), list.removeFirst());
        assertTrue(list.isEmpty());
    }

    @Test
    void testRemoveElement() {
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);

        assertEquals(Optional.of(2), list.removeElement(2));
        assertFalse(list.contains(2));
        assertEquals(2, list.size());
        assertEquals(Optional.of(1), list.removeFirst());
        assertEquals(Optional.of(3), list.removeLast());
        assertTrue(list.isEmpty());
    }

    @Test
    void testRemoveFirst() {
        list.insertLast(1);
        list.insertLast(2);

        assertEquals(Optional.of(1), list.removeFirst());
        assertEquals(1, list.size());
        assertEquals(Optional.of(2), list.removeFirst());
        assertTrue(list.isEmpty());
        assertEquals(Optional.empty(), list.removeFirst());
    }

    @Test
    void testRemoveLast() {
        list.insertFirst(1);
        list.insertFirst(2);

        assertEquals(Optional.of(1), list.removeLast());
        assertEquals(1, list.size());
        assertEquals(Optional.of(2), list.removeLast());
        assertTrue(list.isEmpty());
        assertEquals(Optional.empty(), list.removeLast());
    }

    @Test
    void testPeek() {
        list.insertFirst(1);
        list.insertLast(2);

        assertEquals(Optional.of(1), list.peek());
        assertEquals(2, list.size());
    }

    @Test
    void testSize() {
        assertEquals(0, list.size());

        list.insertFirst(1);
        list.insertLast(2);

        assertEquals(2, list.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(list.isEmpty());

        list.insertFirst(1);

        assertFalse(list.isEmpty());
    }
}
