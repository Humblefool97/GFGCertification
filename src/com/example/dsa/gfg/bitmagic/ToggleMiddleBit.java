package com.example.dsa.gfg.bitmagic;

import java.util.Scanner;

/**
 * Created by rajeevranganathan
 */
public class ToggleMiddleBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int a = in.nextInt();
            int n = Integer.toBinaryString(a).length();
            if (n % 2 != 0) {
                int k = 1 << ((n / 2));
                a = a ^ k;
                System.out.println(a);
            } else {
                int k = 1 << ((n / 2)-1);
                a = a ^ k;
                k = 1 << ((n / 2));
                a = a ^ k;
                System.out.println(a);
            }
        }
    }
}
