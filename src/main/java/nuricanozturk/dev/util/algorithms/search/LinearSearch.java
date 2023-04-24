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

final class LinearSearch
{
    private LinearSearch() {}

    /**
     * @param collection represent any collection
     * @param data searched key
     * @param msg if key is not present, throw RuntimeException and return with your message
     * @return given collection on firs parameter
     */
    public static <T> T linearSearch(Collection<T> collection, T data, String msg)
    {
        return collection.stream().filter(cd -> cd.equals(data)).findFirst().orElseThrow(() -> new NotFoundException(msg));
    }

    /**
     *
     * @param collection represent any collection
     * @param data searched key
     * @param consumer if key is present, you can do something with consumer
     * @param runnable if key is not present, you can decide the flow
     * @implNote not return value
     */
    public static <T> void linearSearch(Collection<T> collection, T data, Consumer<T> consumer, Runnable runnable)
    {
        collection.stream().filter(cd -> cd.equals(data)).findFirst().ifPresentOrElse(consumer, runnable);
    }

    /**
     *
     * @param collection represent any collection
     * @param data searched key
     * @param notFoundReturnValue if key is not present, return the object within your decide.
     * @return any collection given first parameter
     */
    public static <T> T linearSearch(Collection<T> collection, T data, T notFoundReturnValue)
    {
        return collection.stream().filter(cd -> cd.equals(data)).findFirst().orElse(notFoundReturnValue);
    }

    /**
     *
     * @param collection represent any collection
     * @param predicate if you want to specific search, use it
     * @param msg if key is not present, throw RuntimeException and return with your message
     * @return any collection given first parameter
     */
    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate, String msg)
    {
        return collection.stream().filter(predicate).findFirst().orElseThrow(() -> new NotFoundException(msg));
    }

    /**
     *
     * @param collection represent any collection
     * @param predicate if you want to specific search, use it
     * @param consumer consumer if key is present, you can do something with consumer
     * @param runnable if key is not present, you can decide the flow
     * @implNote no return value
     */
    public static <T> void linearSearch(Collection<T> collection, Predicate<T> predicate, Consumer<T> consumer, Runnable runnable)
    {
        collection.stream().filter(predicate).findFirst().ifPresentOrElse(consumer, runnable);
    }

    /**
     *
     * @param collection represent any collection
     * @param predicate if you want to specific search, use it
     * @param notFoundReturnValue if key is not present, your message without any exception
     * @return any collection given first parameter
     */
    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate, T notFoundReturnValue)
    {
        return  collection.stream().filter(predicate).findFirst().orElse(notFoundReturnValue);
    }

    /**
     *
     * @param collection represent any collection
     * @param predicate if you want to specific search, use it
     * @return if found, return the present value else, return the last value on collection
     */
    public static <T> T linearSearch(Collection<T> collection, Predicate<T> predicate)
    {
        return collection.stream().filter(predicate).findFirst()
                .orElse(collection.stream().toList().get(collection.size() - 1));
    }
}
