public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper (Sum) and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero
// to the given parameter
//
// Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15


        sum(5);
    }
    public static void sum (int num){
        int sum = 0;
        for (int i = 0; i <= num; i++){
            sum = i+sum;

            if (i == 0) {
                System.out.print(i);
            } else {
                System.out.print(" + " +i);
            }
            if (i == num) {
                System.out.println(" = " + sum);
            }
            }
        }
}
