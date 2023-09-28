package Animal;

public class Animal {
    private int hunger = 50;
    private int thirst = 50;

    public void eat() {
    hunger--;
        System.out.println("Eating");
    }

    public void drink() {
        thirst--;
        System.out.println("Drinking");
    }
public void play() {
        hunger++;
        thirst++;
    System.out.println("Playing");
}

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
}
