package com.example.dsa.gfg.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayEquality {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextLong();
            }
            for (int j = 0; j < n; j++) {
                b[j] = in.nextLong();
            }

            checkEquality(a, b, n);
        }
    }

    private static void checkEquality(long[] a, long[] b, int n) {
        HashMap<Long, Integer> table = new HashMap<>();
        for (long i : a) {
            if (!table.containsKey(i)) {
                table.put(i, 1);
            } else {
                int count = table.get(i);
                table.put(i, ++count);
            }
        }

        for (long i : b) {
            if (!table.containsKey(i)) {
                System.out.println(0);
                return;
            }
            if (table.get(i) == 0) {
                System.out.println(0);
                return;
            }
            int count = table.get(i);
            table.put(i, --count);
        }

        System.out.println(1);
    }
}
