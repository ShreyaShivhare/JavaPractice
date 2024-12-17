package com.example.practice.binaryTree;

//Recursion used//O(n) // DFS approch
//Levelorder traversal // O(n) //BFS approach

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Traversal{
static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

static class BinaryTree{
    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
           return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
       
    }
}

public static void preOrder(Node root){
    if(root == null){
        return;
    }
    System.out.println(root.data+"");
    preOrder(root.left);
    preOrder(root.right);
}

public static void inOrder(Node root){
    if(root == null){
        return;
    }
    inOrder(root.left);
    System.out.println(root.data+"");
    inOrder(root.right);
}


    // Function to perform in-order traversal without recursion
//    void inOrderTraversal(Node root) {
//        if (root == null) {
//            return;
//        }
//
//        Stack<Node> stack = new Stack<>();
//        Node current = root;
//
//        while (current != null || !stack.isEmpty()) {
//            // Reach the leftmost node of the current node
//            while (current != null) {
//                stack.push(current);
//                current = current.left;
//            }
//
//            // Current must be null at this point
//            current = stack.pop();
//            System.out.print(current.data + " ");
//
//            // We have visited the node and its left subtree, now it's right subtree's turn
//            current = current.right;
//        }
//    }

public static void postOrder(Node root){
    if(root == null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.data+"");
}

public static void levelOrder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    
    while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.println(currNode.data+" ");
            if(currNode.left != null){
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);
            }

        }
    }
}
//O(n)
public static int countOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftNode = countOfNodes(root.left);
    int rightNode = countOfNodes(root.right);
    return leftNode + rightNode + 1; 
}

public static int sumOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int sumLeft = sumOfNodes(root.left);
    int sumRight = sumOfNodes(root.right);
    return sumLeft + sumRight + root.data;
}

//Diameter of Binary Tree
static class Info{
    int ht;
    int diam;

    public Info(int diam, int ht){
        this.diam = diam;
        this.ht = ht;
    }
}

public static Info diameter(Node root){
    if(root == null){
        return new Info(0,0);
    }

    Info left = diameter(root.left);
    Info right = diameter(root.right);

    int myHeight = Math.max(left.ht, right.ht) + 1;

    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht + right.ht + 1; //left.ht + right.ht(if root is not counted)
    int myDiam = Math.max(Math.max(diam1, diam2),diam3);
    return new Info(myDiam,myHeight);
}

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree =  new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
         preOrder(root);
         System.out.println("   ");
         inOrder(root);
         System.out.println("   ");
         postOrder(root);
         System.out.println("   ");
         levelOrder(root);

        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(diameter(root).diam);
        
      
    }
}