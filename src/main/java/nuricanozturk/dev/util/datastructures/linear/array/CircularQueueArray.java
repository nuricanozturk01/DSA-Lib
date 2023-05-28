/**
 * FILE		    : CircularQueueArray.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 28.05.2023
 * CircularQueueArray class represent the circular queue
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.array;

import nuricanozturk.dev.util.datastructures.linear.interfaces.IQueue;

import java.util.NoSuchElementException;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class CircularQueueArray<T> implements IQueue<T> {
    private final T[] m_queueArr;
    private final int m_capacity;
    private int m_rear;
    private int m_front;
    private int m_size;

    @SuppressWarnings("unchecked")
    public CircularQueueArray(int capacity) {
        m_queueArr = (T[]) new Object[capacity];
        m_capacity = capacity;
        m_rear = 0;
        m_front = 0;
        m_size = 0;
    }

    public CircularQueueArray() {
        this(10);
    }

    public int getSize() {
        return m_size;
    }

    @Override
    public Optional<T> peek() {
        return isEmpty() ? empty() : of(m_queueArr[m_front]);
    }

    @Override
    public Optional<T> dequeue() {
        if (isEmpty())
            throw new NoSuchElementException("Queue has not element...");

        var element = m_queueArr[m_front];
        m_queueArr[m_front] = null;
        m_front = (m_front + 1) % m_capacity;
        m_size--;
        return of(element);
    }

    @Override
    public void enqueue(T item) {
        m_queueArr[m_rear] = item;
        m_rear = (m_rear + 1) % m_capacity;
        m_size++;
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Unsupported Operation!");
    }

    @Override
    public boolean isEmpty() {
        return m_queueArr[m_front] == null;
    }
}