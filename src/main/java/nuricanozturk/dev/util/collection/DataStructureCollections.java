/*----------------------------------------------------------------
	FILE		: DataStructureCollections.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 24.04.2023
	DataStructureCollections class has factory methods about Data Structures.
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.collection;

import nuricanozturk.dev.util.datastructures.linear.array.CircularQueueArray;
import nuricanozturk.dev.util.datastructures.linear.array.QueueArray;
import nuricanozturk.dev.util.datastructures.linear.array.StackArray;
import nuricanozturk.dev.util.datastructures.linear.linkedlist.*;

public final class DataStructureCollections {
    private DataStructureCollections() {
    }

    public static <T> LinkedList<T> createEmptySinglyLinkedList() {
        return new LinkedList<T>();
    }

    public static <T> DoublyLinkedList<T> createEmptyDoublyLinkedList() {
        return new DoublyLinkedList<T>();
    }

    public static <T> StackArray<T> createEmptyStackArray() {
        return new StackArray<T>();
    }

    public static <T> StackArray<T> createEmptyStackArray(int capacity) {
        return new StackArray<T>(capacity);
    }

    public static <T> LinkedListStack<T> createEmptyStackLinkedList() {
        return new LinkedListStack<T>();
    }

    public static <T> QueueArray<T> createEmptyQueueArray() {
        return new QueueArray<T>();
    }

    public static <T> QueueArray<T> createEmptyQueueArray(int capacity) {
        return new QueueArray<T>(capacity);
    }

    public static <T> LinkedListQueue<T> createEmptyQueueLinkedList() {
        return new LinkedListQueue<T>();
    }

    public static <T> CircularQueueArray<T> createEmptyCircularQueueArray() {
        return new CircularQueueArray<T>();
    }

    public static <T> CircularQueueArray<T> createEmptyCircularQueueArray(int capacity) {
        return new CircularQueueArray<T>(capacity);
    }

    public static <T> LinkedListCircularQueue<T> createEmptyCircularQueueLinkedList() {
        return new LinkedListCircularQueue<T>();
    }

    public static <T> LinkedListCircularQueue<T> createEmptyCircularQueueLinkedList(int capacity) {
        return new LinkedListCircularQueue<T>(capacity);
    }
}