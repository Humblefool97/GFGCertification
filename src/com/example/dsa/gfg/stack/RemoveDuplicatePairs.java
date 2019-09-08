package com.example.dsa.gfg.stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * You are given a string str. You need to remove the pair of duplicates.
 * <p>
 * Input:
 * The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing string str.
 * <p>
 * Output:
 * For each testcase, in a new line, print the modified string. If the final string is empty print "$"
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 1 <= |str| <= 103
 * <p>
 * Examples:
 * Input:
 * 2
 * aaabbaaccd
 * aabb
 * Output:
 * ad
 * $
 * <p>
 * Explanation:
 * Testcase1: Remove (aa)abbaaccd =>abbaaccd
 * Remove a(bb)aaccd => aaaccd
 * Remove (aa)accd => accd
 * Remove a(cc)d => ad
 */
public class RemoveDuplicatePairs {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());
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
                myStack.pop();
            } else {
                myStack.push(ch);
            }
        }
        if (myStack.isEmpty())
            System.out.println("$");
        else {
            printStack(myStack);
        }
        System.out.println();
    }


    private static void printStack(Stack<Character> stack) {
        if (stack.isEmpty())
            return;
        Character ch = stack.pop();
        printStack(stack);
        System.out.print(ch);
    }
}
