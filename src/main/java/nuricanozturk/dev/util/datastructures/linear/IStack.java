/**
 * FILE		    : IStack.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 26.05.2023
 * IStack interface is source for LinkedList Stack implementation.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear;

import java.util.Optional;

interface IStack<T>
{
    /**
     * Get first element from Linked List. İf empty, return Optional.Empty().
     *
     * @return Optional<T> if not empty Linked List.
     */
    Optional<T> peek();

    /**
     * Remove top element from stack
     *
     * @return return removed element with wrapper Optional
     */
    Optional<T> pop();

    /**
     * Insert your ıtem to stack
     *
     * @param item your item
     */
    void push(T item);
}
