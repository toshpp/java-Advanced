package com.classes;

/**
 * This class represents a SimpleCircle with methods to calculate the area and circumference.
 * It provides getter and setter methods for the radius.
 * 
 * @author USER
 */
public class SimpleCircle {
    
    // Protected field for the radius
    protected float radius;

    // Constructor that throws an exception if the radius is invalid (<= 0)
    public SimpleCircle(float radius) {
        if (radius <= 0) {
            // Throw an exception if the radius is zero or negative
            throw new UnsupportedOperationException("Radius must be positive and greater than zero.");
        }
        // Properly initialize the radius if valid
        this.radius = radius;
    }

    // Getter method for the radius
    public float getRadius() {
        return radius;
    }

    // Setter method for the radius, which also throws an exception for invalid input
    public void setRadius(float radius) {
       
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public float calcArea() {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    // Method to calculate the circumference of the circle
    public float calcCircumference() {
        return (float) (Math.PI * (radius * 2));
    }
}
