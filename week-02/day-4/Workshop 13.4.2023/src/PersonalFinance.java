import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {

        int[] expenses = {500, 1000, 1250, 175, 800, 120};

        int sum = 0;

        for (int i = 0; i <= expenses.length-1; i++) {
            sum = expenses[i]+sum;
        }
        System.out.println(sum);

        int maxSoFar = expenses[0];

        for (int max : expenses) {
            if (max > maxSoFar) {
                maxSoFar = max;
            }
        }
        System.out.println(maxSoFar);

        int minSoFar = expenses[0];

        for(int min : expenses){
            if (min<minSoFar) {
                minSoFar = min;
            }
        }
        System.out.println(minSoFar);

       float average = (float) sum/expenses.length;

        System.out.println(average);

    }
}
