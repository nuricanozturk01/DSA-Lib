/*----------------------------------------------------------------
	FILE		: BinarySearch.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	BinarySearch class is a classic search algorithm that time complexity is O(log n)
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/

package nuricanozturk.dev.util.algorithms.search;

import java.util.Collection;

import java.util.ListIterator;

public final class BinarySearch
{
    private BinarySearch(){}
    public static <T> int binarySearch(Collection<? extends Comparable<? super T>> collection, T key)
    {
        var list = collection.stream().toList();

        int low = 0;
        int high = list.size()-1;

        ListIterator<? extends Comparable<? super T>> i = list.listIterator();

        while (low <= high)
        {
            int mid = (low + high) >>> 1;

            Comparable<? super T> midVal = get(i, mid);

            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;

            else if (cmp > 0)
                high = mid - 1;

            else
                return mid; // key found
        }

        return - (low + 1);  // key not found
    }

    private static <T> T get(ListIterator<? extends T> i, int index)
    {
        T obj = null;

        int pos = i.nextIndex();

        if (pos <= index)
        {
            do {
                obj = i.next();
            }
            while (pos++ < index);
        }
        else
        {
            do {
                obj = i.previous();
            }
            while (--pos > index);
        }

        return obj;
    }
}
