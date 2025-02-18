/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangle;


public class Triangle
        
{
    protected float height;
    protected float base;
    
    // constructor that takes bas and height as input and throws an exception if either value is less than or equal to 0
     public Triangle(float base, float height){
    if (height <=0 || base <=0 ){
        throw new UnsupportedOperationException("must be positive and greate than zero");
    }
    this.height=height;
    this.base=base;
    

  }
  // getter method for the height
     public float getHeight(){
         return height;
     }
     
     // setter method for the height 
     public void setHeight(float height){
         this.height=height;

     }
     
     //getter method for the base
     public float getBase(){
         return base;
     }
     //setter method for the base
     public void setBase(float base){
         
         this.base=base;
     }
     
     //method to calculate the area of the trinagle
     public float calcArea(){
         return 0.5f *this.base*this.height;
     }
     
     //method to calculate the perimeter of the triangle
     public float calcPerimeter(){
         return 3* base;
     }

   
    
}
