/*----------------------------------------------------------------
	FILE		: SinglyLinkedListNode.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 17.10.2023
	MaxHeap class represent MaxHeap. Assistance was obtained from chatgpt
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.datastructures.nonlinear;

import java.util.ArrayList;

public class MaxHeap<T extends Comparable<T>> implements Heap <T>
{
    private final ArrayList<T> heap;

    public MaxHeap()
    {
        heap = new ArrayList<>();
    }

    public void insert(T data)
    {
        heap.add(data);

        int current = heap.size() - 1;
        int parent = (current - 1) / 2;

        while (current > 0 && heap.get(current).compareTo(heap.get(parent)) > 0)
        {
            var temp = heap.get(current);
            heap.set(current, heap.get(parent));
            heap.set(parent, temp);

            current = parent;
            parent = (current - 1) / 2;
        }
    }

    public T extractMax()
    {
        if (heap.isEmpty())
            return null;

        var max = heap.get(0);
        var lastElement = heap.remove(heap.size() - 1);

        if (!heap.isEmpty())
        {
            heap.set(0, lastElement);
            maxHeapify(0);
        }

        return max;
    }

    private void maxHeapify(int index)
    {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < heap.size() && heap.get(left).compareTo(heap.get(largest)) > 0)
            largest = left;

        if (right < heap.size() && heap.get(right).compareTo(heap.get(largest)) > 0)
            largest = right;

        if (largest != index)
        {
            var temp = heap.get(index);
            heap.set(index, heap.get(largest));
            heap.set(largest, temp);

            maxHeapify(largest);
        }
    }

    public boolean isEmpty()
    {
        return heap.isEmpty();
    }
}
