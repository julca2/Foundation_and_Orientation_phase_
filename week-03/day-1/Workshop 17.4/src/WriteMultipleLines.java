import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteMultipleLines {
    public static void main(String[] args) {
        String path = "resources/greetings.txt";
        String word = "hello";
        int number = 6;

 try {
     writeLines (path, word, number);
 }catch (IOException e) {
     System.out.println("Unable to write file: <path>");
 }


    }
    // Create a function `writeLines` that takes 3 parameters: a path, a word and a number.
    // The function should write multiple lines into a file.
    // - The path parameter should be a string that describes the location (path & name)
    //    of the file you wish to write.
    // - The word parameter should also be a string that will be written to the file as individual lines.
    // - The number parameter should describe how many times the function should write the word in the file.
    // Example:
    // If the word is "apple" and the number is 5, it should write 5 lines
    // into the file and each of the should be "apple".
    // The function should not raise any errors, but print the "Unable to write file: <path>"
    // error message instead.



public static void writeLines (String path, String word, int number) throws IOException {
    File myFile = new File("resources/greetings.txt");
    Path filePath = Paths.get("myFile");
    myFile.createNewFile();
    FileWriter myWriter = new FileWriter(myFile);

// is it possible to do it somehow with writer, or do i need do it like in MR - with array
    for (int i = 0; i <= number-1; i++) {
        System.out.println();
        myWriter.write(word + "\n");
    }
        myWriter.close();

    }
}

