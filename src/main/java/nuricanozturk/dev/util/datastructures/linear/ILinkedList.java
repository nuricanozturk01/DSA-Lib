/**
 * FILE		    : ILinkedList.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 26.05.2023
 * ILinkedList class is source for LinkedList implementation.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear;

import java.util.Collection;
import java.util.Optional;

interface ILinkedList<T> extends Cloneable, Iterable<T>, Collection<T>
{
    /**
     * insert your item to head.
     *
     * @param item you want to add
     */
    void insertFirst(T item);

    /**
     * insert your item to last.
     *
     * @param item you want to add
     */
    void insertLast(T item);

    /**
     * First param node added after searched data
     *
     * @param node         your node
     * @param searchedData searching data
     */
    void insert(SinglyLinkedListNode<T> node, T searchedData);

    /**
     * Remove element from LinkedList. If it has same element one more than, remove first.
     *
     * @param element searching element for remove operation
     * @return removed element wrapper Optional
     */
    Optional<T> removeElement(T element);

    /**
     * Remove First element from Linked List. İf empty, return Optional.Empty().
     *
     * @return Optional<T> if not empty Linked List.
     */
    Optional<T> removeFirst();

    /**
     * Remove last element from Linked List. İf empty, return Optional.Empty().
     *
     * @return Optional<T> if not empty Linked List.
     */
    Optional<T> removeLast();

    /**
     * Get first element from Linked List. İf empty, return Optional.Empty().
     *
     * @return Optional<T> if not empty Linked List.
     */
    Optional<T> peek();

    /**
     * Check the Linked List is empty or not.
     *
     * @return is empty true else, false
     */
    boolean isEmpty();

    /**
     * Clone given LinkedList and return LinkedList object
     *
     * @param linkedList your Linked List
     * @return Cloned Linked List
     */
    LinkedList<T> clone(LinkedList<T> linkedList);
}
