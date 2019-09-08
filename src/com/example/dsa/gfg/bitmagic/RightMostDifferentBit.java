package com.example.dsa.gfg.bitmagic;

import java.util.Scanner;

/**
 * Created by rajeevranganathan
 */
public class RightMostDifferentBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();

        for (int i = 1; i <= tc; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(rightMostSetBit(m, n));
        }
    }

    private static int rightMostSetBit(int m, int n) {
        int pos = 1;
        int k = 1;
        while (((m & k) != 0) && ((n & k) != 0) && pos <= 64) {
            k = k << 1;
            pos++;
        }
        if (((m & k) != 0) || ((n & k) != 0))
            return pos;
        return 0;
    }
}
