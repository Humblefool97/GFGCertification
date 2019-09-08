package com.example.dsa.gfg.hashing;

import java.util.Scanner;
import java.util.TreeMap;

public class RelativeSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] a = new int[m];
            int[] b = new int[n];
            for (int j = 0; j < m; j++) {
                a[j] = in.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = in.nextInt();
            }
            relativeSorting(a, b, m, n);
        }
    }

    private static void relativeSorting(int[] a, int b[], int n, int m) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                int val = map.get(a[i]);
                map.put(a[i], ++val);
            } else {
                map.put(a[i], 1);
            }
        }

        for (int i = 0; i < m; i++) {
            int key = b[i];
            if (map.containsKey(key)) {
                printFreq(key, map.get(key));
                map.remove(key);
            }
        }

        for (int key : map.keySet()) {
            printFreq(key, map.get(key));
        }
        System.out.println();
    }

    private static void printFreq(int element, int frequency) {
        for (int i = 1; i <= frequency; i++) {
            System.out.print(element + " ");
        }
    }
}
