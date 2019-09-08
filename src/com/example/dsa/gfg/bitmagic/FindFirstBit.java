package com.example.dsa.gfg.bitmagic;

import java.util.Scanner;

public class FindFirstBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();

        for (int i = 1; i <= tc; i++) {
            int num = in.nextInt();
            System.out.println(getSetBit(num));
        }
    }

    private static int getSetBit(int num) {
        int pos = 1;
        int m = 1;
        while ((num & m) == 0 && pos <= 64) {
            m = m << 1;
            System.out.println("checking..");
            pos++;
        }
        if ((num & m) != 0)
            return pos;
        return 0;
    }
}