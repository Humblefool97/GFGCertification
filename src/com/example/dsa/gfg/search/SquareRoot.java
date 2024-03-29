package com.example.dsa.gfg.search;

class SquareRoot {

    public static void main(String[] args) {
        System.out.println(squareRoot(1));
    }

    private static long squareRoot(int a) {
        if (a == 0)
            return 0;
        if (a == 1)
            return 1;

        int low = 0;
        int high = a;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid == (a / mid))
                return mid;
            else if (mid < (a / mid))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return (long) Math.sqrt(high);
    }
}       