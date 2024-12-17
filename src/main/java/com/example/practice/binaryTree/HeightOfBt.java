package com.example.practice.binaryTree;

public class HeightOfBt{
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}	
	}
	
	static class BinaryTree{
		Node root;
	
		// Function to calculate the height of the tree
	    int height(Node node) {
	        if (node == null) {
	            return -1; // Return -1 if you consider the height of an empty tree as -1
	        } else {
	            // Compute the height of each subtree
	            int leftHeight = height(node.left);
	            int rightHeight = height(node.right);
	
	            // Use the larger one
	            return Math.max(leftHeight, rightHeight) + 1;
	        }
	    }
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is " + tree.height(tree.root));
	}
}
