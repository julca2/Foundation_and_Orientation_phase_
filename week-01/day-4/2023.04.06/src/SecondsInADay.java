public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds
        // (as an integer) from a
        // day if the current time is represented by
        // the variables above
        System.out.println(60-currentSeconds + ((60-1-currentMinutes)*60) + (24-1-currentHours)*60*60);

    }
}
