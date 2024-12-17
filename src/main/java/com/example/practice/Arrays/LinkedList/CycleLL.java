package com.example.practice.Arrays.LinkedList;

import java.util.List;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

//Detect a cycle in LinkedList
public class CycleLL {
    public boolean reverse(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        if(head == null || head.next == null){
            return false;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }
        }   
            return false;

    }
}
