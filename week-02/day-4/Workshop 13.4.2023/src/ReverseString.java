public class ReverseString {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // The method should return the reversed string
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done



        for (int i = toBeReversed.length() - 1; i >= 0; i--) {
            System.out.print(toBeReversed.charAt(i));
        }
        System.out.println("\n----------------------------");
        buildAStringg(toBeReversed);
    }
        public static void buildAStringg (String input) {
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            System.out.println(sb);

        }
}

