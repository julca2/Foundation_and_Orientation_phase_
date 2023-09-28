import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.

        try {
            countLines("file");
        } catch (IOException e) {
            System.out.println("0");
        }
    }
    public static int countLines (String filename) throws IOException {
        int a = 0;
            File file = new File("resources/whatever.txt");
            Path filePath = Paths.get("resources/whatever.txt");
            List<String> lines = new ArrayList<>();
            lines = Files.readAllLines(filePath);
            for (String greeting : lines) {
                a++;
            }
        System.out.println(a);
        return (a);
    }
}

/* int a = 0;
        File file = new File("resources/whatever.txt");
        Path filePath = Paths.get("resources/whatever.txt");
        List<String> lines = new ArrayList<>();
        lines = Files.readAllLines(filePath);
        for (String greeting: lines) {
            System.out.println(greeting);

        }
        return (a); */