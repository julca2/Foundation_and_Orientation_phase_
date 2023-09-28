package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {


Captain captain = new Captain();
Pirate pirate = new Pirate();
int counter = 0;
    List<Pirate> listOfPirates = new ArrayList<>();
    boolean wins;

    public int bound;
boolean haveCaptain = false;
    public void fillShip() {
        // adding pirates
        Random rand = new Random();
        int number = rand.nextInt(113);
       this.bound = number;
        System.out.println(number);
        for (int i =0; i <number; i++) {
            Pirate pirate = new Pirate();
            this.listOfPirates.add(pirate);
        } if (haveCaptain == false) {
        listOfPirates.add(captain);  //adding captain
        haveCaptain = true;
        } else {
            System.out.println("There can be only one captain!");
        }

    }

    public void countAlivePirates(){
        for(Pirate alivePirate : listOfPirates) {
           if (alivePirate.alive) {
               counter++;
           }
        }
    }

    public void getInfo() {
        countAlivePirates();
        System.out.println("Ship: \n" + "Captain consumed " + captain.intoxication + " rums\n" +
        "Number of alive pirates:" + counter);
        counter = 0;
    }

    public boolean battle (Ship ship2) {

        if ((listOfPirates.size() - captain.intoxication) > (ship2.listOfPirates.size() - ship2.captain.intoxication)) {
            wins = true;
            Random rand2 = new Random();
            int number2 = rand2.nextInt(ship2.listOfPirates.size());
            int numberOfDeadPirates = 0;

            System.out.println(number2);
            for (Pirate deadpirate : ship2.listOfPirates) {
                if (deadpirate.alive && numberOfDeadPirates < number2) {
                    deadpirate.die();
                    numberOfDeadPirates++;
                }
            }
        }else {
            wins = false;
            Random rand1 = new Random();
            int number1 = rand1.nextInt(listOfPirates.size());
            int numberOfDeadPirates = 0;
            System.out.println(number1);

            for (Pirate deadpirate2 : listOfPirates) {
                if (deadpirate2.alive && numberOfDeadPirates < number1) {
                    deadpirate2.die();
                    numberOfDeadPirates++;
                }
            }
        }
            return wins;
    }
}
