package GardenApplication;


import java.util.ArrayList;
import java.util.List;

public class Garden {

    int dividedAmount;
    ArrayList<Plants> garden;

    int counter = 0;


    public Garden() {
        this.garden = new ArrayList<>();
    }

    public void addPlant (Plants plant){
        garden.add(plant);
    }


    public void watering(int amountOfWater){
        System.out.println("Watering with " + amountOfWater);
        for (Plants plantx : garden) {
            if (plantx.needsWater == true) {
                counter++;
            }
        }
        dividedAmount = amountOfWater/counter;

        for (Plants planty : garden) {
            if (planty.needsWater == true) {
                planty.getWatered(dividedAmount);
            }
            counter = 0;
        }
    }
}
