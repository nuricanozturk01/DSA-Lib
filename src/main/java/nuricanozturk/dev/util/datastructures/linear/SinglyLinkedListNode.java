/*----------------------------------------------------------------
	FILE		: SinglyLinkedListNode.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	SinglyLinkedListNode class represent Singly LinkedList node
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.datastructures.linear;

class SinglyLinkedListNode<T>
{
    private T data;
    private SinglyLinkedListNode<T> next;

    public SinglyLinkedListNode(T data)
    {
        this.data = data;
        this.next = null;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public SinglyLinkedListNode<T> getNext()
    {
        return next;
    }

    public void setNext(SinglyLinkedListNode<T> next)
    {
        this.next = next;
    }
}


