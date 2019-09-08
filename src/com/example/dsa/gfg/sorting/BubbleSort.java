package com.example.dsa.gfg.sorting;

/**
 * Created by rajeevranganathan
 */
public class BubbleSort {

    private static void bubbleSort(int a[], int n) {
        for (int pass = 0; pass < n - 1; pass++) {
            for (int j = 0; j < n - pass - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
