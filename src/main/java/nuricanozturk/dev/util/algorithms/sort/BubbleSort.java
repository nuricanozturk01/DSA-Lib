package nuricanozturk.dev.util.algorithms.sort;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BubbleSort
{
    public static <T extends Comparable<T>> List<T> bubbleSort(List<T> sortingList)
    {
        for (int i = 0; i < sortingList.size() - 1; i++)
            for (int j = 0; j < sortingList.size() - 1; j++)
                if (sortingList.get(j).compareTo(sortingList.get(j + 1)) > 0)
                    Collections.swap(sortingList, j, j + 1);

        return sortingList;
    }

    /*public static <T extends Comparable<T>> List<T> bubbleSort(List<T> sortingList, IPredicate<T> predicate)
    {
        for (int i = 0; i < sortingList.size() - 1; i++)
            for (int j = 0; j < sortingList.size() - 1; j++)
                if (predicate.test(sortingList.get(j), sortingList.get(j + 1)))
                    Collections.swap(sortingList, j, j + 1);

        return sortingList;
    }*/
    public static <T extends Comparable<T>> Collection<T> bubbleSort(Collection<T> collection, IPredicate<T> predicate)
    {
        var sortingList = new java.util.ArrayList<>(collection.stream().toList());

        for (int i = 0; i < sortingList.size() - 1; i++)
            for (int j = 0; j < sortingList.size() - 1; j++)
                if (predicate.test(sortingList.get(j), sortingList.get(j + 1)))
                    Collections.swap(sortingList, j, j + 1);

        return sortingList;
    }

}
