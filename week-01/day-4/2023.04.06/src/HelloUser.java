import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please enter your name: John Doe
        // Hello, John Doe!


        Scanner name = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userInput = name.nextLine();

        System.out.println("Hello, " + userInput + "!");

    }
}
