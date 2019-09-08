package com.example.dsa.gfg.arrays;

import java.util.Arrays;

/**
 * Created by rajeevranganathan
 */
public class ArrayInsert {
    public static void main(String[] args) {
        int arr[] = new int[6];
        int n = arr.length - 1;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        insertAtIndex(arr, arr.length, 2, 5);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
        if (index == sizeOfArray - 1) {
            arr[index] = element;
            return;
        }

        for (int i = sizeOfArray - 1; i >= index+1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
    }
}
