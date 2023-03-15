package dev.attara.arrays;

public class Matrix {
    //  Given an nxn-dimensional matrix of integers, find the shortest path from the top left-hand corner to the bottom right-hand corner.
    //  You can move horizontally and vertically, and always forward (i.e. from left to right, or top to bottom).
    //  The shortest path is the smallest sum of all values you encounter on the way.
    //
    //  As an example:
    //  For the matrix
    //  6 3 5
    //  2 4 1
    //  7 2 9
    //  the shortest path is 22,
    //  6
    //  2 4 1
    //      9
    public static int shortestPath(int[][] matrix){
        int n = matrix.length;
        int[][] dp = new int[n][n];
        dp[0][0] = matrix[0][0];

        // initialize first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] + matrix[0][j];
        }

        // initialize first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + matrix[i][0];
        }

        // fill in the rest of the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[n-1][n-1];
    }

    // Given an M × N binary matrix, find the size of the largest square submatrix of 1's present.
    public static int largestSquareSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int maxSize = 0;

        // initialize first row and column of dp
        for (int i = 0; i < m; i++) {
            dp[i][0] = matrix[i][0];
            maxSize = Math.max(maxSize, dp[i][0]);
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
            maxSize = Math.max(maxSize, dp[0][j]);
        }

        // fill in the rest of dp
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                    maxSize = Math.max(maxSize, dp[i][j]);
                }
            }
        }

        return maxSize * maxSize; // return area of the largest square submatrix
    }
}
