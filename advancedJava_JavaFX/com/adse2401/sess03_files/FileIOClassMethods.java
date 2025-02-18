package com.adse2401.sess03_files;

import java.io.File;
import java.net.URL;

/**
 * Java program that demonstrates the various methods of the java.io.File class.
 * @author USER
 */
public class FileIOClassMethods {

    // URL object to hold the relative path to the file (read_file.txt)
    // Ensure the correct path based on package structure
    protected URL url2File = this.getClass().
            getResource("/com/adse2401/sess03_files/read_file.txt");  // Corrected path

    public static void main(String[] args) {

        // Declare a File object
        File readFile = null;

        // Read in the file within a try..catch block
        try {
            FileIOClassMethods fileIO = new FileIOClassMethods();  // Instance of the current class
            if (fileIO.url2File != null) {
                readFile = new File(fileIO.url2File.getPath());

                // Display some properties of the readFile object
                if (readFile != null) {
                    System.out.println("Properties of the " + readFile.getName()
                            + " file"
                            + "\n---------"
                            + "\nFile exists: " + readFile.exists()
                            + "\nPath to the file: " + readFile.getAbsolutePath()
                            + "\nName of the file: " + readFile.getName()
                            + "\nLength of the file in bytes: " + readFile.length()
                            + "\nIs it a file?: " + readFile.isFile()
                            + "\nIs it a directory?: " + readFile.isDirectory()
                            + "\n---------------------");
                }
            } else {
                throw new NullPointerException("File path not found");
            }
        } catch (NullPointerException npe) {
            System.err.println("Sorry, the file was not found.");
            System.err.println("Please check if the file exists and you have read/write permissions to the file.");
        } catch (Exception e) {
            System.err.println("The error '" + e.getLocalizedMessage() + "' occurred.");
        }
    }
}
