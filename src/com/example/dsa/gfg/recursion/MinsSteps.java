package com.example.dsa.gfg.recursion;

import java.util.Scanner;

/**
 * Created by rajeevranganathan
 */
public class MinsSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int a = in.nextInt();
            System.out.println(minSteps(a));
        }
    }

    public static int minSteps(int n) {
        if (n == 1)
            return 0;
        int k = 1;
        if (n % 2 == 0)
            k += minSteps(n / 2);
        else{
            k+= Math.min(minSteps(n-1),minSteps(n+1));
        }
        return k;
    }
}
