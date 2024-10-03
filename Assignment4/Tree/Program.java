package com.Assignment4.Tree;

import com.sun.source.tree.Tree;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Program {
    static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    static void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(21);
        root.left = new TreeNode(23);
        root.right = new TreeNode(27);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(64);



        System.out.println("In-Order Traversal:");
        inOrderTraversal(root);

        System.out.println("\n\nPre-Order Traversal:");
        preOrderTraversal(root);

        System.out.println("\n\nPost-Order Traversal:");
        postOrderTraversal(root);
    }
}
