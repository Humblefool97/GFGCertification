package com.example.dsa.gfg.binarytree;

import java.util.ArrayList;

public class LCA {


    /**
     * Pre order approach
     *
     * @param root
     * @param n
     * @param path
     * @return
     */
    private boolean findPath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;
        path.add(root);
        if (root.data == n) {
            return true;
        }
        if (findPath(root.left, n, path))
            return true;
        if (findPath(root.right, n, path))
            return true;
        path.remove(path.size() - 1);
        return false;
    }

    private void findLCA(Node root, int n1, int n2) {
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();
        if (!findPath(root, n1, p1) || !findPath(root, n2, p2))
            System.out.println("One of the nodes not present");
        int i;
        for (i = 0; i < p1.size() - 1 && i < p2.size() - 1; i++) {
            if (p1.get(i).data != p1.get(i).data)
                break;
        }
        if (i < p1.size() && i < p2.size()) {
            System.out.println("LCA is: " + p1.get(i));
        }
    }
}
