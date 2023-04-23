package nuricanozturk.dev.algorithms.search;

import java.util.Collection;
import java.util.function.Predicate;

import static nuricanozturk.dev.algorithms.search.BinarySearch.*;
public final class SearchAlgorithms
{
    public static <T> int binarySearch(Collection<? extends Comparable<? super T>> collection, T key)
    {
        return BinarySearch.binarySearch(collection, key);
    }

    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate, T notFoundReturnValue)
    {
        return LinearSearch.linearSearch(collection, predicate, notFoundReturnValue);
    }

}
