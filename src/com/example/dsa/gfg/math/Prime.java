package com.example.dsa.gfg.math;

import java.util.Scanner;

/**
 * Checks if a number is prime or not
 */
public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = scanner.nextInt();
            isPrime(n);
        }
    }

    private static void isPrime(int a) {
        if (a < 2) {
            System.out.println("No");
            return;
        }
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}