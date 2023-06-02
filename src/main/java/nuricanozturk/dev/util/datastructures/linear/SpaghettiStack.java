/**
 * FILE		    : SpaghettiStackLinkedList.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 29.05.2023
 * Definition   : https://www.geeksforgeeks.org/spaghetti-stack/
 * SpaghettiStackLinkedList class represent Spaghetti stack linked list.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear;

import nuricanozturk.dev.util.datastructures.linear.interfaces.IStack;

import java.util.Optional;

class Node<T> {
    public String m_nodeName;
    public T m_data;
    public Node<T> m_previous;

    public Node(T data, String name) {
        m_data = data;
        m_previous = null;
        m_nodeName = name;
    }
}

public class SpaghettiStack<T> implements IStack<T> {
    private final Node<T> m_top;
    private int m_size;

    public SpaghettiStack() {
        m_top = null;
        m_size = 0;
    }

    @Override
    public Optional<T> peek() {
        return Optional.empty();
    }

    @Override
    public Optional<T> pop() {
        return Optional.empty();
    }

    @Override
    public void push(T item) {

    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
