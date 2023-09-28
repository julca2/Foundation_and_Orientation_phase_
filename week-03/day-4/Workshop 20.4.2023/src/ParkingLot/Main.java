package ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {
    public static void main(String[] args) {
     List<Car> lotOfCars = new ArrayList<>();



   for (int i = 0; i <256; i++) {
     Car car = new Car (Color.getRandomColor(), Type.getRandomType());
     System.out.println();
     lotOfCars.add(car);
     System.out.println(lotOfCars.get(i));
}

        
    }
}
