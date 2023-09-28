package Counter;

public class Main {
    public static void main(String[] args) {
        Counter test = new Counter();

        System.out.println(test.get());

        test.add();

        System.out.println(test.get());

        test.add(6);

        System.out.println(test.get());

        test.reset();

        System.out.println(test.get());
    }



}
