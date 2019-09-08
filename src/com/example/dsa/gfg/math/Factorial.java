package com.example.dsa.gfg.math;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int t = 1; t <= tc; t++) {
            int a = scanner.nextInt();
            System.out.println(fact(a));
        }
    }

    private static long fact(int a) {
        if (a == 0 || a == 1)
            return 1;
        return a * fact(a - 1);
    }
}
