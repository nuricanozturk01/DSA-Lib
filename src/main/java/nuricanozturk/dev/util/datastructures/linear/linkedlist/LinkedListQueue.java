/**
 * FILE		    : Queue.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 26.05.2023
 * Queue class is represent Queue data structure.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import nuricanozturk.dev.util.datastructures.linear.interfaces.IQueue;

import java.util.Optional;

import static java.util.Optional.empty;

public class LinkedListQueue<T> implements IQueue<T>
{
    private final LinkedList<T> m_linkedList;

    public LinkedListQueue()
    {
        m_linkedList = new LinkedList<>();
    }

    @Override
    public Optional<T> peek()
    {
        return m_linkedList.peek();
    }

    @Override
    public Optional<T> dequeue()
    {
        return m_linkedList.isEmpty() ? empty() : m_linkedList.removeFirst();
    }

    @Override
    public void enqueue(T item)
    {
        m_linkedList.insertLast(item);
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Unsupported Operation!");
    }

    @Override
    public boolean isEmpty() {
        return m_linkedList.isEmpty();
    }
}