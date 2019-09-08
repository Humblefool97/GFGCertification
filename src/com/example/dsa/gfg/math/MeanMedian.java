package com.example.dsa.gfg.math;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = scanner.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            findMeanMedian(a, n);
        }

    }

    private static void findMeanMedian(int[] a, int n) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        int mean = sum / n;
        int median = 0;
        Arrays.sort(a);
        if (n % 2 == 0) {
            int term = a[(n / 2)-1] + a[((n / 2) + 1)-1];
            median = term / 2;
        } else {
            median = a[((n + 1) / 2)-1];
        }
        System.out.println(mean + " " + median);

    }
}
