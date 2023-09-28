public class CodingHours {
    public static void main(String[] args) {
        // Im not sure, i really want to know these answers :D
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long

        int daily = 6;
        int weekly = 5;
        int monthly =17;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.


        System.out.println(daily*weekly*monthly);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int averageWorkHour = 52;
        System.out.println((double) daily*weekly/averageWorkHour * 100);
    }

}
