package com.example.dsa.gfg.math;

import java.util.Scanner;

public class SeriesGp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int t = 1; t <= tc; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            findNthTerm(a, b, n);
        }
    }

    private static void findNthTerm(int a, int b, int n) {
        int r = b / a;
        System.out.println((int) Math.floor(a * Math.pow(r, n - 1)));
    }
}
