package com.example.dsa.gfg.binarysearchtree;

import com.example.dsa.gfg.binarytree.Node;

public class BST {

    /**
     * TC:O(h)
     * In a skewed tree h=n,so O(n) in case of a skewed tree
     *
     * @param root
     * @param key
     * @return
     */
    public Node search(Node root, int key) {
        if (root == null || root.data == key) return root;
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /**
     * TC:O(h)
     * In a skewed tree h=n,so O(n) in case of a skewed tree
     *
     * @param root
     * @param key
     * @return
     */
    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    /**
     * A node that is in between n1 & n2 can only be LCA.In BST,this condition is satisfied by a root.
     * So any node n is an LCA if n1 < n < n2.So if n is greater than both , move to left
     * if it is lesser than both, move to right
     *
     * @param root
     * @param n1
     * @param n2
     * @return
     */

    public Node LCA(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data > n1 && root.data > n2) {
            return LCA(root.left, n1, n2);
        } else if (root.data < n1 && root.data < n2) {
            return LCA(root.right, n1, n2);
        }
        return root;
    }

    /**
     * Keep traversing left
     *
     * @param root
     * @return
     */
    public int minValue(Node root) {
        if (root == null) return -1;
        if (root.left == null) return root.data;
        return minValue(root.left);
    }
}
