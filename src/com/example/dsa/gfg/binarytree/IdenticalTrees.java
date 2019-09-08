package com.example.dsa.gfg.binarytree;

public class IdenticalTrees {
    boolean isIdentical(Node root1,Node root2){
        if(root1 == null && root2 == null)
            return true;
        return (root1!=null && root2!=null && root1.data == root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right));
    }
}
