package com.example.dsa.gfg.search;


import java.util.Arrays;
import java.util.Scanner;

class CountRepeated {
    public static void main(String[] args) {
        //int arr[] = {2, 2, 3, 5, 4};
        //  countRepeated(arr, arr.length);
        //countRepeatedEfficiant(arr,arr.length);
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            countRepeatedSuperEfficiant(arr, arr.length);
        }
    }

    //O(n^2)
    private static void countRepeated(int a[], int n) {
        int count = 0, num = -1;
        for (int i = 0; i < n - 1; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count >= 2) {
                num = a[i];
                break;
            }
        }
        System.out.println(num + " " + count);
    }

    //O(n)
    private static void countRepeatedEfficiant(int a[], int n) {
        int count, i = 0;
        Arrays.sort(a);
        while (i <= n - 2) {
            count = 1;
            while ((i + 1) < n && a[i] == a[++i]) {
                count++;
            }
            if (count > 1) {
                System.out.println(a[--i] + " " + count);
                break;
            }
        }
    }

    private static void countRepeatedSuperEfficiant(int a[], int n) {
        int start = 0;
        int end = n - 1;
        int mid = -1;
        while (start < end) {
            mid = (start + end) / 2;
            if (a[mid] >= mid + a[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        System.out.println(a[mid]+" "+(n-(a[n-1]-a[0])));
    }


}