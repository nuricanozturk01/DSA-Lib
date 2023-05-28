package nuricanozturk.dev.util.datastructures.linear.linkedlist;

public class DoublyLinkedListNode<T> {
    private T data;
    private DoublyLinkedListNode<T> prev;
    private DoublyLinkedListNode<T> next;

    public DoublyLinkedListNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyLinkedListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode<T> prev) {
        this.prev = prev;
    }

    public DoublyLinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode<T> next) {
        this.next = next;
    }
}