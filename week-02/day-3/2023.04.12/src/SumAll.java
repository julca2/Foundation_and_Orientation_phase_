public class SumAll {
        public static void main(String[] args) {
            // - Create an array variable named `numbers`
            //   with the following content: `[3, 4, 5, 6, 7]`
            // - Print the sum of the elements of `numbers`

            int[] numbers = {3,4,5,6,7};
            int sum = 0;
            int n = 0;


            for (int i = 0; i <= numbers.length-1; i++){
                sum = numbers[i]+sum;
            }

            System.out.println(sum);
        }
    }

