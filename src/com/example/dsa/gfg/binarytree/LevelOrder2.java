package com.example.dsa.gfg.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Modified level order
 * https://www.geeksforgeeks.org/level-order-traversal-line-line-set-3-using-one-queue/
 * but instead of next line,print $
 */
public class LevelOrder2 {

    void levelOrder2(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    System.out.print("$ ");
                }
            } else {
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                System.out.print(temp.data + " ");
            }
        }
        System.out.print("$ ");
    }
}
