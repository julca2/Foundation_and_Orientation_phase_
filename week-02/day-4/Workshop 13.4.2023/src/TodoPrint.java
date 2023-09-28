public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying an extra 4 space indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        System.out.println(todoText.length());
        buildingAString(todoText);
    }
    public static void buildingAString (String input) {
   StringBuilder sb = new StringBuilder(input);
   sb.insert(0, "My todo: \n");
   sb.insert(sb.length(), " - Download games \n");

   // any other option than tab or space? opposite of trim?
   sb.insert(sb.length(), "     - Diablo");
        System.out.println(sb);



    }
}
