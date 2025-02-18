package com.adse2401.ssess01_java_utility_apis;

import java.time.LocalDate;

/**
 * This class represents a Student, which is a subclass of the Person class.
 * The Student class adds properties such as registration number and course 
 * to the basic details inherited from the Person class (e.g., name, nationality, etc.).
 * 
 * It demonstrates inheritance, constructor chaining (calling the parent constructor), 
 * and method overriding for custom student details display.
 * 
 * @author USER
 */
public class Student extends Person {

    // Additional fields specific to the Student class
    protected String regNo;  // Student registration number
    protected String course; // Course in which the student is enrolled

    // Default constructor calls the parent class constructor
    public Student() {
        super();  // Call to the parent class (Person) constructor
    }

    /**
     * Constructs a new Student object with the specified registration number, course, 
     * name, nationality, birth date, and gender.
     *
     * @param regNo     The registration number of the student, which serves as a unique identifier.
     * @param course    The course in which the student is enrolled.
     * @param names     The full name of the student.
     * @param nationality The nationality of the student.
     * @param birthDate The birth date of the student, represented as a LocalDate object.
     * @param gender    The gender of the student, represented as a character ('M' for male, 'F' for female, etc.).
     */
    public Student(String regNo, String course, String names, String nationality, LocalDate birthDate, char gender) {
        super(names, nationality, birthDate, gender);  // Call to Person constructor
        this.regNo = regNo;
        this.course = course;
    }

    // Getter method for the course
    public String getCourse() {
        return course;
    }

    // Setter method for the course
    public void setCourse(String course) {
        this.course = course;
    }

    // Getter method for the registration number
    public String getRegNo() {
        return regNo;
    }

    // Setter method for the registration number
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    // Overriding the displayDetails() method from the Person class
    @Override
    public void displayDetails() {
        System.out.println(this.toString());
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return String.format("""
                             %s's Details:
                             ********************************************************
                             Student Number: %s
                             Course: %s
                             Nationality: %s
                             Date of Birth: %s
                             Gender: %s
                             ********************************************************
                             """,
                            getNames(), getRegNo(), getCourse(), getNationality(),
                            getBirthDate(), getGender() == 'M' ? "Male" : "Female");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create and display student details
        Student student1 = new Student("EICN-0001", "Computer Science",
                                        "Jane Doe", "Kenyan", LocalDate.of(1995, 5, 15), 'F');
        student1.displayDetails();  // Display student details

        // Create and display basic person details
        Person person1 = new Person("John Smith", "Canadian", LocalDate.of(1990, 3, 25), 'M');
        person1.displayDetails();
    }
}
