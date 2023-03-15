package dev.attara.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void shortestPath() {
        int[][] matrix1 = {{6, 3, 5}, {2, 4, 1}, {7, 2, 9}};
        int[][] matrix2 = {{6, 1, 1}, {0, 4, 1}, {0, 4, 2}};
        int[][] matrix3 = {{6, 3, 1}, {0, 4, 1}, {0, 4, 2}};
        assertEquals(22,Matrix.shortestPath(matrix1));
        assertEquals(11, Matrix.shortestPath(matrix2));
        assertEquals(12, Matrix.shortestPath(matrix3));
    }

    @Test
    void largestSquareSubmatrix(){
        int[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}};
        assertEquals(4, Matrix.largestSquareSubmatrix(matrix));
    }
}