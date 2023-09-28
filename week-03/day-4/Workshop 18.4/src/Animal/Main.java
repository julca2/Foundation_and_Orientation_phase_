package Animal;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal();

        System.out.println("Hello, I'm dog! \n My stats: ");


        System.out.println("Hunger: " + dog.getHunger());
        System.out.println("Thirst: " + dog.getThirst());

        dog.drink();
        System.out.println("Thirst: " + dog.getThirst());

        for (int i = 0; i < 10; i++){
        dog.eat();}
        System.out.println("Hunger: " + dog.getHunger());

        dog.play();
        System.out.println("Hunger: " + dog.getHunger());
        System.out.println("Thirst: " + dog.getThirst());
    }
}
