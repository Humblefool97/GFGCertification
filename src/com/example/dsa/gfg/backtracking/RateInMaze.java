package com.example.dsa.gfg.backtracking;

public class RateInMaze {
    private static int N = 0;

    public static void main(String[] args) {
        int maze[][] =
                {       {1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}
                };
        N = maze.length;
        int sol[][] = new int[N][N];
        System.out.println(isSafeUtil(maze, 0, 0, sol));
    }

    private static boolean isSafe(int[][] maze, int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N)
            return true;
        return false;
    }


    private static boolean isSafeUtil(int[][] maze, int x, int y, int[][] sol) {
        //base case
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1){
            sol[x][y]=1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;

            if (isSafeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            if (isSafeUtil(maze, x, y + 1, sol))
                return true;
            sol[x][y] = 0;
            return false;
        }
        return false;
    }
}
