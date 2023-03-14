package dev.attara.arrays;

public class Matrix {
    public static int shortestPath(int[][] matrix){
        int sum = 0, i = 0, j = 0;
        while (i < matrix.length && j < matrix[i].length) {
            sum += matrix[i][j];
            int r = (j+1) < matrix[i].length ? matrix[i][j+1] : Integer.MAX_VALUE;
            int d = (i+1) < matrix.length ? matrix[i+1][j] : Integer.MAX_VALUE;
            if (r < d) j++;
            else i++;
        }
        return sum;
    }
}
