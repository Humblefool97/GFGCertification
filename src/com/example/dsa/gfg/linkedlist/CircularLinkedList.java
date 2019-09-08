package com.example.dsa.gfg.linkedlist;

/**
 * Created by rajeevranganathan
 */
public class CircularLinkedList {



    Node last;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertNodeAtEnd(int data) {
        //If LL is empty
        if (last == null) {
            Node temp = new Node(data);
            last = temp;
            last.next = last;
            return;
        }

        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        last = temp;

        return;
    }
}
