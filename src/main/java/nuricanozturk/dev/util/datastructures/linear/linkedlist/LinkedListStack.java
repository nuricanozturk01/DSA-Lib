/**
 * FILE		    : Stack.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 26.05.2023
 * Stack class is represent Stack data structure.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import nuricanozturk.dev.util.datastructures.linear.interfaces.IStack;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class LinkedListStack<T> implements IStack<T> {
    private final LinkedList<T> m_linkedList;

    public LinkedListStack() {
        m_linkedList = new LinkedList<>();
    }

    @Override
    public Optional<T> peek() {
        return !m_linkedList.isEmpty() ? of(m_linkedList.getHead().getData()) : empty();
    }

    @Override
    public Optional<T> pop() {
        return !m_linkedList.isEmpty() ? m_linkedList.removeFirst() : empty();
    }

    @Override
    public void push(T item) {
        m_linkedList.insertFirst(item);
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Unsupported Operation...");
    }

    @Override
    public boolean isEmpty() {
        return m_linkedList.isEmpty();
    }

    public int getSize() {
        return m_linkedList.size();
    }
}