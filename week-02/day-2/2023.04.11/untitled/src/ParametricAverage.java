import java.util.Scanner;

import static java.lang.Float.sum;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input.
        // Next, the program will prompt the user to enter as many numbers
        // as the value of the first number the user entered.
        // Once the user enters all numbers the program will print
        // their sum and average.
        //
        // Example:
        //
        // How many numbers would you like to enter: 6
        // Enter number 1 of 6: 2
        // Enter number 2 of 6: 3
        // Enter number 3 of 6: 7
        // Enter number 4 of 6: 9
        // Enter number 5 of 6: 11
        // Enter number 6 of 6: 0
        // Sum: 32, Average: 5.333333333333333

        System.out.print ("How many numbers would you like to enter: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int finalSum = 0;
        double average = 0;

        for (int b = 1; b<=a; b++) {
            System.out.print("Enter number " + b + " of " + a + ": ");
            int c = scan.nextInt();
            finalSum = finalSum + c;
        }

        average = (double) finalSum/a;


        System.out.println("Sum: " + finalSum + ", Average: " + average);
    }
}
