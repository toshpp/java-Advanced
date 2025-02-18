package com.adse2401.ssess01_java_utility_apis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Java program that demonstrates some of the concrete classes that implement 
 * the List interface (like ArrayList).
 * @author USER
 */
public class ListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a list of fruits
        List<String> fruits = new ArrayList<>();
        fruits.add("Apples");
        fruits.add("Mangoes");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Tomatoes");
        fruits.add("Kiwis");
        fruits.add("Bananas");

        // Display the list of fruits using a for-each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Create a list of students
        List<Student> javaStudents = new ArrayList<>();

        // Enroll/add students 
        javaStudents.add(new Student("EICN-0001", "Java Professional Programming", 
            "Jane Doe", LocalDate.of(1992, 4, 28), 'F', "Kenyan"));
        
        javaStudents.add(new Student("EICN-0002", "Java Professional Programming", 
            "John Doe", LocalDate.of(1991, 3, 22), 'M', "Kenyan"));

        javaStudents.add(new Student("EICN-0003", "Java Professional Programming", 
            "Jessy Tarrur", LocalDate.of(2000, 3, 22), 'M', "Kenyan"));

        // Display the details of the above students
        for (Student student : javaStudents) {
            student.displayDetails();
        }

        // 2 students drop from the course (using the correct indexes)
        javaStudents.remove(1);  // Removes 2nd student
        javaStudents.remove(1);  // Removes 3rd student (index shifts after removal)

        // Display the number of students left in the class
        System.out.println("After the 2nd and 3rd students dropped, the class has " 
                + javaStudents.size() + " students.");

        // Enroll 3 new students
        javaStudents.add(new Student("EICN-1007", "C# Programming", 
            "Sheila Josiah", LocalDate.of(1993, 8, 4), 'F', "Uganda"));
        
        javaStudents.add(new Student("EICN-1008", "C# Programming", 
            "Sheila Josiah", LocalDate.of(1993, 8, 4), 'F', "Uganda"));
        
        javaStudents.add(new Student("EICN-1009", "Java Professional Programming", 
            "Sheila Josiah", LocalDate.of(1993, 8, 4), 'F', "Uganda"));
        // Display the student details using an iterator

        for (Student student : javaStudents)
        {
            student.displayDetails();
        }
    }
}

// Assume a Student class is defined like this:
class Student {
    private final String id;
    private final String course;
    private final String name;
    private final LocalDate dob;
    private final char gender;
    private final String nationality;

    public Student(String id, String course, String name, LocalDate dob, char gender, String nationality) {
        this.id = id;
        this.course = course;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.nationality = nationality;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course + 
                           ", Date of Birth: " + dob + ", Gender: " + gender + 
                           ", Nationality: " + nationality);
    }
}
