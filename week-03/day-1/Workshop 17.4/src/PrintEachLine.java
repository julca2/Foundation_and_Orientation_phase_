import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) throws IOException {
        // Write a program that opens a file called "my-file.txt" and prints each
        // line from the file to separate lines on the console.
        // If the program is unable to read the file (for example the file does not exist),
        // it should print the following error message: "Unable to read file: my-file.txt".
        File file = new File("resources/my-file.txt");
        if (file.exists()){
           Path filePath = Paths.get("resources/my-file.txt");
            List<String> lines = new ArrayList<>();
           lines = Files.readAllLines(filePath);
           for (String greeting: lines) {
               System.out.println(greeting);
            }
        } else {
            System.out.println("Unable to read file: " + file);
        }
    }
}