package com.example.dsa.gfg.hashing;

import java.util.HashSet;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int t = 1; t <= tc; t++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[m];
            int b[] = new int[n];
            for (int i = 0; i < m; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            union(a, b, m, n);
        }
    }

    private static void union(int a[], int b[], int m, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int element : a) {
            set.add(element);
        }
        for (int element : b) {
            set.add(element);
        }
        System.out.println(set.size());
    }
}
