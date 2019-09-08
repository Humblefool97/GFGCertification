package com.example.dsa.gfg.hashing;

import java.util.*;

public class CountDistinct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            // countDistinct(a, n);
            printDistinct(a);
        }
    }

    private static void countDistinct(int a[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                map.put(i, ++val);
            } else {
                map.put(i, 1);
            }
        }
        int distinctCount = 0;
        Set<Integer> keySet = map.keySet();
        for (int i : keySet) {
            if (map.get(i) == 1) {
                distinctCount++;
            }
        }
        System.out.println(distinctCount);
    }

    private static void printDistinct(int a[]) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : a) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                map.put(i, ++val);
            } else {
                map.put(i, 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for (int i : keySet) {
            if (map.get(i) == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
