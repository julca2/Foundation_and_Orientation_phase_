import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input and
        // then draws a square of the specified size
        //
        // Example:
        //
        // Please enter the square size: 6
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Please enter the square size: ");
        int heightS = scanner4.nextInt();

        for (int a = 1; a <= heightS; a++) {
            System.out.print("%");
        }
        System.out.println();
        for (int c = 1; c <= heightS-2; c++) {
            for (int b = 1; b == 1; b++) {
                System.out.print("%");
            }
            for (int e = 1; e <= heightS-2; e++ ){
                System.out.print(" ");
            }
            for (int f = heightS; f == heightS; f++) {
                System.out.print("%");
            }
            System.out.println();
        }
        for (int d = 1; d <= heightS; d++) {
            System.out.print("%");
        }
        System.out.println();
    }
}
