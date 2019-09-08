package com.example.dsa.gfg.stack;

public class StackUsingLinkedList {

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int a) {
            data = a;
            next = null;
        }
    }

    static class MyStack {
        private int items = 0;
        private final int MAX = 1000;
        private StackNode headNode = null;

        void push(int a) throws IllegalStateException {
            if (items >= MAX) {
                throw new IllegalStateException("Stack overflow!!");
            }

            if (headNode == null) {
                headNode = new StackNode(a);
                items++;
                return;
            }

            StackNode newNode = new StackNode(a);
            newNode.next = headNode;
            headNode = newNode;
            items++;
        }

        int pop() throws IllegalStateException {
            if (items == 0) {
                throw new IllegalStateException("Stack Empty!!");
            }

            StackNode tempNode = headNode;
            headNode = tempNode.next;
            int data =  tempNode.data;

            return data;
        }
    }
}
