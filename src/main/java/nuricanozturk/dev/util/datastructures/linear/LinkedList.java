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
import java.util.function.Consumer;

// TODO: Not completed yet
public class LinkedList <T> implements Iterable<T>, Collection<T>
{
    private SinglyLinkedListNode<T> m_head;
    private int m_size;

    public LinkedList()
    {
        m_head = new SinglyLinkedListNode<>(null);
        m_head.setNext(null);
        m_size = 0;
    }

    @Override
    public int size()
    {
        return m_size;
    }

    public boolean isEmpty()
    {
        return  m_head == null;
    }

    public void insertFirst(T data)
    {
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<>(data);

        if (isEmpty())
            m_head = node;
        else
        {
            SinglyLinkedListNode<T> p = m_head;
            m_head = node;
            m_head.setNext(p);
        }

        m_size++;
    }

    public void insertLast(T data)
    {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }

    @Override
    public Iterator<T> iterator()
    {
        return new Iterator<>()
        {
            final SinglyLinkedListNode<T> emptyNode = new SinglyLinkedListNode<>(m_head.getData());

            { emptyNode.setNext(m_head); } //non static initializer
            SinglyLinkedListNode<T> p = emptyNode;
            @Override
            public boolean hasNext()
            {
                return p.getNext().getNext() != null;
            }

            @Override
            public T next()
            {
                if (!hasNext())
                    throw new NoSuchElementException("");

                p = p.getNext();

                return p.getData();
            }
        };
    }
    @Override
    public void forEach(Consumer<? super T> action)
    {
        for (T t : this)
            action.accept(t);
    }

    @Override
    public boolean contains(Object o)
    {
        return stream().anyMatch(l -> l.equals(o));
    }
//--------------------------------------------------------------------------------------------------------------------

    @Override
    public Object[] toArray()
    {
        throw new UnsupportedOperationException("NOT SUPPORTED");
    }

    @Override
    public <T1> T1[] toArray(T1[] a)
    {
        throw new UnsupportedOperationException("NOT SUPPORTED");
    }

    @Override
    public boolean add(T t)
    {
        throw new UnsupportedOperationException("NOT SUPPORTED");
    }

    @Override
    public boolean remove(Object o)
    {
        throw new UnsupportedOperationException("NOT SUPPORTED");
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }

    @Override
    public boolean addAll(Collection<? extends T> c)
    {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("NOT SUPPORTED");
    }

    @Override
    public void clear()
    {
        throw new UnsupportedOperationException("NOT IMPLEMENTED YET...");
    }






    public static void main(String[] args)
    {
        var ll = new LinkedList<String>();

        ll.insertFirst("nuri");
        ll.insertFirst("can");
        ll.insertFirst("ozturk");
        ll.insertFirst("ali");
        ll.insertFirst("veli");

        System.out.println(ll.size());

        ll.stream().filter(s -> s.contains("a")).forEach(System.out::println);
    }
}


