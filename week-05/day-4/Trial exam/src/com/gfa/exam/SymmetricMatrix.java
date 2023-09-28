package com.gfa.exam;

public class SymmetricMatrix {
    public static boolean isSymmetric (int[][] matrix) {
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
