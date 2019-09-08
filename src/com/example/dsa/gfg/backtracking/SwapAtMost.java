package com.example.dsa.gfg.backtracking;

import java.util.Scanner;

public class SwapAtMost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int k = in.nextInt();
            String string = in.next();
            solution(k, string);
        }
    }

    private static void solution(int k, String s) {
        System.out.println(findMinimum(s.toCharArray(),s.length(), k, Integer.valueOf(s)));
    }

    private static void swap(char[] c, int i, int j) {
        char ch = c[i];
        c[i] = c[j];
        c[j] = ch;
    }

    // Find minimum number formed by doing at-most k swap operations upon
    // digits of string
    public static int findMinimum(char[] c, int n, int k, int min_so_far)
    {
        // base case: no swaps left
        if (k < 1)
        {
            // get string from the char[] array
            String S = new String(c);

            // compare current number with minimum number so far
            if (S.compareTo(String.valueOf(min_so_far)) > 0) {
                min_so_far = Integer.valueOf(S);
            }

            return min_so_far;
        }

        // do for each digit in the input string
        for (int i = 0; i < n - 1; i++)
        {
            // compare the current digit with remaining digits
            for (int j = i + 1; j < n; j++)
            {
                // if the digit at i'th index is more than the digit
                // at j'th index
                if (c[i] < c[j])
                {
                    // swap c[i] and c[j]
                    swap(c, i, j);

                    // recur for remaining k - 1 swaps
                    min_so_far = findMinimum(c, n, k - 1, min_so_far);

                    // backtrack - restore the array back
                    swap(c, i, j);
                }
            }
        }
        return min_so_far;
    }

}
