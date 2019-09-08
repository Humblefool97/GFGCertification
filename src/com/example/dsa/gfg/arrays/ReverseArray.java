package com.example.dsa.gfg.arrays;

import java.util.Arrays;

class ReverseArray {

    public static void main(String... args) {
        int arr[] = {1, 2, 3};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, ++start, --end);
    }
}