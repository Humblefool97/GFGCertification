package com.example.dsa.gfg.search;


class CountOnes {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        countOnes(arr, arr.length);
    }

    private static void countOnes(int a[], int n) {
        int lastOccurance = lastOccurance(a, n);

        System.out.println(lastOccurance + 1);
    }

    private static int lastOccurance(int a[], int n) {
        int low = 0, high = n - 1;
        int mid;
        while (high >= low) {
            mid = (low + high) / 2;
            //has all 1's or found the last occurance
            if ((mid == high && a[mid] == 1) || a[mid] > a[mid + 1])
                return mid;
            else if (a[mid] < a[mid + 1]) {
                high = mid - 1;
            } else {
                if (a[mid] == 1)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}