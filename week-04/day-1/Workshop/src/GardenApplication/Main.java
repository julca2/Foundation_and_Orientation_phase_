package GardenApplication;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Plants> listOfPlants = new ArrayList<>();
        Garden myGarden = new Garden();
        Flower flower1 = new Flower("yellow", 0);
        Flower flower2 = new Flower("blue", 0);
        Tree tree1 = new Tree("purple", 0);
        Tree tree2 = new Tree("orange", 0);


        myGarden.addPlant(tree1);
        myGarden.addPlant(tree2);
        myGarden.addPlant(flower1);
        myGarden.addPlant(flower2);


        flower1.itNeedsWater();
        flower2.itNeedsWater();
        tree1.itNeedsWater();
        tree2.itNeedsWater();

        myGarden.watering(40);

        flower1.itNeedsWater();
        flower2.itNeedsWater();
        tree1.itNeedsWater();
        tree2.itNeedsWater();

        myGarden.watering(70);

        flower1.itNeedsWater();
        flower2.itNeedsWater();
        tree1.itNeedsWater();
        tree2.itNeedsWater();











    }
}
