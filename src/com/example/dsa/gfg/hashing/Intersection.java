package com.example.dsa.gfg.hashing;

import java.util.HashSet;
import java.util.Scanner;

public class Intersection {
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
            intersection(a, b, m, n);
        }
    }

    private static void intersection(int a[], int b[], int m, int n) {
        HashSet<Integer> set = new HashSet<>();
        int repeatingElements = 0;
        addElements(m > n ? a : b, set);
        repeatingElements = getRepeatingElements(m > n ? b : a, set, repeatingElements);
        System.out.println(repeatingElements);
    }

    private static int getRepeatingElements(int[] b, HashSet<Integer> set, int repeatingElements) {
        for (int i : b) {
            if (set.contains(i))
                repeatingElements++;
        }
        return repeatingElements;
    }

    private static void addElements(int[] a, HashSet<Integer> set) {
        for (int i : a) {
            set.add(i);
        }
    }
}
