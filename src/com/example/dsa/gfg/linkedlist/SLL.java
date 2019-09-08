package com.example.dsa.gfg.linkedlist;

/**
 * Created by rajeevranganathan
 */
public class SLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    /**
     * TC:O(1)
     *
     * @param data
     */
    public void pushFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode = head;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void pushAfter(int data, Node prevNode) {
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    /**
     * TC O(N)
     * @param data
     */
    public void pushAtEnd(int data) {
        Node newNode = new Node(data);
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }
}
