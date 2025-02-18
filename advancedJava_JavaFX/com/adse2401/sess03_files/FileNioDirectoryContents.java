package com.adse2401.sess03_files;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;

public class FileNioDirectoryContents {
    private static Path path2Directory;

    public static void main(String[] args) {
        // Use a try-with-resources to auto-close open resources
        try (Scanner sc = new Scanner(System.in)) {
            // Prompt the user for the desired directory
            System.out.println("Please enter the path to the directory whose contents you wish to list/display:");
            
            // Read the directory/folder name
            path2Directory = Paths.get(sc.nextLine());
            
            // Display the contents of the directory/folder if the path exists
            if (Files.isDirectory(path2Directory)) {
                System.out.println("The contents of the " + path2Directory + "\n-----------------");

                // An object to iterate through the directory contents
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path2Directory);
                for (Path path : directoryStream) {
                    System.out.println(path.getFileName());  // Display the file/directory name
                }
                System.out.println("------------\n"); 
            } else {
                throw new IOException();
            }
        } catch (IOException ioe) {
            System.err.println("The directory path was not found."
                    + "\nPlease confirm it exists and that you have sufficient "
                    + "permissions to access it and try again.\n");
        } catch (Exception e) {
        }
    }
}
