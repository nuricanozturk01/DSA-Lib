/*----------------------------------------------------------------
	FILE		: LinearSearch.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	LinearSearch class is a classic search algorithm that time complexity is O(n)
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/

package nuricanozturk.dev.util.algorithms.search;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class LinearSearch <T>
{
    private LinearSearch(){}
    public static <T> T linearSearch(Collection<T> collection, T data, String msg)
    {
        return collection.stream().filter(cd -> cd.equals(data)).findFirst().orElseThrow(() -> new NotFoundException(msg));
    }

    public static <T> void linearSearch(Collection<T> collection, T data, Consumer<T> consumer, Runnable runnable)
    {
        collection.stream().filter(cd -> cd.equals(data)).findFirst().ifPresentOrElse(consumer, runnable);
    }

    public static <T> T linearSearch(Collection<T> collection, T data, T notFoundReturnValue)
    {
        return collection.stream().filter(cd -> cd.equals(data)).findFirst().orElse(notFoundReturnValue);
    }

    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate, String msg)
    {
        return collection.stream().filter(predicate).findFirst().orElseThrow(() -> new NotFoundException(msg));
    }

    public static <T> void linearSearch(Collection<T> collection, Predicate<T> predicate, Consumer<T> consumer, Runnable runnable)
    {
        collection.stream().filter(predicate).findFirst().ifPresentOrElse(consumer, runnable);
    }

    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate, T notFoundReturnValue)
    {
        return  collection.stream().filter(predicate).findFirst().orElse(notFoundReturnValue);
    }

    /**
     * Returns {@code object} if this list contains element.
     *
     * @return {@code last object} if this list not contains element
     */
    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate)
    {
        return collection.stream().filter(predicate).findFirst()
                .orElse(collection.stream().toList().get(collection.size() - 1));
    }
}
