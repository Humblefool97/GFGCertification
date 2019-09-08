package com.example.dsa.gfg.backtracking;

import java.util.Scanner;

/**
 * Can take multiple jumps
 */
public class RateInMaze2 {
    private static int N = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = in.nextInt();
            N = n;
            int maze[][] = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    maze[j][k] = in.nextInt();
                }
            }
            int sol[][] = new int[n][n];
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    sol[row][col] = 0;
                }
            }
            isSafeUtil(maze, 0, 0, sol);
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(sol[row][col]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    private static boolean isSafe(int[][] maze, int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] > 1)
            return true;
        return false;
    }


    private static boolean isSafeUtil(int[][] maze, int x, int y, int[][] sol) {
        //base case
        if (x == N - 1 && y == N - 1 && maze[x][y] > 0) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;
            for (int i = 1; i < maze[x][y] && i < N; i++) {
                if (isSafeUtil(maze, x + i, y, sol)) {
                    return true;
                }

                if (isSafeUtil(maze, x, y + i, sol))
                    return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }
}
