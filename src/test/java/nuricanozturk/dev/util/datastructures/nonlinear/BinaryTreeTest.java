/**
 * FILE		    : LinkedListCircularQueueTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 17.10.2023
 * BinaryTreeTest class is test class for BinaryTree class. Created with ChatGPT
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.datastructures.nonlinear;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest
{
    @Test
    public void testInsertAndSearch()
    {
        var tree = new BinaryTree<Integer>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);

        assertTrue(tree.search(50));
        assertTrue(tree.search(30));
        assertTrue(tree.search(70));
        assertFalse(tree.search(40));
    }

    @Test
    public void testRemove()
    {
        var tree = new BinaryTree<Integer>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);

        assertTrue(tree.search(50));
        tree.remove(50);
        assertFalse(tree.search(50));

        assertTrue(tree.search(30));
        tree.remove(30);
        assertFalse(tree.search(30));
    }

    @Test
    public void testInOrderTraversal()
    {
        var tree = new BinaryTree<Integer>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        var expected = "[20, 30, 40, 50, 70]";
        assertEquals(expected, tree.inOrderTraversal().toString());
    }

    @Test
    public void testPreOrderTraversal()
    {
        var tree = new BinaryTree<Integer>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        var expected = "[50, 30, 20, 40, 70]";
        assertEquals(expected, tree.preOrderTraversal().toString());
    }

    @Test
    public void testPostOrderTraversal()
    {
        var tree = new BinaryTree<Integer>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        var expected = "[20, 40, 30, 70, 50]";
        assertEquals(expected, tree.postOrderTraversal().toString());
    }


    @Test
    public void testInsertAndSearchNames()
    {
        var tree = new BinaryTree<String>();
        tree.insert("nuri");
        tree.insert("can");
        tree.insert("ozturk");

        assertTrue(tree.search("nuri"));
        assertTrue(tree.search("can"));
        assertTrue(tree.search("ozturk"));
        assertFalse(tree.search("ahmet")); // "ahmet" eklenmediği için false olmalı
    }

    @Test
    public void testRemoveNames()
    {
        var tree = new BinaryTree<String>();
        tree.insert("nuri");
        tree.insert("can");
        tree.insert("ozturk");

        assertTrue(tree.search("nuri"));
        tree.remove("nuri");
        assertFalse(tree.search("nuri"));

        assertTrue(tree.search("can"));
        tree.remove("can");
        assertFalse(tree.search("can"));
    }

    @Test
    public void testInOrderTraversalNames()
    {
        var tree = new BinaryTree<String>();
        tree.insert("nuri");
        tree.insert("can");
        tree.insert("ozturk");

        var expected = "[can, nuri, ozturk]";
        assertEquals(expected, tree.inOrderTraversal().toString());
    }

    @Test
    public void testPreOrderTraversalNames()
    {
        var tree = new BinaryTree<String>();
        tree.insert("nuri");
        tree.insert("can");
        tree.insert("ozturk");

        var expected = "[nuri, can, ozturk]";
        assertEquals(expected, tree.preOrderTraversal().toString());
    }

    @Test
    public void testPostOrderTraversalNames()
    {
        var tree = new BinaryTree<String>();
        tree.insert("nuri");
        tree.insert("can");
        tree.insert("ozturk");

        var expected = "[can, ozturk, nuri]";
        assertEquals(expected, tree.postOrderTraversal().toString());
    }
}