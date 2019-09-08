package com.example.dsa.gfg.search;

import java.util.Arrays;

/**
 * Created by rajeevranganathan
 */
public class CountOccurrence {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
        System.out.println(countOccurance(arr, arr.length, 4));
    }

    private static int countOccurance(int arr[], int n, int k) {
        //3 1 2 2 1 2 3 3
        int count = 0, i = 0;
        Arrays.sort(arr);//1 1 2 2 2 3 3 3,n=8,k=4
        while (i <= n - 2) {
            int elementCount = 1;
            while ((i + 1) < n && arr[i] == arr[++i])
                elementCount++;
            if (elementCount > (n / k))
                count++;
        }
        return count;
    }
}
