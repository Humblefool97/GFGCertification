package com.example.dsa.gfg.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Stacks can be used to remove duplicates characters from a string that are stacked next to each other. For example, we take the string aabbccccc and convert it into abc. We can push the first character into a stack and skip if the top of the stack is equal to current character.
 * <p>
 * You are given a string str. You need to remove the consecutive duplicates.
 * <p>
 * Input:
 * The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing string str.
 * <p>
 * Output:
 * For each testcase, in a new line, print the modified string.
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 1 <= |str| <= 103
 * <p>
 * Examples:
 * Input:
 * 2
 * aaaaaabaabccccccc
 * xxyzz
 * Output:
 * ababc
 * xyz
 */
public class RemoveDuplicates {

    public static void main(String[] args) throws IOException {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int tc =  Integer.parseInt(in.readLine());
        for (int t = 1; t <= tc; t++) {
            String input = in.readLine();
            removeDup(input, input.length());
        }
    }

    private static void removeDup(String s, int n) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            Character ch = s.charAt(i);
            if (!myStack.isEmpty() && myStack.peek().equals(ch)) {
                //do nothing
            } else {
                myStack.push(ch);
            }
        }
        printStack(myStack);
        System.out.println();
    }


    private static void printStack(Stack<Character> stack) {
        if(stack.isEmpty())
            return;
        Character ch = stack.pop();
        printStack(stack);
        System.out.print(ch);
    }

}
