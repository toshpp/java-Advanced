package com.adse2401.ssess01_java_utility_apis;

import java.time.LocalDate;

/**
 * This class represents a Person, providing basic attributes like name, nationality, 
 * birth date, and gender. It serves as a superclass for other classes such as Student.
 * 
 * @author USER
 */
public class Person {

    // Fields representing personal details
    protected String names;
    protected String nationality;
    protected LocalDate birthDate;
    protected char gender;

    // Constructor to initialize Person object
    public Person(String names, String nationality, LocalDate birthDate, char gender) {
        this.names = names;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    // Getter method for the names
    public String getNames() {
        return names;
    }

    // Getter method for nationality
    public String getNationality() {
        return nationality;
    }

    // Getter method for birth date
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Getter method for gender
    public char getGender() {
        return gender;
    }

    // Method to display basic details (to be overridden by subclasses if needed)
    public void displayDetails() {
        System.out.printf("Person's Details:\nName: %s\nNationality: %s\nDate of Birth: %s\nGender: %c\n", 
                          names, nationality, birthDate, gender);
    }
}
