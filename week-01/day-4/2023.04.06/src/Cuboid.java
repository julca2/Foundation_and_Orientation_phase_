public class Cuboid
{
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid.

        double a = 10.4;
        double b = 13.5;
        double c = 8.2;

        System.out.println("Surface Area: " + (2*(a*b+b*c+a*c)));
        System.out.println("Volume: " + a*b*c);

        // Set the 3 sides to 10.4, 13.5, 8.2 and your program should
        // produce the following output:
        //
        // Surface Area: 672.76
        // Volume: 1151.28
    }
}
