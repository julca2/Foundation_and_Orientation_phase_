package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircrafts> storage = new ArrayList<>();

    int storeOfAmmo;
    int healthPoint;


    int sumOfDamage = 0;


    public Carrier (int storeOfAmmo, int healthPoint){
        this.storeOfAmmo = storeOfAmmo;
        this.healthPoint = healthPoint;
    }

    public void add (Aircrafts newAirC){
        storage.add(newAirC);
    }

    public void fill() {
        for (Aircrafts newAir : storage) {
            newAir.queue = true;
            newAir.refillAmmo();
            newAir.queue = false;
            newAir.refillAmmo();

            if (storeOfAmmo == 0) {
                // It should throw an exception if there is no ammo when this method is called
            }
        }
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int sumAllDamage(){
        for (Aircrafts newAirCr : storage) {
            newAirCr.fight();
            sumOfDamage = sumOfDamage + newAirCr.damage;
        }
        return sumOfDamage;
    }

    public void fight (Carrier anotherCarrier){
        anotherCarrier.healthPoint = anotherCarrier.healthPoint - sumOfDamage;
    }

    public void getStatus (){
        sumAllDamage();
        System.out.println("HP: " + healthPoint + ", Aircraft count: " + storage.size() + ", Ammo Storage: " + storeOfAmmo + ", Total Damage: " + sumOfDamage);
        System.out.println("Aircrafts: ");
        for (Aircrafts newAir : storage) {
            newAir.getStatus();
        }
        if (healthPoint == 0){
            System.out.println("It's dead Jim :(");
        }
    }



}
