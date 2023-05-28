/*----------------------------------------------------------------
	FILE		: DataStructureCollections.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 24.04.2023
	DataStructureCollections class has factory methods about Data Structures.
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.datastructures;

import nuricanozturk.dev.util.datastructures.linear.linkedlist.LinkedList;

public final class DataStructureCollections
{
    //...
    private DataStructureCollections() {}

    public static <T> LinkedList<T> createEmptySinglyLinkedList()
    {
        return new LinkedList<T>();
    }

    public static <T> void swapLinkedList(LinkedList<T> linkedList, int i, int j)
    {
        throw new UnsupportedOperationException("TODO NOT IMPLEMENTED YET");
    }


}
