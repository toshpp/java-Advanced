/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classes;

/**
 *
 * @author USER
 */
public class Juice extends Drink
        
{
    protected String Flavour;
    protected float price;
    
    public Juice (String flavour, float price, String name, float volume)
    {
        super(name, volume);
        this.Flavour=flavour;
        this.price=price;
    }

    //get flavour
    public String getFlavour()
    {
        return Flavour;
    }
    
    //set flavour

    public void setFlavour(String Flavour)
    {
        this.Flavour = Flavour;
    }
    
    //get price

    public float getPrice()
    {
        return price;
    }
    
    //set price

    public void setPrice(float price)
    {
        this.price = price;
    }
    
    
    @Override

    public String getName()
    {
        return Name;
    }
    
    @Override

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public float getVolume()
    {
        return volume;
    }
    
    public void setVolume(float volume)
    {
        this.volume = volume;
    }
    
     @Override
    public String toString()
    {
        return String.format("""
                             Juice details:
                             Juice name: %s
                             Juice volume (Litres): %.2f
                             Juice flavours: %s
                             Juice price: %.2f
                             """,
                             this.getName(),
                             this.getVolume(),
                             this.getFlavour(),
                             this.getPrice());
    }
    
    
    
    
    
    
    
}
