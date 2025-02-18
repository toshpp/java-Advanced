/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comadse2401_SESS02_generics;

import java.util.Scanner;
import com.classes.SimpleCircle;

public class GenericClassDemo {

    public static void main(String[] args) {
        // Declare Generic Objects
        GenericClass<String> genString = new GenericClass<>("hello");
        GenericClass<Byte> genByte;
        GenericClass<Float> genFloat = new GenericClass<>(56.78f);
        GenericClass<SimpleCircle> genCircle;

        // Instantiate the generic objectssub
        genByte = new GenericClass<>((byte) 32);

        // Prompt the user for the radius of the circle
        System.out.println("Please enter the radius of the circle in cm..->");
        float rad = new Scanner(System.in).nextFloat();  // Get user input for the radius
        genCircle = new GenericClass<>(new SimpleCircle(rad));  // Pass rad directly to SimpleCircle

        // Display the contents and types of the various generic objects created above
        System.out.println("genString's type is -> " + genString.showType() +
                " and its value is: " + genString.getVar());
        System.out.println("genByte's type is -> " + genByte.showType() +
                " and its value is: " + genByte.getVar());
        System.out.println("genFloat's type is -> " + genFloat.showType() +
                " and its value is: " + genFloat.getVar());
        System.out.println("genCircle's type is -> " + genCircle.showType() +
                " and its radius is: " + genCircle.getVar().getRadius());
        
        System.out.println("genCircle's type is -> " + genCircle.showType() +
                "\nRadius: " + genCircle.getVar().getRadius() +
                "\nArea: " + genCircle.getVar().calcArea() +
                "\nCircumference: " + genCircle.getVar().calcCircumference());
    }
}


//todo modify line 37 to dispaly the circles
// 1 radius
//2 Area
// 3 Circumference
//4 its type