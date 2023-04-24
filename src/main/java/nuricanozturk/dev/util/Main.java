package nuricanozturk.dev.util;

import nuricanozturk.dev.util.datastructures.DataStructureCollections;
public class Main
{
    public static void main(String[] args)
    {
        var ll = DataStructureCollections.<String> createEmptySinglyLinkedList();

        ll.insertFirst("nuri");
        ll.insertFirst("can");
        ll.insertFirst("a");
        ll.insertFirst("b");
        ll.insertFirst("c");
        ll.insertFirst("d");
        ll.insertFirst("e");

        ll.forEach(ptr -> System.out.printf("%s ", ptr));
        System.out.println();

        DataStructureCollections.swapLinkedList(ll, 1, 2);

        ll.forEach(ptr -> System.out.printf("%s ", ptr));
    }
}