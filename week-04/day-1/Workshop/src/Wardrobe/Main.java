package Wardrobe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Wardrobe myWardrobe = new Wardrobe();

        Cloth trousers = new Overwear("trousers", "blue", 5);
        Cloth tShirt = new Overwear("tShirt", "yellow", 50);
        myWardrobe.addCloth(trousers);
        myWardrobe.addCloth(tShirt);

        System.out.println(myWardrobe.getMyWardrobe().get(0).color);

        myWardrobe.addCloth(trousers);



        List removed = new ArrayList<>();

        trousers.getInfo();
        System.out.println(trousers.condition);
        System.out.println(trousers.daysWorn);
        trousers.wear();
        System.out.println(trousers.daysWorn);
        trousers.wash();
        trousers.wash();
        trousers.wash();
        trousers.wash();
        trousers.wash();
        trousers.needsToBeRepaired();
        System.out.println(trousers.condition);
        System.out.println(trousers.daysWorn);
      //  trousers.repair();

        System.out.println(trousers.condition);
        myWardrobe.purge();

        System.out.println(removed);

        trousers.getInfo();


// not done

    }
}
