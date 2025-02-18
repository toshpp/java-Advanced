package comadse2401_SESS02_generics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 * Java program that prompts the user for a string, writes it to a file,
 * then reads and displays the contents of the file using methods of the
 * java.nio classes.
 */
public class NIOWrite2file {
    // Create a path reference to the nioreadwrite file
       private static Path readwriteFile = Paths.get("C:\\Users\\USER\\Documents\\NetBeansProjects\\Mathematics\\build\\classes\\com.files\\nioreadwrite.txt");

      

    public static void main(String[] args) {
        // Use a try...with resources to auto-close resources
        try (Scanner sc = new Scanner(System.in)) {
            // Prompt the user for a string to be written to the nioreadwrite file
            System.out.println("Please enter some text to be written to the "
                    + "text file->");
            
            String appendString ="\n"+ sc.nextLine(); 
            
            // Append the content to the file
            Files.write(readwriteFile, appendString.getBytes(), StandardOpenOption.APPEND);

            // Read and display the contents of the file
            List<String> fileContents = Files.readAllLines(readwriteFile);
            fileContents.forEach(fileContent -> {
                System.out.println(fileContent);
            });
        } catch (IOException ioe) {
            System.err.println("Error: " + ioe.getLocalizedMessage());
        }
    }
}
