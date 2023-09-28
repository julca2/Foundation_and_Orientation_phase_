import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]

        int[] numbers = {3,4,5,6,7};

        int[] reversedNumbers = new int[numbers.length];

        for (int a =0; a <= numbers.length-1; a++) {
            reversedNumbers[a] = numbers[numbers.length-1-a];
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }
}