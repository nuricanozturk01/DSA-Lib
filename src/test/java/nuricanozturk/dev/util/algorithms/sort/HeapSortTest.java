package nuricanozturk.dev.util.algorithms.sort;

import org.junit.jupiter.api.Test;

import static nuricanozturk.dev.util.algorithms.sort.HeapSort.heapSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest
{

    @Test
    public void testHeapSortWithNumber()
    {
        var intArray = new int[]{5, 3, 9, 7, 2, 8, 4};
        heapSort(intArray);
        var expectedIntArray = new int[] {2, 3, 4, 5, 7, 8, 9};
        assertArrayEquals(expectedIntArray, intArray);
    }

    @Test
    public void testHeapSortWithDouble() {
        Double[] doubleArray = {5.3, 3.1, 9.0, 7.5, 2.7, 8.2, 4.4};
        HeapSort.heapSort(doubleArray);
        Double[] expectedDoubleArray = {2.7, 3.1, 4.4, 5.3, 7.5, 8.2, 9.0};
        assertArrayEquals(expectedDoubleArray, doubleArray);
    }


    @Test
    public void testHeapSortWithString()
    {
        var stringArray = new String[]{"banana", "apple", "fig", "date", "cherry"};
        heapSort(stringArray);
        var expectedStringArray = new String[] {"apple", "banana", "cherry", "date", "fig"};
        assertArrayEquals(expectedStringArray, stringArray);
    }
}
