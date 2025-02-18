/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

public class RectangleDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // create a rectangle object with width 5 and height 10
        Rectangle rectangle =new Rectangle (5.0f, 10.0f);
        
        // dispaly the width and the height of the reactangle
        System.out.println("Width:" + rectangle.getWidth());
        System.out.println("Length" + rectangle.getLength());
        
        // calculate and display the area of the rectangle
        System.out.println("Area" + rectangle.calcArea());
        
        //calculate and display the perimeter of the rectangle
        System.out.println("Perimeter" + rectangle.calcPerimeter());
    }
    
}
