/**
 * FILE		    : IQueue.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 26.05.2023
 * IQueue interface is source for LinkedList Queue implementation.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear;

import java.util.Optional;

interface IQueue<T>
{
    /**
     * Get first element from Linked List. İf empty, return Optional.Empty().
     *
     * @return Optional<T> if not empty Linked List.
     */
    Optional<T> peek();

    /**
     * Remove first element in the queue
     *
     * @return removed element wrapped with Optional
     */
    Optional<T> dequeue();

    /**
     * enqueue element to queue
     *
     * @param item your item
     */
    void enqueue(T item);
}
