import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
        // - Create an array variable named `animals`
        //   with the following content:
        //   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr",
        //     "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul",
        //     "piranh"]`
        //
        // - Add an `"a"` at the end of all elements (use a loop!)
        // - Print the 'fixed' array to the console:
        //   [koala, panda, zebra, anaconda, boa, ..., puma, tarantula, piranha]

        String[] animals = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};


       String add = "a";


        String[] animalsAdd = new String[animals.length];

        for (int i = 0; i <=animalsAdd.length-1; i++){
            for (int a = 0; a <= i; a++) {
                animalsAdd[i] =animals[a].concat(add);
            }
        }
        System.out.println(Arrays.toString(animalsAdd));
    }
}