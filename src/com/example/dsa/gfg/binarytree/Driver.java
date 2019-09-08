package com.example.dsa.gfg.binarytree;

public class Driver {

    public static void main(String[] args) {
        // Create the following Binary Tree
        //          10
        //         /  \
        //        11   9
        //       /      \
        //      7        8
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        BinaryTree bTree = new BinaryTree();
        bTree.inOrder(root);
        bTree.add(root, 12);
        System.out.println("After adding");
        bTree.inOrder(root);
    }
}
