package com.example.dsa.gfg.recursion;

/**
 * Created by rajeevranganathan
 */
public class PrintN {
    static int i = 1;

    public static void main(String[] args) {
        //printReverse(10);Reverse
        //print(10);
        //fun(25);
   doo(173);
    }

    /**
     * Head recursion example
     *
     * @param last
     */
    private static void print(int last) {
        if (last <= 0)
            return;
        int k = last - 1;
        print(k);
        System.out.println(last);
    }

    /**
     * Tail recursion example
     *
     * @param n
     */
    private static void printReverse(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printReverse(n - 1);
    }

    /*private static void fun(int n) {
        if (n == 0)
            return;

        System.out.println(n % 2);
        fun(n / 2);
    }*/

    static int foo(int n, int r) {
        if (n > 0) return (n % r + foo(n / r, r));
        else return 0;
    }

    static int fun(int n) {

        int x = 1, k;
        if (n == 1) return x;
        for (k = 1; k < n; ++k) {
            x = x + fun(k) * fun(n-k);
        }
        return x;
    }

    static  double f(double x){
        if (Math.abs(x*x - 3) < 0.01) return x;
        else return f(x/2 + 1.5/x);
    }

    static void doo(int n){
        if( n <= 1){
            System.out.print(n);
        }else{
            doo(n/2);
            System.out.print(n%2);
        }
    }

}
