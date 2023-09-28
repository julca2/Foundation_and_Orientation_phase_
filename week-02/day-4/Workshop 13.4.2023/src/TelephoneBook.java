import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap <String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(telephoneBook.get("John K. Miller"));

        String number = "307-687-2982";

        for (Map.Entry<String, String> whosNumber : telephoneBook.entrySet()) {
            if (whosNumber.getValue() == number) {
                System.out.println(whosNumber.getKey());
            }
        }


        if (!telephoneBook.containsKey("Chris E. Myers")) {
                System.out.println("no");

        }
    }
}
