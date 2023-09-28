public class numberAdder {
    public static void main(String[] args) {

        // Implement "numberAdder" which is a recursive function that takes one parameter: n (number)
// and returns the sum of integers from 1 to n.
// The function should return 0 for inputs less than 1.

        numberAdder(3);
    }

    public static int numberAdder(int count) {

        if (count < 1) {
           return 0;
        }
        return count + numberAdder(count - 1);
    }
}
