/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comadse2401_SESS02_generics;
import com.classes.Drink;

/**
 *
 * @author USER
 * @param <T>
 */
public class DrinkContainer<T extends Drink> extends Container<T>{
    public DrinkContainer(T item){
        super(item);
        
    }
    // mthod to dispaly drink volume
    public void displayVolume(){
        System.out.println("volume of" + item.getName() +"is" +item.getvolume());
    }
}
    

    

