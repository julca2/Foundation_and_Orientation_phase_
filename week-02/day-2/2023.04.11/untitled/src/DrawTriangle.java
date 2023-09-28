import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter height of triangle: ");
        int heightT = scanner.nextInt();

        for (int i = 1; i <= heightT; i++ ){
            for (int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
