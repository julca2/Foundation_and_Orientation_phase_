import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program prompts the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4

        double average = 0.0;


        Scanner aa = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = aa.nextInt();


        Scanner bb = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int b = bb.nextInt();


        Scanner cc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int c = cc.nextInt();


        Scanner dd = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int d = dd.nextInt();


        Scanner ee = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int e = ee.nextInt();

        int sum = (a+b+c+d+e);
        average = (double) sum/5;

        System.out.println("Sum: " + sum  + ", Average: " + average);
    }
}
