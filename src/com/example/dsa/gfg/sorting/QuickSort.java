package com.example.dsa.gfg.sorting;

import java.util.Arrays;

/**
 * Created by rajeevranganathan
 */
public class QuickSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 2, 2, 2};
        quickSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int a[], int n) {
        quickSort(a, 0, n - 1);
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pIndex = partition(a, 0, end);
            quickSort(a, start, pIndex - 1);
            quickSort(a, pIndex + 1, end);
        }
    }

    /**
     * Choose a pivot.Start partitioning the array right from the beginning
     * by always making sure,elements @ the left of partitionIndex are always less than the pivot
     * & right are greater.
     *
     * @param a
     * @param start
     * @param end
     * @return
     */
    private static int partition(int a[], int start, int end) {
        int pivot = a[end];
        int partitionIndex = start;
        for (int i = start; i < end; i++) {
            if (a[i] <= pivot) {
                swap(a, partitionIndex, i);
                partitionIndex++;
            }
        }
        swap(a, partitionIndex, end);
        return partitionIndex;
    }

    private static void swap(int a[], int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
