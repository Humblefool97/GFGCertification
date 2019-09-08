package com.example.dsa.gfg.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by rajeevranganathan
 */
public class Floor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            // n : size of array
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            int n = Integer.parseInt(strs[0]);
            int key = Integer.parseInt(strs[1]);

            // Declaring array
            int arr[] = new int[n];

            String line2 = br.readLine();
            String[] array = line2.trim().split("\\s+");
            // array elements input
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(array[i]);

            System.out.println(floor(arr, n, key));

        }
        br.close();
    }

    private static int floor(int[] a, int n, int key) {
        int low = 0;
        int high = n - 1;
        if (a[0] > key) {
            return -1;
        }
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid + 1] > key && a[mid] <= key) {
                return mid;
            } else if (a[mid + 1] <=key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            }
        }

        return low;
    }
}
