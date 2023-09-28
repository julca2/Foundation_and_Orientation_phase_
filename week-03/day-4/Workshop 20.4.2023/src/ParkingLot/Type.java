package ParkingLot;

import java.util.Random;

public enum Type {
    Toyota,
    Citroen,

    Audi,
    BMW,
    AstonMartin;

    public static Type getRandomType () {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
