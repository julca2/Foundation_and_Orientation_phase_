import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array and print the modified
        //   array to the console as:
        //   [6, 8, 10, 12, 14]

        int [] numbers = {3,4,5,6,7};
        int [] doubled = new int[5];

        for(int i = 0; i<=numbers.length-1; i++) {
             for (int j = numbers[i]; j <=numbers[i]; j++) {
                 doubled[i] = j*2;
             }
         }
        System.out.println(Arrays.toString(doubled));
    }
}
