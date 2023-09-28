package com.gfa.exam;

import org.junit.Test;

import static com.gfa.exam.SymmetricMatrix.isSymmetric;
import static org.junit.Assert.assertEquals;

public class SymmetricMatrixTest {

    @Test
    public void testIsSymmetric1() {
        int n =3;
        int [][] matrix2 = new int[n][n];

        matrix2[0][0] = 1;
        matrix2[0][1] = 0;
        matrix2[0][2] = 1;
        matrix2[1][0] = 0;
        matrix2[1][1] = 2;
        matrix2[1][2] = 2;
        matrix2[2][0] = 1;
        matrix2[2][1] = 2;
        matrix2[2][2] = 5;
        boolean expected = true;

        boolean actual = isSymmetric(matrix2);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSymmetric2() {
        int n =3;
        int [][] matrix2 = new int[n][n];

        matrix2[0][1] = 7;
        matrix2[0][2] = 7;
        matrix2[1][0] = 6;
        matrix2[1][1] = 5;
        matrix2[1][2] = 7;
        matrix2[2][0] = 1;
        matrix2[2][1] = 2;
        matrix2[2][2] = 1;

        boolean expected = false;

        boolean actual = isSymmetric(matrix2);
        assertEquals(expected, actual);
    }





}
