package Pirates;
import java.util.Random;

public class Pirate {
    public int intoxication = 0;
    public boolean alive = true;

    public String a = "he's dead";




    public Pirate() {
        this.intoxication = intoxication;
        this.alive = alive;
        this.a = a;
    }

    public void drinkSomeRum() {
        if (alive == true) {
            this.intoxication++;
        } else {
            System.out.println(a);
        }
    }

    public void howsItGoingMate() {
        if (alive == true) {
            if (intoxication < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                sleep();
            }
        } else {
            System.out.println(a);
        }
    }

   public void brawl(Pirate pirateToFight) {
        if (alive) {
            Random rand = new Random();
            int number = rand.nextInt(3);
            System.out.println(number);
            if (number == 0) {
                pirateToFight.die();
            } else if (number == 1) {
                die();
            } else {
                die();
                pirateToFight.die();
            }
        }else {
            System.out.println(a);
        }

    }

    public boolean die() {
        this.alive = false;
        return alive;
    }

    public void sleep() {
        if (alive == true) {
            this.intoxication = 0;
        } else {
            System.out.println(a);
        }
    }

}
