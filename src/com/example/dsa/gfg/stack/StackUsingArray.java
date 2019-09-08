package com.example.dsa.gfg.stack;

public class StackUsingArray {

    static class MyStack {
        private final int MAX = 1000;
        private int a[] = new int[MAX];
        private int top = -1;

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean push(int element) {
            if (top >= (MAX - 1)) {
                System.out.println("Stack overflow!!");
                return false;
            } else {
                a[++top] = element;
                return true;
            }
        }

        public int pop() throws IllegalStateException {
            if (top == -1) {
                System.out.println("Empty stack1!");
                throw new IllegalStateException("Cannot pop as Stack is Empty!");
            }
            return a[top--];
        }
    }

    public static void main(String[] args) {
        MyStack stack  = new MyStack();

    }
}
