import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        System.out.println(names.size());

        names.add("Wiliam");

        System.out.println(names.isEmpty());

        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());
        System.out.println(names.get(2));

        for (int i=0; i< names.size(); i++ ) {
            System.out.println(names.get(i));
        }

        for (int b = 0; b < names.size(); b++) {

                System.out.println(b +1 + "." + names.get(b));

        }

        names.remove(1);

        for (int c=names.size() -1; c >= 0; c--) {
            System.out.println(names.get(c));
        }

        names.removeAll(names);

        System.out.println(names.size());






    }
}
