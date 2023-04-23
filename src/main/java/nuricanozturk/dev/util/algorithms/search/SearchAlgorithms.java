package nuricanozturk.dev.util.algorithms.search;

import java.util.Collection;
import java.util.function.Predicate;

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
