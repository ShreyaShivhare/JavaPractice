package com.example.practice.binaryTree;

public class LCAinBT {

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

	    // Function to find the LCA of two given nodes p and q
	    Node findLCA(Node node, Node p, Node q) {
	        if (node == null) {
	            return null;
	        }

	        // If either p or q is the root, then the root is LCA
	        if (node == p || node == q) {
	            return node;
	        }

	        // Look for keys in left and right subtrees
	        Node leftLCA = findLCA(node.left, p, q);
	        Node rightLCA = findLCA(node.right, p, q);

	        // If both of the above calls return non-null, then one key
	        // is present in one subtree and the other is present in the other,
	        // so this node is the LCA
	        if (leftLCA != null && rightLCA != null) {
	            return node;
	        }

	        // Otherwise check if left subtree or right subtree is LCA
	        return (leftLCA != null) ? leftLCA : rightLCA;
	    }

	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();

	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);

	        Node p = tree.root.left.left;  // Node 4
	        Node q = tree.root.right.right;  // Node 7

	        Node lca = tree.findLCA(tree.root, p, q);

	        if (lca != null) {
	            System.out.println("LCA of " + p.data + " and " + q.data + " is " + lca.data);
	        } else {
	            System.out.println("LCA does not exist");
	        }
	    }
	}

}
