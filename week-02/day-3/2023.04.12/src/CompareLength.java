import java.util.Arrays;

public class CompareLength {
    public static void main(String[] args) {
        // - Create an array variable named `firstArrayOfNumbers`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `secondArrayOfNumbers`
        //   with the following content: `[4, 5]`
        // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers`
        // has more elements than `firstArrayOfNumbers`
        // - Otherwise print: "firstArrayOfNumbers is the longer one"
        int [] firstArrayOfNumber =  {1,2,3};
        int [] secondArrayOfNumber = {4,5,};


       if (firstArrayOfNumber.length>secondArrayOfNumber.length) {
            System.out.println("firstArrayOfNumber is longer one");
        }    else {
            System.out.println("secondArrayOfNumber is the longer one");
        }

    }
}
