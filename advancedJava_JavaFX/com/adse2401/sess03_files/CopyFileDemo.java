package com.adse2401.sess03_files;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Java class to demonstrate file copying using NIO.
 * @author USER
 */
public class CopyFileDemo {

    public static void main(String[] args) {
        // Create two path objects
        Path sourceFile = Paths.get("C:\\Users\\USER\\Documents\\NetBeansProjects\\Mathematics\\src\\com.files\\read_file.txt");
        Path destinationFile = Paths.get("C:\\Users\\USER\\Documents\\NetBeansProjects\\Mathematics\\src\\com.files\\destination.txt");

        try (OutputStream os = Files.newOutputStream(destinationFile)) {
            // Copy the file from source to destination
            Files.copy(sourceFile, os);
        } catch (IOException ioe) {
            System.err.println("Error: " + ioe.getLocalizedMessage());
        }
    }
}
