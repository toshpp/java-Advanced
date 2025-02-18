
package com.classes;

import java.io.Serializable;

/**
 *java class to model a a car 
 * @author USER
 */
public class Car implements Serializable
{
    private static final long serialVersionUID =1L;//used 4 serialisable classes
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    @Override
    public String toString()
    {
        return String.format("Car Details"
                            +"\n-------------"
                            +"\nMake:%s"
                            +"\nModel%s"
                            +"\nYear:%d"
                            +"\n------ ",
                            this.getMake(),this.getModel(),this.getYear());
                            
    }
    
}
