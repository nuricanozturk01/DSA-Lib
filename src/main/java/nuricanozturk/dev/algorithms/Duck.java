package nuricanozturk.dev.algorithms;

import nuricanozturk.dev.algorithms.search.BinarySearch;
import nuricanozturk.dev.algorithms.search.LinearSearch;
import nuricanozturk.dev.algorithms.search.SearchAlgorithms;
import nuricanozturk.dev.algorithms.sort.BubbleSort;

import java.util.*;
import java.util.function.Predicate;

import static nuricanozturk.dev.algorithms.search.SearchAlgorithms.binarySearch;
import static nuricanozturk.dev.algorithms.sort.BubbleSort.bubbleSort;

public class Duck implements Comparable<Duck>
{
    public long id;

    public String name;


    public Duck(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Duck o)
    {
        if (id > o.id)
            return 1;
        else if (id < o.id)
            return -1;
        return 0;
    }

    @Override
    public String toString()
    {
        return "Duck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args)
    {
        var d1 = new Duck(6,"can");
        var d2 = new Duck(8,"beste");
        var d3 = new Duck(1,"sevval");
        var d4 = new Duck(3,"ayse");

        var duckList = new LinkedList<Duck>();
        duckList.add(d1);

        duckList.add(d3);
        duckList.add(d4);

        var item = binarySearch(bubbleSort(duckList), d1);

        System.out.println(item);

        duckList.forEach(System.out::println);
    }

    private static boolean predicateCondition(Duck duck)
    {
        return duck.name.equals("beste");
    }

    public static void run()
    {
        System.out.println("");
    }
}
