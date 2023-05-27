/**
 * FILE		    : Stack.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 26.05.2023
 * Stack class is represent Stack data structure.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class Stack<T> implements IStack<T>
{
    private final LinkedList<T> m_linkedList;

    public Stack()
    {
        m_linkedList = new LinkedList<>();
    }

    @Override
    public Optional<T> peek()
    {
        return !m_linkedList.isEmpty() ? of(m_linkedList.getHead().getData()) : empty();
    }

    @Override
    public Optional<T> pop()
    {
        return !m_linkedList.isEmpty() ? m_linkedList.removeFirst() : empty();
    }

    @Override
    public void push(T item)
    {
        m_linkedList.insertFirst(item);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return m_linkedList.isEmpty();
    }
}
