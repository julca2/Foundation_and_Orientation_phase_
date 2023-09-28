package AircraftCarrier;

public class Aircrafts {
   String type;
    int maxAmmo;
    int baseDamage;
    int ammunition;
    int damage;
boolean queue;

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }
    public int fight (){
        this.damage = baseDamage*ammunition;
        this.ammunition = 0;
        return damage;

    }
    public int refillAmmo (int number){
       int unused =  number - this.maxAmmo;
       ammunition = maxAmmo;
       return unused;
    }
    public void refillAmmo (){
        ammunition = maxAmmo;
    }

    public void getType () {
        System.out.println(type);
    }
    public void getStatus (){
        System.out.println("Type " + type + ", Ammo: " + ammunition + ", Base Damage: " + baseDamage + ", All Damage: " + damage);
    }
    public void isPriority (){
        System.out.println(queue);
    }


}
