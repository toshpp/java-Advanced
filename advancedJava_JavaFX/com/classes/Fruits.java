/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classes;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Fruits extends Food
{
    protected String taste;
    protected float weight;
    
    public Fruits (String name, LocalDate expirationDate){
        super(name, expirationDate);
        
    }
    public Fruits (String taste, float weight, String name , LocalDate expirationDate)
    {
        super(name, expirationDate);
        this.taste=taste;
        this.weight=weight;
        
    }

    // get taste
    public String getTaste()
    {
        return taste;
    }

    // set taste
    public void setTaste(String taste)
    {
        this.taste = taste;
    }
    
    //get weight

    public float getWeight()
    {
        return weight;
    }
    
    //set weight

    public void setWeight(float weight)
    {
        this.weight = weight;
    }
    
    
    @Override
    public String getName()
    {
        return name;
    }
    
    @Override

    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override

    public LocalDate getExpirationDate()
    {
        return expirationDate;
    }
    
    @Override

    public void setExpirationDate(LocalDate expirationDate)
    {
        this.expirationDate = expirationDate;
    }
    
    
    @Override
    public String toString()
    {
        return String.format("""
                             Fruit details:
                             Fruit name: %s
                             Fruit Expiration Date %s
                             Taste: %s
                             Weight: %.2f
                             """, 
                             this.getName(),
                             this.getExpirationDate(),
                             this.getTaste(),
                             this.getWeight()); 
    }
    
    
    
    
    
    
    
    
    
    
}
