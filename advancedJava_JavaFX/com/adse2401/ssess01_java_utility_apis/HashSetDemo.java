package com.adse2401.ssess01_java_utility_apis;

import java.util.Arrays;   // Import Arrays class to work with array utilities
import java.util.HashSet;  // Import HashSet class to create a set
import java.util.Iterator; // Import Iterator class to iterate over a set
import java.util.Set;      // Import Set interface

/**
 * Java program to demonstrate the HashSet class and some of its methods.
 * It shows how to add elements, combine sets, and iterate over a HashSet.
 * 
 * @author USER
 */
public class HashSetDemo {

    public static void main(String[] args) {
        // Create a HashSet of design student names
        Set<String> designClass = new HashSet<>();
        designClass.add("James");
        designClass.add("Paul");
        designClass.add("Oliver");
        designClass.add("Peter");
        designClass.add("Amanda");
        designClass.add("Mary");
        designClass.add("Erick");
        designClass.add("Salim");

        // Create a string array of art students
        String[] artStudents = {"Rocky", "Julius", "Paul", "Amanda", "Kamau", 
                                "Leviathan", "Sean", "Erick", "Joe", "Alejandro"};

        // Create a set from the art class string array
        Set<String> artClass = new HashSet<>(Arrays.asList(artStudents));

        // Create a set full of all students in the campus, initializing with the design class
        Set<String> allCampusStudents = new HashSet<>(designClass);

        // Add all students from the art class to the campus set (union of both sets)
        allCampusStudents.addAll(artClass);

        // Display all the students in the design class
        displayDesignStudents(designClass);

        // Display all the students in the art class
        displayArtStudents(artClass);

        // Display all the students in the campus set using an iterator
        displayAllStudents(allCampusStudents);
    }

    // Method to display design students using a for-each loop (works in all Java versions)
    private static void displayDesignStudents(Set<String> designClass) {
        System.out.printf("The design class has %d students and their names are:\n", designClass.size());

        // Loop through each student and print their name
        for (String student : designClass) {
            System.out.println(student);
        }
    }

    // Method to display art students using functional programming (Java 8 and above)
    private static void displayArtStudents(Set<String> artClass) {
        System.out.printf("The art class has %d students and their names are:\n", artClass.size());

        // Use forEach and lambda expression to display the names
        artClass.forEach(student -> System.out.println(student));
    }

    // Method to display all students in the campus using an iterator (assignment)
    private static void displayAllStudents(Set<String> allCampusStudents) {
        System.out.printf("The campus has %d students and their names are:\n", allCampusStudents.size());

        // Create an iterator to traverse through the set
        Iterator<String> iterator = allCampusStudents.iterator();
        while (iterator.hasNext()) {
            // Get the next student from the iterator and print their name
            System.out.println(iterator.next());
        }
    }
}
