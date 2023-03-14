package dev.attara.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void calculate_shortestPath() {
        int[][] matrix = {{6, 3, 5}, {2, 4, 1}, {7, 2, 9}};
        assertEquals(22,Matrix.shortestPath(matrix));
    }
}