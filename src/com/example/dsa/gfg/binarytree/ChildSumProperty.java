package com.example.dsa.gfg.binarytree;

/**
 * Given a binary tree, complete the function that returns true if the tree satisfies the following property:
 * For every node, data value must be equal to the sum of data values in left and right children. Consider data value as 0 for NULL child.  Also, leaves are considered to follow the property.
 *
 * Input Format:
 * The first line consists of T test cases. The first line of every test case consists of N, denoting the number of edges in the tree. The second and third line of every test case consists of N, nodes of the binary tree.
 *
 * Output Format:
 * Return 1 if the given tree satisfies the given property else return 0.
 * https://www.geeksforgeeks.org/check-for-children-sum-property-in-a-binary-tree/
 */
public class ChildSumProperty {
    int isSumProperty(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 1;
        int sum = 0;
        if (root.left != null)
            sum += root.left.data;
        if (root.right != null)
            sum += root.right.data;
        if (root.data == sum && isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1)
            return 1;
        return 0;
    }
}
