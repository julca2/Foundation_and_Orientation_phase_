package Pirates;

public class BattleApp {
    public static void main(String[] args) {


        Ship myShip = new Ship();
        myShip.fillShip();

        Ship newShip = new Ship();
        newShip.fillShip();
        newShip.captain.drinkSomeRum();



        myShip.battle(newShip);
        System.out.println(myShip.wins);



    }
}
