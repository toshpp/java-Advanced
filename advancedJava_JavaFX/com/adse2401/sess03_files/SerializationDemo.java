package com.adse2401.sess03_files;
import com.classes.Car; // Import the Car class

import java.io.*; // Import necessary classes for serialization

/**
 * Java program to demonstrate serialization and deserialization
 * of a Car object.
 * @author USER
 */
public class SerializationDemo {
    // Method to serialize a Car object to a file
    public static void serializeCar(Car car, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(car);
            System.out.println("Successfully serialized " + car);
        } catch (IOException ioe) {
            System.err.println("Serialization failed due to: " + ioe.getLocalizedMessage());
        }
    }

    // Method to deserialize a Car object from a file
    public static Car deserializeCar(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization failed due to: " + e.getLocalizedMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Subaru", "Legacy", 2017);

        // Invoke the serializeCar method to serialize the car details to file
        String fileName = "car.txt";
        serializeCar(car, fileName);

        // Invoke the deserializeCar method to deserialize the car details from the file
        Car deserializedCar = deserializeCar(fileName);

        // Display the car details if the car object is not null
        if (deserializedCar != null) {
            System.out.println("Deserialization successful and details displayed below:\n" + deserializedCar);
        }
    }
}
