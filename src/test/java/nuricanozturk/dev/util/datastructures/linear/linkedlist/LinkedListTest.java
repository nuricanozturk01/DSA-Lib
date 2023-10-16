/**
 * FILE		    : LinkedListStackTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 16.10.2023
 * LinkedListTest class is test class for LinkedList class.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
    private LinkedList<String> linkedList;

    @BeforeEach
    public void setUp()
    {
        linkedList = new LinkedList<>();
        linkedList.insertLast("ali");
        linkedList.insertLast("veli");
        linkedList.insertLast("can");
    }

    @Test
    public void testSize()
    {
        assertEquals(3, linkedList.size());
    }

    @Test
    public void testIsEmpty()
    {
        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void testInsertFirst()
    {
        linkedList.insertFirst("nuri");
        assertEquals("nuri", linkedList.getHead().getData());
    }

    @Test
    public void testInsertLast()
    {
        linkedList.insertLast("ahmet");
        var lastNode = linkedList.getHead();
        while (lastNode.getNext() != null)
        {
            lastNode = lastNode.getNext();
        }
        assertEquals("ahmet", lastNode.getData());
    }

    @Test
    public void testRemoveElement()
    {
        assertTrue(linkedList.removeElement("veli").isPresent());
        assertEquals(2, linkedList.size());
    }

    @Test
    public void testRemoveElement_NotFound()
    {
        assertFalse(linkedList.removeElement("deneme").isPresent());
        assertEquals(3, linkedList.size());
    }

    @Test
    public void testIterator()
    {
        int count = 0;
        for (String item : linkedList)
        {
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testRemoveFirst()
    {
        linkedList.removeFirst();
        assertEquals(2, linkedList.size());
    }

    @Test
    public void testRemoveLast()
    {
        linkedList.removeLast();
        assertEquals(2, linkedList.size());
    }

    @Test
    public void testPeek()
    {
        assertEquals("ali", linkedList.peek().get());
    }

    @Test
    public void testClone()
    {
        var clonedList = linkedList.clone(linkedList);
        assertNotSame(linkedList, clonedList);
        assertEquals(linkedList.size(), clonedList.size());
    }

    @Test
    public void testAddAll()
    {
        var newList = new LinkedList<String>();
        newList.addAll(linkedList);
        assertEquals(linkedList.size(), newList.size());
    }

    @Test
    public void testRemoveAll()
    {
        var removeList = new LinkedList<String>();
        removeList.insertLast("can");
        linkedList.removeAll(removeList);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void testRetainAll()
    {
        var retainList = new LinkedList<String>();
        retainList.insertLast("veli");
        linkedList.retainAll(retainList);
        assertEquals(1, linkedList.size());
    }

    @Test
    public void testClear()
    {
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }
}
