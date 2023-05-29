/**
 * FILE		    : DoublyLinkedList.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 28.05.2023
 * DoublyLinkedList class represent doubly linked list.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import nuricanozturk.dev.util.collection.DataStructureCollections;
import nuricanozturk.dev.util.datastructures.linear.interfaces.IDoublyLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class DoublyLinkedList<T> implements IDoublyLinkedList<T> {
    private DoublyLinkedListNode<T> m_head;
    private DoublyLinkedListNode<T> m_tail;
    private int m_size;

    public DoublyLinkedListNode<T> getHead() {
        return m_head;
    }

    public DoublyLinkedListNode<T> getTail() {
        return m_tail;
    }

    public DoublyLinkedList() {
        m_head = null;
        m_tail = null;
        m_size = 0;
    }

    @Override
    public void insertFirst(T item) {
        var newNode = new DoublyLinkedListNode<T>(item);
        if (isEmpty()) {
            m_head = newNode;
            m_tail = newNode;
        }
        else {
            newNode.setNext(m_head);
            m_head.setPrev(newNode);
            m_head = newNode;
        }
        m_size++;
    }

    @Override
    public void insertLast(T item) {
        var newNode = new DoublyLinkedListNode<T>(item);
        if (isEmpty()) {
            m_head = newNode;
            m_tail = newNode;
        }
        else {
            newNode.setPrev(m_tail);
            m_tail.setNext(newNode);
            m_tail = newNode;
        }
        m_size++;
    }

    @Override
    public void insert(DoublyLinkedListNode<T> node, T searchedData) {
        var newNode = new DoublyLinkedListNode<T>(searchedData);
        if (node == null) {
            insertFirst(searchedData);
        }
        else {
            var currentNode = m_head;

            while (currentNode != null && currentNode != node)
                currentNode = currentNode.getNext();

            if (currentNode != null) {
                newNode.setNext(currentNode.getNext());
                newNode.setPrev(currentNode);
                if (currentNode.getNext() != null)
                    currentNode.getNext().setPrev(newNode);

                currentNode.setNext(newNode);

                if (currentNode == m_tail)
                    m_tail = newNode;

                m_size++;
            }
        }
    }


    @Override
    public Optional<T> removeElement(T element) {
        var currentNode = m_head;
        while (currentNode != null && !currentNode.getData().equals(element))
            currentNode = currentNode.getNext();

        if (currentNode != null) {
            if (currentNode == m_head) {
                m_head = currentNode.getNext();
                if (m_head != null)
                    m_head.setPrev(null);

            } else {
                currentNode.getPrev().setNext(currentNode.getNext());
                if (currentNode == m_tail)
                    m_tail = currentNode.getPrev();
                else currentNode.getNext().setPrev(currentNode.getPrev());
            }
            m_size--;
            return of(currentNode.getData());
        }
        return empty();
    }

    @Override
    public Optional<T> removeFirst() {
        if (isEmpty()) {
            return empty();
        }
        var removedNode = m_head;
        m_head = m_head.getNext();

        if (m_head != null)
            m_head.setPrev(null);
        else m_tail = null;

        m_size--;
        return of(removedNode.getData());
    }

    @Override
    public Optional<T> removeLast() {
        if (isEmpty()) {
            return empty();
        }
        var removedNode = m_tail;
        m_tail = m_tail.getPrev();

        if (m_tail != null)
            m_tail.setNext(null);

        else m_head = null;

        m_size--;
        return of(removedNode.getData());
    }


    @Override
    public Optional<T> peek() {
        return isEmpty() ? empty() : of(m_head.getData());
    }

    @Override
    public int size() {
        return m_size;
    }

    @Override
    public boolean isEmpty() {
        return m_size == 0;
    }

    //----------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public LinkedList<T> clone(LinkedList<T> linkedList) {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
