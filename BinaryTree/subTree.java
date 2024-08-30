package BinaryTree;

import  java.util.*;

public class subTree {
    // question is give subtree is part of main tree or not
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }


    static class BinaryTree {
        static int idx = -1;
        public static TreeNode buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);  // recursive  function calling buildTree because each node has itself two child node in binary tree
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }



    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // this in preorder
       BinaryTree tree = new BinaryTree();

        TreeNode root = tree.buildTree(nodes);  // root node of tree








    }

}



