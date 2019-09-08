package com.example.dsa.gfg.sorting;

import java.util.Arrays;

/**
 * Created by rajeevranganathan
 * In place,stable
 * TC;O(n^2),quadratic
 * SC:O(1)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        selectionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
