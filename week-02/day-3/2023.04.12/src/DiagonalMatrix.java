import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // Write a program that asks for an integer `size` from the standard input,
        // then it creates a two-dimensional array (of integers) of the specified
        // size (nxn) with the value of 1 on the main diagonal and the value of 0
        // everywhere else. Print the 2d array into the output
        //
        // Example:
        //
        // Please enter the array (matrix) size: 4
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        System.out.println("Please enter the array (matrix) size: ");
        Scanner scan1 = new Scanner(System.in);
        int size = scan1.nextInt();

        int[][] matrix = create(size);
        print(matrix);
    }

    public static int[][] create(int size) {

        // write your code to create an nxn matrix of the given size here
        // this matrix should already have value of 1 on the main diagonal

        int[][] matrix = new int[size][size];
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                if (row==column) {
                    matrix[row][column] = 1;
                } else {
                    matrix[row][column] = 0;
                }

            }
        }
            return matrix;
        }


    public static void print(int[][] matrix) {
        // write your code to print the given matrix
        // into the (standard) output here

        for(int[] row: matrix) {
            System.out.println(Arrays.toString(row));

        }
    }
}