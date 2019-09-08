package com.example.dsa.gfg.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void preOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println(node.data);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public void add(Node root, int data) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left == null) {
                node.left = new Node(data);
                break;
            } else {
                queue.add(node.left);
            }
            if (node.right == null) {
                node.right = new Node(data);
                break;
            } else {
                queue.add(node.right);
            }
        }
    }


    public void deleteNode(Node root, int key) {
        //find the deepest node
        Node keyNode = null;
        Node tempNode = null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            tempNode = queue.poll();
            if (tempNode.data == key) {
                keyNode = tempNode;
            }
            if (tempNode.left != null)
                queue.add(tempNode.left);
            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
        int x = tempNode.data;
        //Delete the deepest node
        deleteDeepest(root, tempNode);
        keyNode.data = x;
    }

    public void deleteDeepest(Node root, Node deepNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node temp = null;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.left != null) {
                if (temp.left == deepNode) {
                    temp.left = null;
                    deepNode = null;
                    break;
                } else {
                    queue.add(temp.left);
                }
            }
            if (temp.right != null) {
                if (temp.right == deepNode) {
                    temp.right = null;
                    deepNode = null;
                    break;
                } else {
                    queue.add(temp.right);
                }
            }
        }
    }
}
