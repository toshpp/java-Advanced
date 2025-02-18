/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TriangleDemo
{
    public static void main(String[]args){
        //create a scannner object to take in user input
        Scanner scanner =new Scanner(System.in);
        
        //prompt the user for the base of the tringle
        System.out.println("please enter the base of the triangle");
        float base =scanner.nextFloat();
        
        //prompt the user for the height of the height of the triangle
        System.out.println("please enter the height of the triangle");
        float height =scanner.nextFloat();
        
        //create  a triangle object using the user input
        Triangle triangle =new Triangle(base,height);
        
        //dispaly the base and the height of the triangle
        System.out.println("Bae" +triangle.getBase());
        System.out.println("Height" + triangle.getHeight());
        
        //calculate the area of the triangle
        System.out.println("Area" + triangle.calcArea());
        
        //calculate the perimetr of the triangle
        System.out.println("Perimeter"+ triangle.calcPerimeter());
    }
    
}
