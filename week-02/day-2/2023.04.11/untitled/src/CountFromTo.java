import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers. If the second number
        // is not greater than the first the program should print:
        // "The second number should be bigger"
        //
        // Otherwise it should output all integers between the first and
        // the second number (excluding the second number)
        //
        // Example:
        //
        // Please enter the first number: 3
        // Please enter the second number: 6
        // 3
        // 4
        // 5
        System.out.println("Please enter the first number:");
        Scanner scan1 = new Scanner(System.in);
        int input1 = scan1.nextInt();

        System.out.println("Please enter the second number:");
        Scanner scan2 = new Scanner(System.in);
        int input2 = scan2.nextInt();

        if (input2 < input1) {
            System.out.println("The second number should be bigger.");
        }else{
            while (input1 < input2) {
                input1++;
                System.out.println(input1);
            }
        }
    }
}
