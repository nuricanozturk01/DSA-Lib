/*----------------------------------------------------------------
	FILE		: SinglyLinkedListNode.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 17.10.2023
	BinaryTree class represent Binary Tree. Assistance was obtained from chatgpt
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.datastructures.nonlinear;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>>
{
    private static class Node<T>
    {
        private T data;
        private Node<T> left;
        private Node<T> right;

        Node(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }
    private final List<T> m_orderList;
    private Node<T> root;

    public static <T extends Comparable<T>>  BinaryTree<T> create()
    {
        return new BinaryTree<T>();
    }
    public BinaryTree()
    {
        root = null;
        m_orderList = new ArrayList<>();
    }
    public List<T> inOrderTraversal()
    {
        m_orderList.clear();
        inOrderTraversal(root);
        return m_orderList;
    }

    private void inOrderTraversal(Node<T> root)
    {
        if (root != null)
        {
            inOrderTraversal(root.left);
            m_orderList.add(root.data);
            inOrderTraversal(root.right);
        }
    }

    public List<T> preOrderTraversal()
    {
        m_orderList.clear();
        preOrderTraversal(root);
        return m_orderList;
    }

    private void preOrderTraversal(Node<T> root)
    {
        if (root != null)
        {
            m_orderList.add(root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public List<T> postOrderTraversal()
    {
        m_orderList.clear();
        postOrderTraversal(root);
        return m_orderList;
    }

    private void postOrderTraversal(Node<T> root)
    {
        if (root != null)
        {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            m_orderList.add(root.data);
        }
    }
    public void insert(T data)
    {
        root = insertRec(root, data);
    }

    private Node<T> insertRec(Node<T> root, T data)
    {
        if (root == null)
        {
            root = new Node<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0)
            root.left = insertRec(root.left, data);

        else if (data.compareTo(root.data) > 0)
            root.right = insertRec(root.right, data);

        return root;
    }

    public boolean search(T data)
    {
        return searchRec(root, data);
    }

    private boolean searchRec(Node<T> root, T data)
    {
        if (root == null)
            return false;

        if (data.compareTo(root.data) == 0)
            return true;

        else if (data.compareTo(root.data) < 0)
            return searchRec(root.left, data);

        else
            return searchRec(root.right, data);
    }



    public void remove(T data)
    {
        root = removeRec(root, data);
    }

    private Node<T> removeRec(Node<T> root, T data)
    {
        if (root == null)
            return root;
        if (data.compareTo(root.data) < 0)
            root.left = removeRec(root.left, data);

        else if (data.compareTo(root.data) > 0)
            root.right = removeRec(root.right, data);

        else
        {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);
            root.right = removeRec(root.right, root.data);
        }

        return root;
    }

    private T minValue(Node<T> node)
    {
        T minValue = node.data;
        while (node.left != null)
        {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }

}
