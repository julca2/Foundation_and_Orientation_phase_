package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Car myNewCar = new Car();
        Station omw = new Station();

        omw.setGasAmount(200);

        System.out.println("Station gas amount: " + omw.getGasAmount());
        System.out.println("My new Car gas amount: " + myNewCar.getGasAmount());


        omw.refill(myNewCar);
        System.out.println();


        System.out.println("Station gas amount: " + omw.getGasAmount());
        System.out.println("My new Car gas amount: " + myNewCar.getGasAmount());
    }

}
