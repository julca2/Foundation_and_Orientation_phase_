package Wardrobe;

import AircraftCarrier.Aircrafts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Wardrobe {
    public List<Cloth> getMyWardrobe() {
        return myWardrobe;
    }

    List<Cloth> myWardrobe = new ArrayList<>();

    List<Cloth> removed = new ArrayList<>();
    public void addCloth(Cloth cloth1){
        myWardrobe.add(cloth1);
    }


    public void printInfo(){
        for (Cloth newcloth : myWardrobe) {
            newcloth.getInfo();
        }
    }

    public void washAllClothes(){
        for (Cloth newcloth : myWardrobe) {
            newcloth.washingNeeded = true;
            newcloth.wash();
        }
    }

    public void repairAllClothes(){
        for (Cloth newcloth : myWardrobe) {
            newcloth.repairNeeded = true;
            newcloth.repair();
        }
    }


    public List purge(){

        for (int i = 0; i < myWardrobe.size(); i++){
            if (myWardrobe.get(i).condition == 0) {
                System.out.println(myWardrobe.get(i));
                removed.add(myWardrobe.get(i));
                myWardrobe.remove(myWardrobe.get(i));
            }
        }

        System.out.println(removed.size());
        System.out.println(removed);

        return removed;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "myWardrobe=" + myWardrobe +
                ", removed=" + removed +
                '}';
    }


}
