/*----------------------------------------------------------------
	FILE		: LinkedList.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	LinkedList class represent LinkedList linear data structure
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.datastructures.linear;

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
        var ll = new LinkedList<String>();

        ll.insertLast("nuri");
        ll.insertLast("can");
        ll.insertLast("ozturk");
        ll.insertLast("ali");
        ll.insertLast("veli");
        ll.removeFirst();
        ll.removeFirst();
        ll.removeFirst();
        ll.removeFirst();
        ll.removeFirst();
        ll.forEach(System.out::println);

       /* var node = ll.getHead();

        while (!ll.isEmpty() && node != null)
        {
            System.out.println(node.getData());
            node = node.getNext();
        }*/


        System.out.println("\n");


        ll.forEach(System.out::println);
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
    public void insert(SinglyLinkedListNode<T> node, T searchedData) {

    }

    @Override
    public Optional<T> removeElement(T element) {
        if (m_head == null)
            return empty();

        if (m_head.getData().equals(element)) {
            m_head = m_head.getNext();
            return of(element);
        }

        var currentNode = m_head;

        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getData().equals(element)) {
                currentNode.setNext(currentNode.getNext().getNext());
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
    public void forEach(Consumer<? super T> action) {
        for (T t : this)
            action.accept(t);
    }
//--------------------------------------------------------------------------------------------------------------------

    @Override
    public boolean contains(Object o) {
        return stream().anyMatch(l -> l.equals(o));
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("NOT SUPPORTED");
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
    public boolean remove(Object o) {
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
        return empty();
    }

    @Override
    public Optional<T> peek() {
        return empty();
    }
}


