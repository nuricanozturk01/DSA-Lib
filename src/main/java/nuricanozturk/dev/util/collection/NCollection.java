/*----------------------------------------------------------------
	FILE		: DataStructureCollections.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 16.10.2023
	Collection class has factory methods about All algorithms and data structures.
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.collection;

import nuricanozturk.dev.util.algorithms.sort.BubbleSort;
import nuricanozturk.dev.util.algorithms.sort.HeapSort;
import nuricanozturk.dev.util.datastructures.linear.array.CircularQueueArray;
import nuricanozturk.dev.util.datastructures.linear.array.QueueArray;
import nuricanozturk.dev.util.datastructures.linear.array.StackArray;
import nuricanozturk.dev.util.datastructures.linear.linkedlist.*;
import nuricanozturk.dev.util.functionalInterfaces.IBinaryPredicate;

import java.util.Collection;

public final class NCollection
{
    private NCollection()
    {
    }

    public static <T> LinkedList<T> createEmptySinglyLinkedList()
    {
        return new LinkedList<T>();
    }

    public static <T> DoublyLinkedList<T> createEmptyDoublyLinkedList()
    {
        return new DoublyLinkedList<T>();
    }

    public static <T> StackArray<T> createEmptyStackArray()
    {
        return new StackArray<T>();
    }

    public static <T> StackArray<T> createEmptyStackArray(int capacity)
    {
        return new StackArray<T>(capacity);
    }

    public static <T> LinkedListStack<T> createEmptyStackLinkedList()
    {
        return new LinkedListStack<T>();
    }

    public static <T> QueueArray<T> createEmptyQueueArray()
    {
        return new QueueArray<T>();
    }

    public static <T> QueueArray<T> createEmptyQueueArray(int capacity)
    {
        return new QueueArray<T>(capacity);
    }

    public static <T> LinkedListQueue<T> createEmptyQueueLinkedList()
    {
        return new LinkedListQueue<T>();
    }

    public static <T> CircularQueueArray<T> createEmptyCircularQueueArray()
    {
        return new CircularQueueArray<T>();
    }

    public static <T> CircularQueueArray<T> createEmptyCircularQueueArray(int capacity)
    {
        return new CircularQueueArray<T>(capacity);
    }

    public static <T> LinkedListCircularQueue<T> createEmptyCircularQueueLinkedList()
    {
        return new LinkedListCircularQueue<T>();
    }

    public static <T> LinkedListCircularQueue<T> createEmptyCircularQueueLinkedList(int capacity)
    {
        return new LinkedListCircularQueue<T>(capacity);
    }

    public static <T> LinkedList<T> createEmptyLinkedList()
    {
        return new LinkedList<T>();
    }


    public static <T extends Comparable<T>> Collection<? super T> bubbleSort(Collection<T> collection, IBinaryPredicate<T> predicate)
    {
        return BubbleSort.bubbleSort(collection, predicate);
    }

    public static <T extends Comparable<T>> T[] bubbleSort(T[] arr, IBinaryPredicate<T> predicate)
    {
        return BubbleSort.bubbleSort(arr, predicate);
    }

    public static <T> T[] heapSort(Comparable<T>[] arr)
    {
        return HeapSort.heapSort(arr);
    }

    public static int[] heapSort(int[] arr)
    {
        return HeapSort.heapSort(arr);
    }

    public static long[] heapSort(long[] arr)
    {
        return HeapSort.heapSort(arr);
    }

    public static byte[] heapSort(byte[] arr)
    {
        return HeapSort.heapSort(arr);
    }
}
