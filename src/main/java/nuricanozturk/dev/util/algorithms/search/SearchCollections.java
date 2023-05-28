/*----------------------------------------------------------------
	FILE		: SearchAlgorithms.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	SearchAlgorithms class represent facade pattern of search algorithms
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.algorithms.search;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class SearchCollections
{
    private SearchCollections() {}

    /*public static <T> T linearSearch(Collection<T> collection, T data, String msg)
    {
        return LinearSearch.linearSearch(collection, data, msg);
    }*/
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
