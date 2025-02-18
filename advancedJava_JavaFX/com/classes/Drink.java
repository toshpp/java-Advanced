/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classes;

/**
 *
 * @author USER
 */
public class Drink
{
  protected  String Name;
  protected   float volume;
  
  //constructor
  public Drink(String Name, float Volume){
      this.Name="";
      this.volume=0.0f;
         
  }
  //get volume
  public float getvolume(){
      return volume;
  }
  
  //set volume
  public void setvolume(float volume){
      this.volume=volume;
  }
  //get name
  public String getName(){
      return Name;
  }

    public void setName(String Name)
    {
        this.Name = Name;
    }
 
  
  @Override 
  public String toString(){
      return String.format("""
                           Drink details:
                           Drink name:%s
                           Drink volume (litres): %.2f
                           """,
                           this.getName(),this.getvolume());
              
              
  }
  
  
    
}
