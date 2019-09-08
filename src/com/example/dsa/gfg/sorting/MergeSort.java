package com.example.dsa.gfg.sorting;

import java.util.Arrays;

/**
 * Created by rajeevranganathan
 */
public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        mergeSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int a[], int n) {
        divide(a, n);
    }

    private static void divide(int arr[], int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        divide(left, left.length);
        divide(right, right.length);
        conquer(arr, left, right);
    }

    private static void conquer(int a[], int[] left, int[] right) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                a[k] = left[i++];
            } else {
                a[k] = right[j++];
            }
            k++;
        }

        while (i < nL) {
            a[k++] = left[i++];
        }
        while (j < nR) {
            a[k++] = right[j++];
        }
    }
}
