/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

/**
 *
 * @author USER
 */
public class Rectangle{
        //protected fieldss for witdh  and height
        protected float width;
        protected float length;
        
        //constructor that throws an exeception if widyh and height of the rectangle is invalid (<=0)
        
        public Rectangle (float width,float length){
            if  (width <=0 || length <=0){
                // throw an exceptiion if iwidth is zero or negative
                throw new UnsupportedOperationException("Width and height must be positive and greater than zero.");
                
            }
            
            // iniatialize tyhe length and the width if valid
            this.width=width;
            this.length=length;

            
        }
        
        //getter method for the width 
        public float getWidth(){
            return width;
        }
        
        //setter method for the width , which will also throws an exception for invalid input
        public void setWidth(float width){
            
            this.width=width;
        }
        
        // getter method for the length
        public float getLength(){
            return length;
            
        }
        
        //setter method for the length , which also throws an exception for invalid input 
        public void setLength(float length){
            
            this.length=length;
        }
        
        //method to calculate the  area of the rectangle 
        public float calcArea(){
            return this.width * this.length;
        }
        
        // method to calculate the perimeter of the rectangle
        public float calcPerimeter(){
            return 2 *(this.width+this.length);
        }
}


