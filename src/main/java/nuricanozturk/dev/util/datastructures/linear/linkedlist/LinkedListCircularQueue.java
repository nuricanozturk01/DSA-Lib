package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import nuricanozturk.dev.util.datastructures.linear.interfaces.IQueue;

import java.util.NoSuchElementException;
import java.util.Optional;

public class LinkedListCircularQueue<T> implements IQueue<T> {
    private final int m_capacity;
    private int m_size;
    private DoublyLinkedListNode<T> m_head;
    private DoublyLinkedListNode<T> m_tail;

    public LinkedListCircularQueue(int capacity) {
        m_head = null;
        m_tail = null;
        m_size = 0;
        m_capacity = capacity;
    }

    public LinkedListCircularQueue() {
        this(10);
    }

    @Override
    public Optional<T> peek() {
        return isEmpty() ? Optional.empty() : Optional.of(m_head.getData());
    }

    @Override
    public Optional<T> dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        T data = m_head.getData();
        m_head = m_head.getNext();
        m_size--;

        if (isEmpty()) {
            m_tail = null;
        } else {
            m_head.setPrev(m_tail);
            m_tail.setNext(m_head);
        }

        return Optional.of(data);
    }

    @Override
    public void enqueue(T item) {
        if (isFull()) {
            m_head.setData(item);
            m_head = m_head.getNext();
            m_tail = m_tail.getNext();
        } else {
            var newNode = new DoublyLinkedListNode<T>(item);

            if (isEmpty()) {
                m_head = newNode;
                m_tail = newNode;
                m_head.setPrev(m_tail);
                m_tail.setNext(m_head);
            } else {
                newNode.setPrev(m_tail);
                newNode.setNext(m_head);
                m_tail.setNext(newNode);
                m_head.setPrev(newNode);
                m_tail = newNode;
            }
            m_size++;
        }
    }

    @Override
    public boolean isFull() {
        return m_size == m_capacity;
    }

    @Override
    public boolean isEmpty() {
        return m_size == 0;
    }

    public int getSize() {
        return m_size;
    }
}