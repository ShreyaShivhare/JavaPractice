package com.example.practice.Sorting;

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int x){
		val = x;
		next = null;
	}
}

public class LinkedListImplementation {
	// Function to sort the linked list using Merge Sort
	public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
     // Split the list into two halves
        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next = null;

        // Recursively sort the two halves
        ListNode left = sortList(head);
        ListNode right = sortList(nextOfMiddle);

        // Merge the sorted halves
        return merge(left, right);
	}
	
	// Function to get the middle of the linked list
    private ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function to merge two sorted linked lists
    private ListNode merge(ListNode left, ListNode right) {
        ListNode result = null;
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.val <= right.val) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    
	public  void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	 public static void main(String[] args) {
		 LinkedListImplementation list = new LinkedListImplementation();
	        ListNode head = new ListNode(4);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(1);
	        head.next.next.next = new ListNode(3);

	        System.out.println("Original List:");
	        list.printList(head);

	        head = list.sortList(head);

	        System.out.println("Sorted List:");
	        list.printList(head);
    }
}

