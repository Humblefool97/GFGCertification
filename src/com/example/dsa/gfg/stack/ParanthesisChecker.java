package com.example.dsa.gfg.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParanthesisChecker {


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());
        for (int t = 1; t <= tc; t++) {
            String input = in.readLine();
            check(input, input.length());
        }
    }

    private static void check(String s, int n) {
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        for (int i = 0; i < n; i++) {
            if(!isBalanced)break;

            Character ch = s.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(': {
                    stack.push(ch);
                    break;
                }
                case ')':{
                    if(!stack.isEmpty() &&!stack.pop().equals('(')){
                        isBalanced = false;
                    }
                    break;
                }
                case ']':{
                    if(!stack.isEmpty() &&!stack.pop() .equals('[')){
                        isBalanced = false;
                    }
                    break;
                }

                case '}': {
                    if(!stack.isEmpty() &&!stack.pop().equals('{')){
                        isBalanced = false;
                    }
                    break;
                }
            }
        }
        System.out.println(isBalanced ? "balanced" : "not balanced");
    }
}
