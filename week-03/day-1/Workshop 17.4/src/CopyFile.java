import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CopyFile {
    public static void main(String[] args) {
        // Write a `copy` function that copies the contents of a file into another file.
        // The function should take two filenames (strings) as parameters:
        //  - path and name of the source file
        //  - path and name of the target file
        // It should return a boolean that shows whether the copy was successful or not.

        try { copy("resources/greetings.txt", "resources/my-file.txt" );
        } catch (IOException e) {
            System.out.println( "Unable to do.");
        }

    }
   public static void copy (String filename1, String filename2) throws IOException {
       File file1 = new File(filename1);
       File file2 = new File(filename2);
       Path filePath1 = Paths.get(filename1);
       Path filePath2 = Paths.get(filename2);

       Files.copy(filePath1, filePath2);
   }

}
