

public class AppendAFunc {
    public static void main(String[] args) {

        String typo = "Chinchill";

        appendA(typo);


    }

    public static void appendA (String myString) {
       myString = myString.concat("a");
        System.out.println(myString);
    }
}
