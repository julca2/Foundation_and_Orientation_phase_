import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        String[] shoppingList = {"eggs", "milk", "fish", "apples", "bread", "chicken"};

        String milk = "milk";
        String bananas = "bananas";

       if (Arrays.asList(shoppingList).contains(milk)) {
           System.out.println("yes");
        } else {
           System.out.println("no");
       }

        if (Arrays.asList(shoppingList).contains(bananas)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
