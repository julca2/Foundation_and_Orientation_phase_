package ParkingLot;

public class Car {
 Color colors;
Type types;

    @Override
    public String toString() {
        return "Car{" +
                "colors=" + colors +
                ", types=" + types +
                '}';
    }


    public Car(Color colors, Type types) {
        this.colors = colors;
        this.types = types;
    }

    public Color getColors() {
        return colors;
    }

    public void setColors(Color colors) {
        this.colors = colors;
    }

    public Type getTypes() {
        return types;
    }

    public void setTypes(Type types) {
        this.types = types;
    }
}
;
;