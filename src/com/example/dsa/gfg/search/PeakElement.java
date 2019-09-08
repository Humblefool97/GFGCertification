package com.example.dsa.gfg.search;

/**
 * Created by rajeevranganathan
 */
public class PeakElement {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        System.out.println(peak(a,a.length));
    }
    private static int peak(int a[], int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid == 0 || a[mid-1] <= a[mid]) && (mid == n-1 ||
                    a[mid+1] <= a[mid])) {
                return 1;
            } else if (a[mid] < a[mid - 1]) {
                high = mid - 1;
            } else if (a[mid] < a[mid + 1]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
