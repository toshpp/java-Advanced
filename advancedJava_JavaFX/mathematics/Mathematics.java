/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathematics;

/**
 *
 * @author USER
 */
public class Mathematics {
     public void divide (int num1, int num2){
         try{
             System.out.println("Division is:" + (num1/num2));
     }
         catch(ArithmeticExeption){
             System.out.println("Error:"+e.getMessage());
         }
             System.out.println("Method execution completed");
     }
    public static void main(String[] args) {
        if (args.length==2){
            Mathematics objMath =new Mathematics();
            objMath.divide(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        }
        else {
            System.out.println("usage :java mathematics <num1> <num2>");
        }
    }
} 
  
