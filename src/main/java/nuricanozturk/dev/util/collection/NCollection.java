/*----------------------------------------------------------------
	FILE		: DataStructureCollections.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 16.10.2023
	Collection class has factory methods about All algorithms and data structures.
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.collection;

import nuricanozturk.dev.util.algorithms.search.BinarySearch;
import nuricanozturk.dev.util.algorithms.search.LinearSearch;
import nuricanozturk.dev.util.algorithms.sort.BubbleSort;
import nuricanozturk.dev.util.algorithms.sort.HeapSort;
import nuricanozturk.dev.util.datastructures.linear.array.CircularQueueArray;
import nuricanozturk.dev.util.datastructures.linear.array.QueueArray;
import nuricanozturk.dev.util.datastructures.linear.array.StackArray;
import nuricanozturk.dev.util.datastructures.linear.linkedlist.*;
import nuricanozturk.dev.util.datastructures.nonlinear.BinaryTree;
import nuricanozturk.dev.util.datastructures.nonlinear.Heap;
import nuricanozturk.dev.util.datastructures.nonlinear.MaxHeap;
import nuricanozturk.dev.util.datastructures.nonlinear.MinHeap;
import nuricanozturk.dev.util.functionalInterfaces.IBinaryPredicate;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static nuricanozturk.dev.util.datastructures.nonlinear.BinaryTree.create;

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

    public static <T extends Comparable<T>> BinaryTree<T> createEmptyBinaryTree()
    {
        return create();
    }

    public static <T extends Comparable<T>> Heap<T> createEmptyMinHeap()
    {
        return new MinHeap<>();
    }

    public static <T extends Comparable<T>> Heap<T> createEmptyMaxHeap()
    {
        return new MaxHeap<>();
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

    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate, T notFoundReturnValue)
    {
        return LinearSearch.linearSearch(collection, predicate, notFoundReturnValue);
    }

    public static <T> void linearSearch(Collection<T> collection, T data, Consumer<T> consumer, Runnable runnable)
    {
        LinearSearch.linearSearch(collection, data, consumer, runnable);
    }

    public static <T> T linearSearch(Collection<T> collection, T data, T notFoundReturnValue)
    {
        return LinearSearch.linearSearch(collection, data, notFoundReturnValue);
    }

    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate, String msg)
    {
        return LinearSearch.linearSearch(collection, predicate, msg);
    }

    public static <T> void linearSearch(Collection<T> collection, Predicate<T> predicate, Consumer<T> consumer, Runnable runnable)
    {
        LinearSearch.linearSearch(collection, predicate, consumer, runnable);
    }

    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate)
    {
        return LinearSearch.linearSearch(collection, predicate);
    }

    public static <T> int binarySearch(Collection<? extends Comparable<? super T>> collection, T key)
    {
        return BinarySearch.binarySearch(collection, key);
    }
}
