package com.example.practice.Arrays.LinkedList;

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSort {
    Node head;

    // Function to merge two sorted linked lists
    Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    // Function to split the linked list into two halves
    Node getMiddle(Node h) {
        if (h == null) return h;

        Node fast = h.next;
        Node slow = h;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    // Function to sort the linked list using merge sort
    Node mergeSort(Node h) {
        if (h == null || h.next == null) return h;

        Node middle = getMiddle(h);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    // Function to insert a new node at the front of the list
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Function to print the linked list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
       
        LinkedList li = new LinkedList();

        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);

//        System.out.println("Linked List without sorting:");
//        li.printList(li.head);
//
//        li.head = li.mergeSort(li.head);
//
//        System.out.println("\nSorted Linked List:");
//        li.printList(li.head);
    }
}// public static class Node{
//     int val;
//     Node next;

//     Node(int val){
//        this.val = val;
//        this.next = null;
//     }
// }
// public class MergeSort {
    
//     public Node mergeTwoLists(Node A, Node B){
//         if(A==null){
//             return B;
//         }
//         if(B==null){
//             return A;
//         }

//         while(A!=null && B!=null){
//              if(A.val <= B.val){
//                 A.next = mergeTwoLists(A.next, B);
//                 return A;
//              }else{
//                 B.next = mergeTwoLists(A, B.next);
//                 return B;
//              }
//             return A;
//         }
//     }    
// }
