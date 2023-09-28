import java.util.HashMap;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        //Which products cost less than 201? (just the name)
        for (String priceLessThan201 : products.keySet()) {
            if (products.get(priceLessThan201) < 201 ) {
                System.out.println(priceLessThan201);
            }
        }
        //Which products cost more than 150? (name + price)
        for (String priceMoreThan150 : products.keySet()) {
            if (products.get(priceMoreThan150) > 150 ) {
                System.out.println(priceMoreThan150 + " " + products.get(priceMoreThan150));
            }
        }
    }
}
