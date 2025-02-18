package com.adse2401.sess03_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class BufferedReader_TrywithResources {

    // URL object to hold the relative path to the file (read_file.txt)
    protected URL url2File = this.getClass().getResource("/com/adse2401/sess03_files/read_file.txt");

    public static void main(String[] args) {
        // Use a try-with-resources block to handle the file and ensure proper closure
        try (BufferedReader br = new BufferedReader(new FileReader(new File(
                new BufferedReader_TrywithResources().url2File.getPath())))) {
            
            // Display the contents of the file
            System.out.println("The contents of the file are:");
            String st;
            int n = 1;
            while ((st = br.readLine()) != null) {
                System.out.printf("Line %d: %s%n", n++, st);
            }
            
        } catch (FileNotFoundException fne) {
            // Handle the case where the file is not found
            System.err.println("Sorry, the file was not found."
                    + "\nPlease check for typos and ensure you have permissions to access the file.");
        } catch (IOException e) {
            // Handle general I/O exceptions
            System.err.println("An error occurred: " + e.getLocalizedMessage());
        }
    }
}
