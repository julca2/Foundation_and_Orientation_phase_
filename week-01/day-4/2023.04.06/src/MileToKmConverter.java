import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program which prompts the user for a double value
        // specifying a distance in miles, converts that value
        // to kilometers and prints it
        //
        // Example:
        //
        // Please enter a distance in miles: 1.8
        // The distance in km: 2.88
        //
        System.out.println("Please enter a distance in miles: ");
        Scanner input = new Scanner(System.in);
        double userInput = input.nextFloat();
        System.out.println("The distance in km: " + userInput*1.609344);

    }
}
