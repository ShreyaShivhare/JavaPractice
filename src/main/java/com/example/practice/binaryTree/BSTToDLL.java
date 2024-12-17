package com.example.practice.binaryTree;

public class BSTToDLL {
	
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

	    // Head of the doubly linked list
	    Node head;

	    // Previous node in the in-order traversal
	    Node prev;

	    // Function to convert BST to sorted doubly linked list
	    void convertToDLL(Node node) {
	        if (node == null) {
	            return;
	        }

	        // Recursively convert the left subtree
	        convertToDLL(node.left);

	        // Now convert this node
	        if (prev == null) {
	            // This node becomes the head of the doubly linked list
	            head = node;
	        } else {
	            // Adjust the pointers
	            node.left = prev;
	            prev.right = node;
	        }
	        prev = node;

	        // Recursively convert the right subtree
	        convertToDLL(node.right);
	    }

	    // Function to print the doubly linked list
	    void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.right;
	        }
	    }

	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();

	        // Creating a sample BST
	        tree.root = new Node(10);
	        tree.root.left = new Node(6);
	        tree.root.right = new Node(14);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(8);
	        tree.root.right.left = new Node(12);
	        tree.root.right.right = new Node(16);

	        // Convert the BST to a sorted doubly linked list
	        tree.convertToDLL(tree.root);

	        // Print the doubly linked list
	        System.out.println("Doubly linked list:");
	        tree.printList(tree.head);
	    }
	}


}
