package com.example.dsa.gfg.linkedlist;

/**
 * Created by rajeevranganathan
 */
public class Palindrome {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    boolean isPalindrome(Node head) {
        if (head == null)
            return false;
        //Get the length
        int length = getLength(head);
        if (length == 1)
            return true;

        int mid = length / 2 - 1; //Reverse second half including mid
        Node temp = head;
        while (mid > 0) {
            temp = temp.next;
            mid--;
        }

        Node secondHead = getReversedHeadNode(temp.next);
        temp.next = null;

        Node firstHead = head;
        while (firstHead != null && secondHead != null) {
            if (firstHead.data != secondHead.data)
                return false;

            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }

        return true;
    }

    private Node getReversedHeadNode(Node node) {
        Node current = node;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    private int getLength(Node node) {
        int count = 0;
        Node temp = node;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
