package com.example.practice.binaryTree;

import java.util.*;
import java.util.Queue;

public class SerializeAndDeserialize {

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

	    // Serialize the tree into a string
	    public String serialize(Node root) {
	        StringBuilder sb = new StringBuilder();
	        serializeHelper(root, sb);
	        return sb.toString();
	    }

	    public void serializeHelper(Node node, StringBuilder sb) {
	        if (node == null) {
	            sb.append("#,");
	            return;
	        }
	        sb.append(node.data).append(",");
	        serializeHelper(node.left, sb);
	        serializeHelper(node.right, sb);
	    }

	    // Deserialize the string back into a tree
	    public Node deserialize(String data) {
	        if (data == null || data.isEmpty()) {
	            return null;
	        }
	        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
	        return deserializeHelper(nodes);
	    }

	    public Node deserializeHelper(Queue<String> nodes) {
	        String val = nodes.poll();
	        if (val.equals("#")) {
	            return null;
	        }
	        Node node = new Node(Integer.parseInt(val));
	        node.left = deserializeHelper(nodes);
	        node.right = deserializeHelper(nodes);
	        return node;
	    }

	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();

	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.right.left = new Node(4);
	        tree.root.right.right = new Node(5);

	        String serializedTree = tree.serialize(tree.root);
	        System.out.println("Serialized tree: " + serializedTree);

	        Node deserializedTree = tree.deserialize(serializedTree);
	        System.out.println("Tree deserialized successfully.");
	    }
	}

}
