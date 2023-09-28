import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        //How much is the fish?
        System.out.println(products.get("Fish"));

        //What is the most expensive product?
        int mostExpensive = 0;
        String key = "0";
        for (String prod : products.keySet()) {
            products.get(prod);
            if (mostExpensive <= products.get(prod)) {
                mostExpensive = products.get(prod);
                key = prod;
            }
        }
        System.out.println(key);

        //What is the average price?
        double averagePrice = 0;
        for (double price : products.values()) {
            averagePrice = averagePrice + price;
        }
        averagePrice = averagePrice / products.size();
        System.out.println(averagePrice);

       // How many products' price is below 300?
        int counter = 0;
        for (String priceBelow300 : products.keySet()){
           if  (products.get(priceBelow300) < 300) {
               counter ++;
           }
        }
        System.out.println(counter);

        // Is there anything we can buy for exactly 125?
        for (String price125 : products.keySet()) {
            if (products.get(price125) == 125) {
                System.out.println("yes");
            }
        }
        System.out.println("no");

        //What is the cheapest product?
        int cheapest = 500;
        String cheapestProduct = "0";
        for (String prod : products.keySet()) {
            products.get(prod);
            if (cheapest >= products.get(prod)) {
                cheapest = products.get(prod);
                cheapestProduct = prod;
            }
        }
        System.out.println(cheapestProduct);
    }
}
