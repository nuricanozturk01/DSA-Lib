package nuricanozturk.dev.algorithms.search;

import java.util.Collection;
import java.util.function.Consumer;

public  interface ISearch
{
    <T> void linearSearch(Collection<T> collection, T data, Consumer<T> consumer, Runnable runnable);
}