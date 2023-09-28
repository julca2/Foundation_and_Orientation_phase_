public class Factorial {
    public static void main(String[] args) {

       calculateFactorial(8);

    }
    public static void calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++ ) {
            factorial = i*factorial;

            if (i == 1) {
                System.out.print(" = " + i);
            } else {
                System.out.print(" * " +i);
            }
            if (i == num) {
                System.out.print(" = " + factorial);
            }
        }
    }
}
