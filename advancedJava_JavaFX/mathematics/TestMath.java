/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathematics;

/**
 *
 * @author USER
 */
public class TestMath {
    public static void main (String[]args){
        if (args.length==2){
            Mathematic objmath=new Mathematic();
            try{
                objmath.divide(Integer.parseInt(args[0]),
                Integer.parseInt(args[1]));
            }
            
            catch(ArithmeticException e) {
                System.out.println("Error:" + e.getMessage());
        }
        
    }
        else{
            System.out.println("usage : java mathematics <number1> <number2>");
        }
        
            System.out.println("Back to maintain");
    }
        
    
}
