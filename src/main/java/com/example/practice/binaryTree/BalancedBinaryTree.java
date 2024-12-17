package com.example.practice.binaryTree;

public class BalancedBinaryTree {
	
	static class Node {
	    int data;
	    Node left, right;

	    public Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}

	static class BinaryTree {
	    Node root;

	    // Helper function to check the height of the tree
	    int height(Node node) {
	        if (node == null) {
	            return 0;
	        }
	        return Math.max(height(node.left), height(node.right)) + 1;
	    }

	    // Function to check if the tree is balanced
	    boolean isBalanced(Node node) {
	        if (node == null) {
	            return true;
	        }

	        int leftHeight = height(node.left);
	        int rightHeight = height(node.right);

	        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right)) {
	            return true;
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();

	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	       // tree.root.right.right = new Node(6);
	        tree.root.left.left.left = new Node(7);

	        if (tree.isBalanced(tree.root)) {
	            System.out.println("The tree is balanced");
	        } else {
	            System.out.println("The tree is not balanced");
	        }
	    }
	}

}
