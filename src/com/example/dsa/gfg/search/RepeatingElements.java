package com.example.dsa.gfg.search;

import java.util.Scanner;

/**
 * Created by rajeevranganathan
 */
public class RepeatingElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int c = 1; c <= tc; c++) {
            int n = in.nextInt();
            int[] a = new int[n + 2];
            for (int j = 0; j < n + 2; j++) {
                a[j] = in.nextInt();
            }
            for (int i = 0; i < (n + 2); i++) {
                if (Math.abs(a[Math.abs(a[i])]) != -a[Math.abs(a[i])]) {
                    a[Math.abs(a[i])] = -a[Math.abs(a[i])];
                } else {
                    System.out.print(Math.abs(a[i]) + " ");
                }
            }
            System.out.print("");
        }
    }
}
