package com.example.dsa.gfg.arrays;


import java.util.Scanner;

/**
 * Minimum adj diff in a circular array
 */
class MinAdjacentDiff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();

        for (int i = 1; i <= tc; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            minAdjDiff(arr, n);
        }
    }

    private static void minAdjDiff(int arr[], int n) {
        int minAdjDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - (arr[i + 1]));
            if (diff < minAdjDiff)
                minAdjDiff = diff;
        }

        //Since the array is circular
        minAdjDiff = Math.min(minAdjDiff, Math.abs(arr[n - 1] - (arr[0])));
        System.out.println(minAdjDiff);
    }
}