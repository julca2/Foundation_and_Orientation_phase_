import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap <String,String> library = new HashMap<>();
        library.put("978-1-60309-452-8", "A Letter to Jo");
        library.put("978-1-60309-459-7", "Lupus");
        library.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        library.put("978-1-60309-461-0", "The Lab");

        for (String key: library.keySet()) {

        System.out.println(library.get(key) + " (ISBN:" + key + ")");

        }
        library.remove("978-1-60309-444-3");

        library.values().remove("The Lab");

        library.put("978-1-60309-450-4", "They Called Us Enemy");
        library.put("978-1-60309-453-5", "Why Did We Trust Him?");


        System.out.println(library.containsKey("478-0-61159-424-8"));
        System.out.println(library.get("978-1-60309-453-5"));



    }
}
