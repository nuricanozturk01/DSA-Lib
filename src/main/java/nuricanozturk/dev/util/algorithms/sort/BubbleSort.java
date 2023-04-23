/*----------------------------------------------------------------
	FILE		: BubbleSort.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	BubbleSort class is a sorting algorithm that time complexity is O(n^2)
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/

package nuricanozturk.dev.util.algorithms.sort;

import nuricanozturk.dev.util.functionalInterfaces.IBinaryPredicate;

import java.util.Collection;
import java.util.Collections;

final class BubbleSort
{
    private static <T> void swap(T[] arr, int j, int i)
    {
        var tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
    private BubbleSort(){}

    /**
     * @param arr give an array. Object must be comparable
     * @param predicate comparing options
     * @return given arr on first parameter
     */
    public static <T extends Comparable<T>> T[] bubbleSort(T[] arr, IBinaryPredicate<T> predicate)
    {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (predicate.test(arr[j], arr[j + 1]))
                    swap(arr, j, j + 1);

        return arr;
    }

    /**
     *
     * @param collection give any collection
     * @param predicate comparing option
     * @return collection on given first parameter
     */
    public static <T extends Comparable<T>> Collection<? super T> bubbleSort(Collection<T> collection, IBinaryPredicate<T> predicate)
    {
        var sortingList = new java.util.ArrayList<>(collection.stream().toList());

        for (int i = 0; i < sortingList.size() - 1; i++)
            for (int j = 0; j < sortingList.size() - 1; j++)
                if (predicate.test(sortingList.get(j), sortingList.get(j + 1)))
                    Collections.swap(sortingList, j, j + 1);

        return sortingList;
    }
}
