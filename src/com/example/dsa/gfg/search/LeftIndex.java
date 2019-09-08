package com.example.dsa.gfg.search;

import java.util.Scanner;

class LeftMostIndex {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            int key = in.nextInt();
            System.out.println(leftMostIndex(a, key, n));
        }
    }

    private static int leftMostIndex(int[] a, int k, int n) {
        int low = 0;
        int high = n - 1;
        int key = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == k) {
                key = mid;
                high = mid - 1;
            }else if (a[mid] > k){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return key;
    }
}