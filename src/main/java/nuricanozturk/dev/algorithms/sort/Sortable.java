package nuricanozturk.dev.algorithms.sort;

import java.util.List;

public class Sortable <T>
{
    protected List<T> sortingList;
    protected T[] sortingArray;

    public Sortable(List<T> sortingList, T[] sortingArray)
    {
        this.sortingList = sortingList;
        this.sortingArray = sortingArray;
    }
}
