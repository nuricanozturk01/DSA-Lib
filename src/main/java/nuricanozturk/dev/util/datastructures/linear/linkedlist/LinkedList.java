/*----------------------------------------------------------------
	FILE		: LinkedList.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	LinkedList class represent LinkedList linear data structure
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.datastructures.linear.linkedlist;

import nuricanozturk.dev.util.collection.DataStructureCollections;
import nuricanozturk.dev.util.datastructures.linear.interfaces.ILinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;

import static java.util.Optional.empty;
import static java.util.Optional.of;

// TODO: Not completed yet
public class LinkedList<T> implements ILinkedList<T> {
    private SinglyLinkedListNode<T> m_head;
    private int m_size;


    public LinkedList() {
        m_head = null;
        m_size = 0;
    }

    public static void main(String[] args) {
        var ll = DataStructureCollections.<String>createEmptyLinkedList();
        ll.insertLast("ali");
        ll.insertLast("veli");
        ll.insertLast("can");
        ll.insertLast("nuri");


        ll.removeLast();
        ll.removeLast();
        ll.removeLast();

        while (!ll.isEmpty())
            System.out.println(ll.removeFirst());
    }

    public SinglyLinkedListNode<T> getHead() {
        return m_head;
    }

    @Override
    public int size() {
        return m_size;
    }

    public boolean isEmpty() {
        return m_head == null;
    }

    @Override
    public LinkedList<T> clone(LinkedList<T> linkedList) {
        return null;
    }

    public void insertFirst(T data) {
        var node = new SinglyLinkedListNode<T>(data);

        if (isEmpty())
            m_head = node;
        else {
            var p = m_head;
            m_head = node;
            m_head.setNext(p);
        }

        m_size++;
    }

    public void insertLast(T data) {
        var node = new SinglyLinkedListNode<>(data);
        if (isEmpty()) {
            m_head = node;
        } else {
            var current = m_head;

            while (current.getNext() != null)
                current = current.getNext();

            current.setNext(node);
        }
        m_size++;
    }

    @Override
    public Optional<T> removeElement(T element) {
        if (m_head == null)
            return empty();

        if (m_head.getData().equals(element)) {
            m_head = m_head.getNext();
            m_size--;
            return of(element);
        }

        var currentNode = m_head;

        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getData().equals(element)) {
                currentNode.setNext(currentNode.getNext().getNext());
                m_size--;
                return of(element);
            }
            currentNode = currentNode.getNext();
        }

        return empty();
    }

    @Override
    public Iterator<T> iterator() {
        if (isEmpty())
            throw new NoSuchElementException("No such element on LinkedList....");
        return new Iterator<>() {
            private final SinglyLinkedListNode<T> emptyNode = new SinglyLinkedListNode<>(m_head.getData());
            SinglyLinkedListNode<T> p = emptyNode;

            {
                emptyNode.setNext(m_head);
            } //non static initializer

            @Override
            public boolean hasNext() {
                return p.getNext() != null;
            }

            @Override
            public T next() {
                if (!hasNext())
                    throw new NoSuchElementException("");

                p = p.getNext();

                return p.getData();
            }
        };
    }

    @Override
    public void insert(SinglyLinkedListNode<T> node, T searchedData) {
        if (isEmpty()) {
            m_head = node;
            m_size++;
            return;
        }

        var currentNode = m_head;
        SinglyLinkedListNode<T> previousNode = null;

        while (currentNode != null && !currentNode.getData().equals(searchedData)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode != null) {
            node.setNext(currentNode.getNext());
            currentNode.setNext(node);
            m_size++;
        } else if (previousNode != null) {
            previousNode.setNext(node);
            m_size++;
        }
    }

    @Override
    @SuppressWarnings("all")
    public boolean remove(Object object) {
        var obj = (T) object;

        var deletedElement = removeElement(obj);

        return deletedElement.isPresent();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (T t : this)
            action.accept(t);
    }

    @Override
    public boolean contains(Object o) {
        return stream().anyMatch(l -> l.equals(o));
    }
//--------------------------------------------------------------------------------------------------------------------

    @Override
    @SuppressWarnings("unchecked")
    public Object[] toArray() {
        return (T[]) stream().toArray(Object[]::new);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException("NOT SUPPORTED");
    }

    @Override
    public boolean add(T t) {
        throw new UnsupportedOperationException("NOT SUPPORTED");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("NOT SUPPORTED");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }

    public Optional<T> removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("LinkedList has not any element...");
        var deletedElement = m_head.getData();

        m_head = m_head.getNext();
        m_size--;
        return of(deletedElement);
    }

    @Override
    public Optional<T> removeLast() {
        if (isEmpty()) {
            return Optional.empty();
        }

        if (m_head.getNext() == null) {
            var deletedItem = m_head.getData();
            m_head = null;
            m_size--;
            return of(deletedItem);
        }

        var currentNode = m_head;

        while (currentNode.getNext().getNext() != null)
            currentNode = currentNode.getNext();

        var deletedItem = currentNode.getNext().getData();

        currentNode.setNext(null);
        m_size--;

        return of(deletedItem);
    }

    @Override
    public Optional<T> peek() {
        return of(m_head.getData());
    }
}