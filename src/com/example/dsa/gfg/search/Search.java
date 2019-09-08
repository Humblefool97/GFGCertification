package com.example.dsa.gfg.search;

import java.util.Scanner;

/**
 * Created by rajeevranganathan
 */
public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int key = in.nextInt();
            search(arr, key, n);
        }
    }

    private static void search(int arr[], int x, int n) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
