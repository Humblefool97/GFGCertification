package com.example.dsa.gfg.binarytree;

/**
 * Displays Left,Right,Top & Bottom
 * view of a tree
 * Consider the Below Binary Tree:
 *      1
 *   /     \
 *  2       3
 * /  \    / \
 * 4    5  6   7
 * <p>
 * Left View of above Tree will be: 1, 2, 4
 * Right View of above Tree will be: 1, 3, 7
 * Top View of above Tree will be: 4, 2, 1, 3, 7
 * Bottom View of above Tree will be: 4, 5, 6, 7
 */
public class LRTBView {

    static int maxLevel = 0;

    private static void leftView(Node root, int level) {
        if (root == null)
            return;
        if (maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }
        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
    }

    private static void rightView(Node root, int level) {
        if (root == null)
            return;
        if (maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }
        leftView(root.right, level + 1);
        leftView(root.left, level + 1);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = new Node(1);
        bt.add(root, 2);
        bt.add(root, 3);
        bt.add(root, 4);
        bt.add(root, 5);
        bt.add(root, 6);
        bt.add(root, 7);
        // bt.levelOrder(root);
        //leftView(root, 1);
        maxLevel =0;
        rightView(root,1);
    }
}
