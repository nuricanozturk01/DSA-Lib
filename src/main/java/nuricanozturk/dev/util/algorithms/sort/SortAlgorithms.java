/*----------------------------------------------------------------
	FILE		: SortAlgorithms.java
	AUTHOR		: Nuri Can OZTURK, Dogan ARIK, Ahmet KOC
	LAST UPDATE	: 23.04.2023
	SortAlgorithms class include sort algorithms with facade pattern
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.algorithms.sort;

import nuricanozturk.dev.util.functionalInterfaces.IBinaryPredicate;

import java.util.Collection;

public final class SortAlgorithms
{
    private SortAlgorithms(){}
    public static <T extends Comparable<T>> Collection<? super T> bubbleSort(Collection<T> collection, IBinaryPredicate<T> predicate)
    {
        return BubbleSort.bubbleSort(collection, predicate);
    }
    public static <T extends Comparable<T>> T[] bubbleSort(T[] arr, IBinaryPredicate<T> predicate)
    {
        return BubbleSort.bubbleSort(arr, predicate);
    }

}
