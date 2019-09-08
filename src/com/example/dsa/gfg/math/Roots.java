package com.example.dsa.gfg.math;

import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int t = 1; t <= tc; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            findRoots(a, b, c);
        }

    }

    private static void findRoots(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }
        int bSq = b * b;
        int ac = 4 * a * c;
        if (bSq < ac) {
            System.out.println("Imaginary");
            return;
        }
        double root1 = ((-b + Math.sqrt(bSq - ac)) / (2 * a));
        double root2 = ((-b - Math.sqrt(bSq - ac)) / (2 * a));
        System.out.println((int)Math.floor(root1) + " " +  (int)Math.floor(root2));
    }
}
