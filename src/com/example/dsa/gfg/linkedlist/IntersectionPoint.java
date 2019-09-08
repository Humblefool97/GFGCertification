package com.example.dsa.gfg.linkedlist;


class IntersectionPoint {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class LinkedList {
        Node head;  // head of list
    }

    int intersectPoint(Node headA, Node headB) {
        int l1 = length(headA);
        int l2 = length(headB);

        Node start = l1 > l2 ? headA : headB;
        Node other = l1 > l2 ? headB : headA;

        int diff = Math.abs(l1 - l2);

        while (diff != 0) {
            start = start.next;
            diff--;
        }

        while (start != null && other != null && start.next != other.next) {
            start = start.next;
            other = other.next;
        }

        if (start == null || other == null || start.next != null || other.next != null)
            return -1;

        return start.next.data;

    }

    private int length(Node node) {
        if (node == null)
            return 0;

        int count = 1;
        Node temp = node;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }
}