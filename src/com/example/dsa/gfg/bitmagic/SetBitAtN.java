package com.example.dsa.gfg.bitmagic;

/**
 * Created by rajeevranganathan
 */
public class SetBitAtN {
    public static void main(String[] args) {
        int input = 4, n = 2;
        System.out.println(4 | (1 << (n - 1))); // 6
    }
}
