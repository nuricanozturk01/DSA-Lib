package nuricanozturk.dev.util.algorithms.sort;

import java.util.function.Function;

public final class InsertionSort
{
    private InsertionSort()
    {
    }

    public static <T extends Comparable<T>> T[] sort(T[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
        return arr;
    }

    public static long[] sort(long[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            long key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
        return arr;
    }

    public static double[] sort(double[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
        return arr;
    }

    public static char[] sort(char[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            char key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
        return arr;
    }

    public static byte[] sort(byte[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            byte key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
        return arr;
    }

    public static <T> T[] sort(T[] arr, Function<T[], T[]> sortingAlgorithm) {
        return sortingAlgorithm.apply(arr);
    }

    public static int[] sort(int[] arr, Function<int[], int[]> sortingAlgorithm) {
        return sortingAlgorithm.apply(arr);
    }
}

