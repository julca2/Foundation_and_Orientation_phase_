import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input and
        // then draws a diamond of the specified height
        //
        // Example:
        //
        // Please enter the diamond height: 4
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // Note: the height of the diamond is taken from its base
        // (where it is the widest) to the top.
        // The total number of lines produced is 2*height-1



        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Please enter a height of diamond:");
        int heightD = scanner3.nextInt();

        for (int a = 1; a <= heightD; a++) {
            for (int b = 1; b <= heightD - a; b++){
                System.out.print(" ");
            }
            for (int c = 1; c <= 2*a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = heightD-1 ; a >= 1 ; a--) {
            for (int b = 1; b <= heightD - a; b++){
                System.out.print(" ");
            }
            for (int c = 1; c <= 2*a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
