package AircraftCarrier;

public class Main {
    public static void main(String[] args) {

        F35 newOne = new F35();
        System.out.println(newOne.ammunition);
        newOne.refillAmmo(300);
        System.out.println(newOne.ammunition);

        newOne.fight();
        System.out.println(newOne.ammunition);
        System.out.println(newOne.damage);

        newOne.getType();
        newOne.getStatus();
        newOne.isPriority();

        System.out.println("-------------------------------------");

        F16 newF16 = new F16();
        System.out.println(newF16.ammunition);
        newF16.refillAmmo (300);
        System.out.println(newF16.ammunition);

        newF16.fight();
        System.out.println(newF16.ammunition);
        System.out.println(newF16.damage);

        newF16.getType();
        newF16.getStatus();
        newF16.isPriority();
        System.out.println("-------------------------------------");

Carrier carrier = new Carrier(2300, 5000);

        carrier.add(newF16);
        carrier.add(newOne);
        carrier.fill();

       carrier.getStatus();
        System.out.println("-------------------------------------");

        System.out.println(newOne.ammunition);
        newOne.fight();
        System.out.println(newOne.damage);
        System.out.println(newOne.ammunition);

        System.out.println("-------------------------------------");

        System.out.println(newF16.ammunition);
        System.out.println(newF16.damage);
        System.out.println(newF16.ammunition);

        carrier.getStatus();

        System.out.println("-------------------------------------");

Carrier newCarrier = new Carrier(1000, 840);

    newCarrier.getStatus();
    carrier.fight(newCarrier);
    newCarrier.getStatus();

    }
}
