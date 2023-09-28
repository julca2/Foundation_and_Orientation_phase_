import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> fruitsA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> fruitsB = new ArrayList<>(fruitsA);
        //Add "Passion Fruit" and "Pomelo" to List B in a single statement
        //ArrayList<String> fruitsToBeAdded = new ArrayList<>(Arrays.asList("Passion Fruit", "Pomelo"));
        //fruitsB.addAll(fruitsToBeAdded);

        System.out.println(fruitsA.contains("Durian"));
        fruitsB.remove("Durian");
        fruitsA.add(4, "Kiwifruit");

        System.out.println(fruitsA.equals(fruitsB));

        System.out.println(fruitsA.indexOf("Avocado"));
        System.out.println(fruitsB.indexOf("Durian"));

        fruitsB.addAll(new ArrayList<>(Arrays.asList("Passion Fruit", "Pomelo")));

        System.out.println(fruitsA.get(2));
        System.out.println(fruitsA);
        System.out.println(fruitsB);



    }
}
