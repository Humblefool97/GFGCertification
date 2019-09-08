package com.example.dsa.gfg.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            firstRepeating(a, n);
        }
    }

    private static void firstRepeating(int[] a, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int item = a[i];
            if (map.containsKey(item)) {
                int val = map.get(item);
                if (val < min) {
                    min = val;
                }
            } else {
                map.put(a[i], i + 1);
            }
        }
        if (min == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}
