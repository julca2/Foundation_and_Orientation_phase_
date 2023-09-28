import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one.
        // If they are equal, it prints the second one.
        //
        // Example
        //
        // Please enter a number: 5
        // Please enter a number: 13
        // 13

        System.out.println("Please enter a number: ");
        Scanner scan1 = new Scanner(System.in);
        int input1 = scan1.nextInt();

        System.out.println("Please enter a number: ");
        Scanner scan2 = new Scanner(System.in);
        int input2 = scan2.nextInt();

        if (input1 > input2) {
            System.out.println(input1);
        } else if (input1 == input2) {
            System.out.println(input2);
        } else {
            System.out.println(input2);
        }


    }
}

