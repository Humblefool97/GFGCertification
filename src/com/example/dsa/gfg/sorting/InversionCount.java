package com.example.dsa.gfg.sorting;

import java.util.Scanner;

/**
 * Created by rajeevranganathan
 */
public class InversionCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            System.out.println(inversionCount(arr, arr.length));
        }
    }

    private static int inversionCount(int[] a, int n) {
        int inversionCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }
}
