/*----------------------------------------------------------------
	FILE		: LinkedList.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	LinkedList class represent LinkedList linear data structure
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.datastructures.linear;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LinkedList <T> implements Iterable<T>
{
    private SinglyLinkedListNode<T> m_head;

    public LinkedList()
    {
        m_head = new SinglyLinkedListNode<>(null);
        m_head.setNext(null);
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

    }

    public void insertLast(T data)
    {

    }

    public <S extends Comparable<S>> void sort(Predicate<T> predicate)
    {

    }
    public void print(Consumer<T> consumer)
    {
        for (SinglyLinkedListNode<T> p = m_head; p.getNext() != null; p = p.getNext())
            consumer.accept(p.getData());
        System.out.println();
    }

    public void print()
    {
       print(System.out::println);
    }

    @Override
    public Iterator<T> iterator()
    {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action)
    {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator()
    {
        return Iterable.super.spliterator();
    }

    public static void main(String[] args)
    {
        var ll = new LinkedList<String>();

        ll.insertFirst("nuri");
        ll.insertFirst("can");
        ll.insertFirst("ozturk");

        ll.print(data -> System.out.printf("%s ", data));
        ll.print();
    }
}


