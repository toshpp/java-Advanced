/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classes;

import java.time.LocalDate;
/**
 * The abstract class{@code Person} represents a person with common
 * attributes or properties such names, birthdate, gender (binary) and
 * nationality. it provides a basic structure for its subclass and includes
 * getter and setter methods for these attributes
 * the class also defines an abstract method {@code displayDetails()} that must
 * be implemented by any concrete subclass
 * <p>This class can be extended by other classes that represent more specific
 * types of persons or people(e.g Student,Employee) by providing additional
 * attributes or behaviours.
 * </P>
 * 
 * @author peter irungu
 */
public abstract class person
{
    /**
    *
    * The full name of the person
    */
    protected String names;
    
    /**
    *
    * The persons nationality
    */
    protected String nationality;
    
    /**
    *
    * The persons Date of birth
    */
    protected LocalDate birthDate;
    
    /**
    *
    * The persons gender F for female and M for males
    */
    protected char gender;
    
    /**
    *
    * Default constructor for the {@code Person} class]
    * <p>
    * Initializes the object with no specific values or fields
    * this constructor can be used for subclasses that will set values later.
    * </p>
    */
    public person()
    {
    }
    
    /**
     * 
     * @param names the persons full name
     * @param nationality the persons nationality
     * @param birthDate the persons date of birth
     * @param gender the persons gender (f or m)
     */
    public person(String names, String nationality, LocalDate birthDate, char gender)
    {
        this.names = names;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.gender = gender;
    }
    
    /**
     * retrieves or fetches the persons full name.
     * @return the persons full name
     */
    public String getNames()
    {
        return names;
    }
    
    /**
     * Sets the persons name
     * @param names the full names of the person to be set
     */
    public void setNames(String names)
    {
        this.names = names;
    }

    /**
     * retrieves or fetches the persons nationality.
     * @return the persons nationality
     */
    public String getNationality()
    {
        return nationality;
    }

    /**
     * Sets the persons nationality
     * @param nationality the nationality of the person to be set
     */
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    /**
     * retrieves or fetches the persons date of birth.
     * @return the persons date of birth
     */
    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    /**
     * Sets the persons date of birth
     * @param birthDate the birthDate of the person to be set
     */
    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }
    
    /**
     * retrieves or fetches the persons gender.
     * @return the persons gender as char
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * Sets the persons gender
     * @param gender the gender of the person to be set
     */    
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    
    /**
     * abstract method to display the details of the person.
     * <p>
     * Concrete subclasses must provide an implementation of this method
     * defining how the persons details should be displayed.
     * </p>
     */
    public abstract void displayDetails();
    

}
