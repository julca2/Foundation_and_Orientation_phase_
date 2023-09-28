import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int number = 4;

        System.out.print("Please enter your guess: ");
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        do {
            if (input1 > number) {
                System.out.println("The stored number is smaller than " + input1);
            } else if (input1 < number) {
                System.out.println("The stored number is greater than " + input1);
            }
            System.out.println("Please enter your guess:");
            input1 = scan.nextInt();

        }while (input1 != number);

    }
}
