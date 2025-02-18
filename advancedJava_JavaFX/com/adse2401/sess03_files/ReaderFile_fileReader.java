package com.adse2401.sess03_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Java program that demonstrates how to read file contents using methods of the
 * java.io.FileReader class.
 * 
 * @author USER
 */
public class ReaderFile_fileReader {

    // URL object to hold the relative path to the file (read_file.txt)
    protected URL url2File = this.getClass().getResource("/com/adse2401/sess03_files/read_file.txt");

    public static void main(String[] args) {
        // Use a try-with-resources to automatically close all open handles later
        try (FileReader fReader = new FileReader(new File(
                new ReaderFile_fileReader().url2File.getPath()))) {
            int n;
            while ((n = fReader.read()) != -1) {
                // Display the contents of the file
                System.out.print((char) n); // Changed to print instead of println for character output
            }
        } catch (FileNotFoundException fne) {
            System.err.println("Sorry, the file was not found."
                    + "\nPlease check for typos and ensure you have permissions to access the file.");
        } catch (IOException e) {
            System.err.println("The error: " + e.getLocalizedMessage() + " occurred!");
        }
    }
}
