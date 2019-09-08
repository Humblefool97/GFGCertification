package com.example.dsa.gfg.sorting;

/**
 * Created by rajeevranganathan
 * Approach:
 * 1.Let's we have two partitions,one has sorted arrays & other has unsorted
 * 2.Compare the unsorted partition elements with sorted partition elements till, a[unsorted] < a[sorted]
 * 3.swap
 */
public class InsertionSort {

    private static void insertionSort(int a[], int n) {
        for (int i = 1; i < n; i++) {
            int val = a[i];
            int hole = i;
            while (hole > 0 && a[hole - 1] > val) {
                a[hole] = a[hole - 1];
                hole = hole - 1;
            }
            a[hole] = val;
        }
    }
}
