package com.example.dsa.gfg.arrays;

import java.util.Arrays;

/**
 * Created by rajeevranganathan
 */
public class MaxSecondMax {
    public static void main(String[] args) {
        int arr[] = {1, 2,3,3,4,5};
        maxAndSecondMax(arr, arr.length);
    }

    private static void maxAndSecondMax(int arr[], int n) {
        int max = Integer.MIN_VALUE, max2 = -1;
        Arrays.sort(arr);
        max = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                max2 = arr[i - 1];
                break;
            }
        }
        System.out.println(max + " " + max2);
    }
}
