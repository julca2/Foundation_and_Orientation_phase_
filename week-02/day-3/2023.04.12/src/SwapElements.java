import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {

        String [] orders = {"first", "second", "third"};

        String[] newOrders = new String[orders.length];

        for (int a = 0; a <= orders.length-1; a++) {
            newOrders[a]=orders[orders.length-1-a];
        }

        System.out.println(Arrays.toString(newOrders));
    }
}