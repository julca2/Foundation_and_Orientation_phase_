import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // Print how many legs all the animals have in total
        //
        // Example
        //
        // Please enter the number of chickens: 4
        // Please enter the number of pigs: 2
        // The number of legs: 16
        //

        System.out.println("Please enter the number of chickens: ");
        Scanner chickens = new Scanner(System.in);
        int c = chickens.nextInt();

        System.out.println("Please enter the number of pigs: ");
        Scanner pigs = new Scanner(System.in);
        int p = chickens.nextInt();


        System.out.println("The number of legs: "+((c*2)+(p*4)));
    }
}
