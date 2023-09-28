package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("color", 6);
        System.out.println(sharpie.getInkAmount());
        sharpie.use();
        System.out.println(sharpie.getInkAmount());
    }
}
