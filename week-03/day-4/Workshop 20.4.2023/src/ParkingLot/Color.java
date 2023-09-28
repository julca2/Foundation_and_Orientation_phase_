package ParkingLot;

import java.util.Random;

public enum Color {
    red,
    white,
    blue,
    orange,
    green,
    black,
    silver,
    yellow;
    public static Color getRandomColor () {
        Random random = new Random();
        return values() [random.nextInt(values().length)];


    }
};
