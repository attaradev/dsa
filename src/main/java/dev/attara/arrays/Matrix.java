package dev.attara.arrays;

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

public class Matrix {
    public static int shortestPath(int[][] matrix){
        int path = 0, i = 0, j = 0;
        while (i < matrix.length && j < matrix[i].length) {
            path += matrix[i][j];
            int right = (j+1) < matrix[i].length ? matrix[i][j+1] : Integer.MAX_VALUE;
            int bottom = (i+1) < matrix.length ? matrix[i+1][j] : Integer.MAX_VALUE;
            if (right < bottom) j++;
            else i++;
        }
        return path;
    }
}
