import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) throws IOException {
        // Write a program in the `main` method that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".
        File myFile = new File("resources/my-file.txt");
        Path filePath = Paths.get("myFile");
        myFile.createNewFile();
        try {
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write("Julka");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to write file: " + myFile);
        }
    }
}
