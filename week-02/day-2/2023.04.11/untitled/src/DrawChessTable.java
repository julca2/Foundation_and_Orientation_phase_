import java.util.Scanner;

public class drawChessTable {
    public static void main(String[] args) {
       /* System.out.println("Please enter the chess table size:");
        Scanner scanner6 = new Scanner(System.in);
        int chessTable = scanner6.nextInt();

        for (int c = 1; c <= chessTable / 2; c++) {
            for (int a = 1; a <= chessTable; a++) {
                if (a % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            for (int b = 1; b <= chessTable; b++) {
                if (b % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }

       */

        Scanner scanner7 = new Scanner(System.in);
        System.out.print("Please enter the chess table size:");
        int chessTable2 = scanner7.nextInt();

        for (int a = 1; a <= chessTable2; a++ ) {
            if (a % 2 == 0) {
                for (int b = 1; b <= chessTable2; b++) {
                    System.out.print(" ");
                    System.out.print("X");
                }
            } else {
                for (int c = 1; c <= chessTable2; c++) {
                    System.out.print("X");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}





