/**
 * FILE		    : ISpaghettiStack.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 26.05.2023
 * ISpaghettiStack interface is source for Spaghetti Stack implementation.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.linear.interfaces;

public interface ISpaghettiStack<T> extends IStack<T> {
    void pushAndCreateNewStack(T item);
}

