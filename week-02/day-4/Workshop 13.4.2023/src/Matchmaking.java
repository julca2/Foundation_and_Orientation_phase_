import java.util.*;

public class Matchmaking {
    public static void main(String... args) {

        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

        System.out.println(match(girls, boys));
    }

    public static List <String> match(List list1, List list2) {
        List <String> newList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            newList.add(i, (String) list1.get(i)+ "-" +list2.get(i));
        } 
        return newList;
    }
}