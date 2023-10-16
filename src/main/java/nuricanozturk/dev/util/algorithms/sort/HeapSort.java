/*----------------------------------------------------------------
	FILE		: BubbleSort.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 17.10.2023
	HeapSort class is a sorting algorithm that time complexity is O(n log n)
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.algorithms.sort;

public class HeapSort<T extends Comparable<T>>
{

    public static <T> T[] heapSort(Comparable<T>[] arr)
    {
        int arrayLength = arr.length;

        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrayLength, i);

        for (int i = arrayLength - 1; i > 0; i--)
        {
            var temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

        return (T[]) arr;
    }

    @SuppressWarnings("all")
    private static void heapify(Comparable[] arr, int arrayLength, int rootIndex)
    {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < arrayLength && arr[leftChild].compareTo(arr[largest]) > 0)
            largest = leftChild;

        if (rightChild < arrayLength && arr[rightChild].compareTo(arr[largest]) > 0)
            largest = rightChild;

        if (largest != rootIndex)
        {
            Comparable swap = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = swap;
            heapify(arr, arrayLength, largest);
        }
    }

    public static int[] heapSort(int[] arr)
    {
        int arrayLength = arr.length;

        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrayLength, i);

        for (int i = arrayLength - 1; i > 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

        return arr;
    }

    private static void heapify(int[] arr, int arrayLength, int rootIndex)
    {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < arrayLength && arr[leftChild] > arr[largest])
            largest = leftChild;

        if (rightChild < arrayLength && arr[rightChild] > arr[largest])
            largest = rightChild;

        if (largest != rootIndex)
        {
            int swap = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = swap;
            heapify(arr, arrayLength, largest);
        }
    }


    public static long[] heapSort(long[] arr)
    {
        var arrayLength = arr.length;

        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrayLength, i);

        for (int i = arrayLength - 1; i > 0; i--)
        {
            var temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

        return arr;
    }

    private static void heapify(long[] arr, int arrayLength, int rootIndex)
    {
        var largest = rootIndex;
        var leftChild = 2 * rootIndex + 1;
        var rightChild = 2 * rootIndex + 2;

        if (leftChild < arrayLength && arr[leftChild] > arr[largest])
            largest = leftChild;

        if (rightChild < arrayLength && arr[rightChild] > arr[largest])
            largest = rightChild;

        if (largest != rootIndex)
        {
            var swap = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = swap;
            heapify(arr, arrayLength, largest);
        }
    }


    public static void heapSort(double[] arr)
    {
        var arrayLength = arr.length;

        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrayLength, i);

        for (int i = arrayLength - 1; i > 0; i--)
        {
            var temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(double[] arr, int arrayLength, int rootIndex)
    {
        var largest = rootIndex;
        var leftChild = 2 * rootIndex + 1;
        var rightChild = 2 * rootIndex + 2;

        if (leftChild < arrayLength && arr[leftChild] > arr[largest])
            largest = leftChild;

        if (rightChild < arrayLength && arr[rightChild] > arr[largest])
            largest = rightChild;

        if (largest != rootIndex)
        {
            var swap = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = swap;
            heapify(arr, arrayLength, largest);
        }
    }


    public static void heapSort(char[] arr)
    {
        var arrayLength = arr.length;

        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrayLength, i);

        for (int i = arrayLength - 1; i > 0; i--)
        {
            var temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(char[] arr, int arrayLength, int rootIndex)
    {
        var largest = rootIndex;
        var leftChild = 2 * rootIndex + 1;
        var rightChild = 2 * rootIndex + 2;

        if (leftChild < arrayLength && arr[leftChild] > arr[largest])
            largest = leftChild;

        if (rightChild < arrayLength && arr[rightChild] > arr[largest])
            largest = rightChild;

        if (largest != rootIndex)
        {
            var swap = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = swap;
            heapify(arr, arrayLength, largest);
        }
    }


    public static byte[] heapSort(byte[] arr)
    {
        var arrayLength = arr.length;

        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrayLength, i);

        for (int i = arrayLength - 1; i > 0; i--)
        {
            var temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

        return arr;
    }

    private static void heapify(byte[] arr, int arrayLength, int rootIndex)
    {
        var largest = rootIndex;
        var leftChild = 2 * rootIndex + 1;
        var rightChild = 2 * rootIndex + 2;

        if (leftChild < arrayLength && arr[leftChild] > arr[largest])
            largest = leftChild;

        if (rightChild < arrayLength && arr[rightChild] > arr[largest])
            largest = rightChild;

        if (largest != rootIndex)
        {
            var swap = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = swap;
            heapify(arr, arrayLength, largest);
        }
    }
}

