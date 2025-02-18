
package comadse2401_SESS02_generics;
import com.classes.Food;

/**
 *Specialized generic class FoodContainer that only holds items of type T
 * which extends the food class
 * @author USER
 * @param <T>
 */
public class FoodContainer<T extends Food>extends Container<T>
{
    public FoodContainer(T item)
    {
        super(item);
    }
    
    //method to display details about food items
    public void displayExpirationDate()
    {
        System.out.println("Expiration date of" + item.getName()+":"
                  + item.getExpirationDate());
    }
    
}
