package com.example.practice.Arrays.LinkedList;

    

class StackLinkedList {
	public class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
    private Node head;

    public void StackLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int poppedData = head.data;
            head = head.next;
            return poppedData;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
	}}
//    public static void main(String[] args) {
//        StackLinkedList stack = new StackLinkedList();
//        stack.push(1);
//        stack.push(2);
//        System.out.println(stack.pop());  // Output: 2
//        System.out.println(stack.peek());  // Output: 1
//        System.out.println(stack.size());  // Output: 1
//    }

    
