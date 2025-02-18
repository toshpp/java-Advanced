package com.adse2401.ssess01_java_utility_apis;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Java program that demonstrates an unmodifiable implementation of the list
 * interface
 * @author USER
 */
public class unmodifiableListDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Create a mutable list
        List<String> mutableList = new ArrayList<>();
        mutableList.add("apple");
        mutableList.add("banana");
        mutableList.add("cherry");
        mutableList.add("Durian");
        
        // Create an unmodifiable view of the fruit list
        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);
        
        // Try reading the elements (fruits) from the unmodifiable list
        System.out.println("The first fruit/element in the unmodifiable list is: " + unmodifiableList.get(0));
        
        // Try to add new fruit to the unmodifiable list
        try
        {
            unmodifiableList.add("Mango");
        }
        catch (UnsupportedOperationException uoe)
        {
            System.err.println("Modification attempt failed due to: " + uoe.getLocalizedMessage());
        }
    }
}
