package nuricanozturk.dev.util.datastructures.linear;

import nuricanozturk.dev.util.exception.StackFullException;

import java.util.NoSuchElementException;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class StackArray<T> implements IStack<T> {
    private final int DEFAULT_CAPACITY = 10;
    private final T[] m_stackArr;
    private final int m_capacity;
    private int m_size;
    private int m_finger;

    public StackArray() {
        this(10);
    }

    public StackArray(int capacity) {
        m_capacity = capacity;
        m_size = 0;
        m_finger = -1;
        m_stackArr = (T[]) new Object[capacity];
    }

    @Override
    public Optional<T> peek() {
        return isEmpty() ? empty() : of(m_stackArr[m_finger]);
    }

    public int getSize() {
        return m_size;
    }

    @Override
    public Optional<T> pop() {

        if (isEmpty())
            throw new NoSuchElementException("Stack has not any element...");

        var item = m_stackArr[m_finger];

        m_stackArr[m_finger--] = null;
        m_size--;

        return of(item);
    }

    @Override
    public boolean isEmpty() {
        return m_size == 0;
    }

    @Override
    public boolean isFull() {
        return m_size == m_capacity;
    }

    @Override
    public void push(T item) {
        if (isFull())
            throw new StackFullException("Stack is full");

        m_stackArr[++m_finger] = item;
        m_size++;
    }
}
