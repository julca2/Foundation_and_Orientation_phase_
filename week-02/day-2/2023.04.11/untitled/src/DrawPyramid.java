import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a pyramid of the specified height
        //
        // Example:
        //
        // Please enter the pyramid height: 4
        //    *
        //   ***
        //  *****
        // *******

        System.out.println("Please enter the height of pyramid: ");
        Scanner scanner2 = new Scanner(System.in);
        int heightP = scanner2.nextInt();

        for (int k = 1; k <= heightP; k++) {
            for (int m = 1; m <= heightP-k; m++ ) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2*k-1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

