/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comadse2401_SESS02_generics;
import com.classes.Drink;
import com.classes.Juice;
import com.classes.Fruits;
import java.time.LocalDate;
/**
 *
 * @author USER
 */
public class GenericClassInheritanceDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //create a fruit object
        Fruits orange = new Fruits("Sweet", 150.0f, "Orange", LocalDate.now().plusDays(7));

        //create an orange container
        FoodContainer<Fruits> orangeContainer =new FoodContainer<>(orange);
        
        // Imvoke methods from both the container and foodContainer classes
        orangeContainer.displayItemInfo(); //
        orangeContainer.displayExpirationDate();
        
        //craete a drink object
        
        //create an juice container
        
        //invoke methods from both the container and foodContainer classes
          // display the juices details
          // Dispaly the juices volume
          
        Juice orangeJuice = new Juice("Orange", 55.0f, "Afia Apple", 350.0f);
        DrinkContainer<Juice> orangeJuiceBottle = new DrinkContainer<>(orangeJuice);
        orangeJuiceBottle.displayVolume();
        orangeJuiceBottle.displayItemInfo();
    }
        
        
    }
    
}
