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
public class Food
{
  protected String name ;
  protected  LocalDate expirationDate;
    
    public Food (String name, LocalDate expirationDate)
    {
       this.name=name;
       this.expirationDate=expirationDate;
    }
//get date
    public LocalDate getExpirationDate()
    {
        return expirationDate;
    }
//set date
    public void setExpirationDate(LocalDate expirationDate)
    {
        this.expirationDate = expirationDate;
    }
    
    //get name

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return String.format("""
                            Food details:
                            Food name: %s
                            Food Expiration Date %S
                             """,
                this.getName(),this.getExpirationDate());
    }
    
    
}
    