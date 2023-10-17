/*----------------------------------------------------------------
	FILE		: SinglyLinkedListNode.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 17.10.2023
	MinHeap class represent MinHeap. Assistance was obtained from chatgpt
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.datastructures.nonlinear;

import java.util.ArrayList;

public class MinHeap<T extends Comparable<T>> implements Heap<T>
{
    private final ArrayList<T> heap;
    public MinHeap()
    {
        heap = new ArrayList<>();
    }

    public void insert(T data)
    {
        heap.add(data);

        int current = heap.size() - 1;
        int parent = (current - 1) / 2;

        while (current > 0 && heap.get(current).compareTo(heap.get(parent)) < 0)
        {
            var temp = heap.get(current);
            heap.set(current, heap.get(parent));
            heap.set(parent, temp);

            current = parent;
            parent = (current - 1) / 2;
        }
    }

    public T extractMin()
    {
        if (heap.isEmpty())
            return null;

        var min = heap.get(0);
        var lastElement = heap.remove(heap.size() - 1);

        if (!heap.isEmpty())
        {
            heap.set(0, lastElement);
            minHeapify(0);
        }

        return min;
    }


    public boolean isEmpty()
    {
        return heap.isEmpty();
    }

    private void minHeapify(int index)
    {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;

        if (left < heap.size() && heap.get(left).compareTo(heap.get(smallest)) < 0)
            smallest = left;


        if (right < heap.size() && heap.get(right).compareTo(heap.get(smallest)) < 0)
            smallest = right;


        if (smallest != index)
        {
            var temp = heap.get(index);
            heap.set(index, heap.get(smallest));
            heap.set(smallest, temp);

            minHeapify(smallest);
        }
    }
}
