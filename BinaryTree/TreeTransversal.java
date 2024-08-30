package BinaryTree;


import java.util.*;


public class TreeTransversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);  // recursive  function calling buildTree because each node has itself two child node in binary tree
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // 1. Preorder traverse.

    public static void preorder(Node root) {
        if(root == null) { // base case
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left); // recursive function
        preorder(root.right);
    }
// 2. inorder traverse.


    public static void inorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);  // recursive function
        System.out.print(root.data+" ");
        inorder(root.right); // recursive function
    }

// 3. postorder traverse.

    public static void postorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    // level order traverse.
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();  // Here we use Queue of linkedList so that we can add node of tree in it.
                                                // and use the FIFO property of queue.
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {    //traverse
            Node curr = q.remove();
            if(curr == null) {
                System.out.println(); //  when we receive null then, next line  required ,so that print like level wise


                if(q.isEmpty()) {       //queue empty then , return
                    break;
                } else {
                    q.add(null); //
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }


    // Count of node in a tree


    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int leftNodes = countOfNodes(root.left); // recursive calling
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    // sum of nodes of a tree


    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // Height of a tree

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Diameter of a tree : approach 1 O(n^2)

    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }

        // we have three cases in which form diameter that is  through the root node , without root node only left subtree node, without root node only right node .
       // net diameter will be max diameter in above three cases .
        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }
    // diameter of tree approach 2 in  next file .

    static class TreeInfo {
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;

        }
    }
    public static TreeInfo diameter2(Node root) {  // not working yet let's after some time

        if(root==null){
           return  new TreeInfo(0,0);

        }

       TreeInfo left=diameter2(root.left);
       TreeInfo right= diameter2(root.right);
       int myheight=Math.max(left.ht,right.ht)+1;

       int diam1=left.diam;
       int diam2= right.diam;
       int diam3=left.ht=right.ht+1;
       int mydiam=Math.max(Math.max(diam1,diam2),diam3);

       TreeInfo myInfo= new TreeInfo(myheight,mydiam);
       return myInfo;
    }




    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // this in preorder
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);  // root node of tree

//        System.out.println("Preorder traverse:");
//        preorder(root);
//        System.out.println();
//        System.out.println("inorder traverse:");
//        inorder(root);
//        System.out.println();
//        System.out.println("Postorder traverse:");
//        postorder(root);
//        System.out.println();
//        System.out.println("Level order ");
//        levelOrder(root);
//       System.out.println("Number of nodes is: "+countOfNodes(root));
 //       System.out.println("Number of nodes is: "+sumOfNodes(root));
  //          System.out.println("Height of tree:"+height(root));

        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);

    }
}