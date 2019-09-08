package com.example.dsa.gfg.arrays;

import java.util.Arrays;

class RotateArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr, arr.length, 4);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int n, int k) {
        for (int i = 1; i <= k; i++) {
            int temp = arr[0];
            int j = 0;
            for (; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
    }
}