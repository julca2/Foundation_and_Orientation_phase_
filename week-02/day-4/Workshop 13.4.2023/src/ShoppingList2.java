import java.util.HashMap;


public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Milk", 1.07);
        prices.put("Rice", 1.59);
        prices.put("Eggs", 3.14);
        prices.put("Cheese", 12.60);
        prices.put("Chicken Breasts", 9.40);
        prices.put("Apples", 2.31);
        prices.put("Tomato", 2.58);
        prices.put("Potato", 1.75);
        prices.put("Onion", 1.10);

        HashMap<String, Integer> Bob = new HashMap<>();
        Bob.put("Milk", 3);
        Bob.put("Rice", 2);
        Bob.put("Eggs", 2);
        Bob.put("Cheese", 1);
        Bob.put("Chicken Breasts", 4);
        Bob.put("Apples", 1);
        Bob.put("Tomato", 2);
        Bob.put("Potato", 1);

        HashMap<String, Integer> Alice = new HashMap<>();
        Alice.put("Rice", 1);
        Alice.put("Eggs", 5);
        Alice.put("Chicken Breasts", 2);
        Alice.put("Apples", 1);
        Alice.put("Tomato", 10);

        double bob = 0;
        double alice = 0;







        // How much does Bob pay?
        for (String food : Bob.keySet()) {
            if (prices.containsKey(food)) {
                double a = prices.get(food) * Bob.get(food);
                bob = bob + a;
            }
        }
        System.out.println(bob);

        //How much does Alice pay? x
        for (String food : Alice.keySet()) {
            if (prices.containsKey(food)) {
                double a = prices.get(food) * Alice.get(food);
                alice = alice + a;
            }
        }
        System.out.println(alice);

        //Who buys more Rice?
        if (Bob.get("Rice") > Alice.get("Rice")) {
            System.out.println("Bob");
        } else if (Bob.get("Rice") < Alice.get("Rice")) {
            System.out.println("Alice");
        } else System.out.println("no one");

        //Who buys more Potato?
        try {
            if (Bob.get("Potato") > Alice.get("Potato")) {
                System.out.println("Bob");
            } else if (Bob.get("Potato") < Alice.get("Potato")) {
                System.out.println("Alice");
            } else System.out.println("no one");
        } catch (Exception e) {
            if (Bob.containsKey("Potato")) {
                System.out.println("Bob");
            } else if (Alice.containsKey("Potato")) {
                System.out.println("Alice");
            } else System.out.println("no one");
        }

        //Who buys more Ham?
        try {
            if (Bob.get("Ham") > Alice.get("Ham")) {
                System.out.println("Bob");
            } else if (Bob.get("Ham") < Alice.get("Ham")) {
                System.out.println("Alice");
            } else System.out.println("no one");
        } catch (Exception e) {
            System.out.println("no one");
        }

        //Who buys more Apples?x
        if (Bob.get("Apples") > Alice.get("Apples")) {
            System.out.println("Bob");
        } else if (Bob.get("Apples") < Alice.get("Apples")) {
            System.out.println("Alice");
        } else System.out.println("no one");

        //Who buys more of different products?x
        int AliceCounter = 0;
        int BobCounter = 0;

        for (String AKey : Alice.keySet()) {
            AliceCounter++;
        }
        for (String BKey : Bob.keySet()) {
            BobCounter++;
        }

        if (BobCounter > AliceCounter) {
            System.out.println("Bob");
        } else if (BobCounter < AliceCounter) {
            System.out.println("Alice");
        } else System.out.println("no one");


       // Who buys more items?(more pieces)x
        int AliceValue = 0;
        int BobValue = 0;

        for (String AValue : Alice.keySet()) {
            AliceValue = AliceValue + Alice.get(AValue);
        }

        for (String BValue : Bob.keySet()) {
            BobValue = BobValue + Bob.get(BValue);
        }

        if (BobValue > AliceValue) {
            System.out.println("Bob");
        } else if (BobValue < AliceValue) {
            System.out.println("Alice");
        } else System.out.println("no one");
    }
}
