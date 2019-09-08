package com.example.dsa.gfg.math;

import java.util.Scanner;

/**
 * Created by rajeevranganathan
 */
public class NearestSqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            Long a = in.nextLong();
            boolean isPerfectSquare = isPerfectSq(a);
            if (isPerfectSquare) {
                int k = (int) Math.sqrt(a);
                int c = (int) Math.pow(k + 1, 2);
                int d = (int) Math.pow(k - 1, 2);
                int smallest = Math.abs(a - c) < Math.abs(a - d) ? c : d;
                System.out.println(smallest);
            } else {
                int k = (int) Math.sqrt(a);
                int b = (int) Math.pow(k, 2);
                int c = (int) Math.pow(k + 1, 2);
                int d = (int) Math.pow(k - 1, 2);
                int smallest = Math.abs(a - c) < Math.abs(a - d) ? (Math.abs(a - c) < Math.abs(a - b) ? c : b) : (Math.abs(a - d) < Math.abs(a - b) ? d : b);
                System.out.println(smallest);
            }
        }
    }

    private static boolean isPerfectSq(long n) {
        double root = Math.sqrt(n);
        return (root - Math.floor(root) == 0);
    }
}
